package pe.unjfsc.daw.spring5.logical.impl;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;
import pe.unjfsc.daw.spring5.logical.CIGanadoVacuno;

public class CMIGanadoVacuno implements CIGanadoVacuno{

	private static final Logger log = LoggerFactory.getLogger("CMGanadoVacuno");
	
	private CEGanadoVacuno moCEGanadoVacuno;
	private HashSet<CEGanadoVacuno> hashGanadoVacuno;
	private CEGanadoVacuno oCEGanadoVacunoResponse;
	
	private String etapa = "";
	private LocalDate fechActual = LocalDate.now();
	
	public CMIGanadoVacuno() {
		hashGanadoVacuno = new HashSet<CEGanadoVacuno>();
		hashGanadoVacuno.add(new CEGanadoVacuno(2001,"Maria", LocalDate.of(2017, 3, 7), "Hembra", 2, "Adulto", 450.0, 140.0, "Producción", "Normal", "Heredord", "Leche", "Autoctono", 0, 0));
		hashGanadoVacuno.add(new CEGanadoVacuno(2002, "Juana", LocalDate.of(2017, 3, 5), "Hembra", 2, "Adulto", 450.0, 140.0, "Producción", "Normal", "Hereford", "Leche", "Comprado", 0, 0));
	}
	@Override
	public void saveGanadoVacuno(CEGanadoVacuno poCEGanadoGacuno) {
		log.info("GUARDANDO REGISTRO CON EL CUIA "+poCEGanadoGacuno.getCuia());
		hashGanadoVacuno.add(poCEGanadoGacuno);
	}

	@Override
	public void updateGanadoVacuno(CEGanadoVacuno poCEGanadoVacuno) {
		Iterator<CEGanadoVacuno> it = hashGanadoVacuno.iterator();
		
		while(it.hasNext()) {
			moCEGanadoVacuno = it.next();
			if (moCEGanadoVacuno.getCuia() == poCEGanadoVacuno.getCuia()) {
				log.info("ACTUALIZANDO EL REGISTRO CON EL CUIA "+poCEGanadoVacuno.getCuia()+"...");
				
				moCEGanadoVacuno.setAliasGanadoVacuno(poCEGanadoVacuno.getAliasGanadoVacuno());
				moCEGanadoVacuno.setCuiaMadre(poCEGanadoVacuno.getCuiaMadre());
				moCEGanadoVacuno.setCuiaPadre(poCEGanadoVacuno.getCuiaPadre());
				moCEGanadoVacuno.setEdad(calcularEdad(poCEGanadoVacuno.getFecha_nacimiento()));
				moCEGanadoVacuno.setEstaActivo(poCEGanadoVacuno.getEstaActivo());
				moCEGanadoVacuno.setEstaAnim(poCEGanadoVacuno.getEstaAnim());
				moCEGanadoVacuno.setFecha_nacimiento(poCEGanadoVacuno.getFecha_nacimiento());
				moCEGanadoVacuno.setEtapa(asignarEtapa(calcularEdad(poCEGanadoVacuno.getFecha_nacimiento())));
				moCEGanadoVacuno.setGenotipo(poCEGanadoVacuno.getGenotipo());
				moCEGanadoVacuno.setOrigen(poCEGanadoVacuno.getOrigen());
				
				
			}
		}
		
	}

	@Override
	public void deleteGanadoVacuno(int CUIA) {
		
		Iterator<CEGanadoVacuno> it = hashGanadoVacuno.iterator();
		
		while(it.hasNext()) {
			moCEGanadoVacuno = it.next();
			
			if (moCEGanadoVacuno.getCuia() == CUIA) {
				hashGanadoVacuno.remove(moCEGanadoVacuno);
				break;
			}
		}
		
	}

	@Override
	public HashSet<CEGanadoVacuno> consultaAll() {
		log.info("REGISTROS EXISTENTES...");
		return hashGanadoVacuno;
	}

	@Override
	public CEGanadoVacuno showByCUIA(int CUIA) {
		log.info("REGISTRO CON EL CUIA "+CUIA+":");
		Iterator<CEGanadoVacuno> it = hashGanadoVacuno.iterator();
		
		while(it.hasNext()) {
			moCEGanadoVacuno = it.next();
			if (moCEGanadoVacuno.getCuia() == CUIA) {
				oCEGanadoVacunoResponse = moCEGanadoVacuno;
				break;
			}
		}
		return oCEGanadoVacunoResponse;
	}

	protected int calcularEdad(LocalDate fechaNaci) {		
		int edad = (int) ChronoUnit.MONTHS.between(fechaNaci, fechActual);
		return edad;
	}
	protected String asignarEtapa(int edad) {
					
		if(edad <= 4) {
			etapa = "Ternero(a)";
		}else if(edad > 4 && edad <=12) {
			etapa = "Destete";
		}else if(edad > 12 && edad <=24) {
			etapa = "Becerro(a)";
		}else if(edad >= 24) {
			etapa = "Adulto";
		}
		return etapa;
	}	
}
