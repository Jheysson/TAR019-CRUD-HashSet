package pe.unjfsc.daw.spring5.logical.impl;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEGanadoEnfermo;
import pe.unjfsc.daw.spring5.logical.CIGanadoEnfermo;

public class CMAGanadoEnfermo  implements CIGanadoEnfermo{
	private static final Logger Log = LoggerFactory.getLogger("CMCrudHashSetLSA");
	private CEGanadoEnfermo moCEGanadoEnfermo;
	private CEGanadoEnfermo oCEGanadoEnfermoRequest;
	private CEGanadoEnfermo oCEGanadoEnfermoResponse;
	
	private HashSet<CEGanadoEnfermo> moHashCEGanadoEnfermo;
	
	public CMAGanadoEnfermo() {
		moHashCEGanadoEnfermo = new HashSet<CEGanadoEnfermo> ();
		
		moHashCEGanadoEnfermo.add (new CEGanadoEnfermo(2001,"Mastitis",LocalDate.of(2020, 9, 25), "Mejora en proceso lento", 1));
		moHashCEGanadoEnfermo.add (new CEGanadoEnfermo(2002,"Hemolactea",LocalDate.of(2020, 9, 20), "Cuidad intensivo", 1));
		
	}

	@Override
	public void saveGanadoEnfermo(CEGanadoEnfermo pCEGanadoEnfermo) {
		Log.info("GUARDANDO EL REGISTRO CON EL CUIA"+ pCEGanadoEnfermo.getCUIA()+"...");
		moHashCEGanadoEnfermo.add(pCEGanadoEnfermo);
		
	}

	@Override
	public void updateGanadoEnfermo(CEGanadoEnfermo pCEGanadoEnfermo) {
		Log.info("ACTUALIZANDO EL REGISTRO CON EL CUIA"+ pCEGanadoEnfermo.getCUIA()+"..." );
		Iterator<CEGanadoEnfermo> it = moHashCEGanadoEnfermo.iterator();
		while (it.hasNext()) {
			moCEGanadoEnfermo = it.next();
			if(moCEGanadoEnfermo.getCUIA() == pCEGanadoEnfermo.getCUIA()) {
				moCEGanadoEnfermo.setCUIA(pCEGanadoEnfermo.getCUIA());
				moCEGanadoEnfermo.setEnfermedad(pCEGanadoEnfermo.getEnfermedad());
				moCEGanadoEnfermo.setFechIngreso(pCEGanadoEnfermo.getFechIngreso());
				moCEGanadoEnfermo.setObservacion(pCEGanadoEnfermo.getObservacion());
				moCEGanadoEnfermo.setEstado(pCEGanadoEnfermo.getEstado());
			}
			
			
		}
		
	}

	@Override
	public void deleteGanadoEnfermo(int CUIA) {
		Log.info("ELIMINANDO EL REGISTRO CON EL CUIA"+CUIA+"...");
		Iterator<CEGanadoEnfermo> it = moHashCEGanadoEnfermo.iterator();
		while(it.hasNext()) {
			moCEGanadoEnfermo = it.next();
			if(moCEGanadoEnfermo.getCUIA() == CUIA) {
				moHashCEGanadoEnfermo.remove(moCEGanadoEnfermo);
				break;
			}
		}
		
	}

	@Override
	public HashSet<CEGanadoEnfermo> consultaAll() {
		Log.info("MOSTRANDO REGISTROS EXISTENTES");
		return moHashCEGanadoEnfermo;
	}

	@Override
	public CEGanadoEnfermo consultarByCuia(int CUIA) {
		Log.info("MOSTRANDO EL REGISTRO"+ CUIA + "...");
		Iterator<CEGanadoEnfermo> it = moHashCEGanadoEnfermo.iterator();
		while(it.hasNext()) {
			moCEGanadoEnfermo = it.next();
			if(moCEGanadoEnfermo.getCUIA() == CUIA) {
				oCEGanadoEnfermoResponse = moCEGanadoEnfermo;
				break;
			}
		}
		
		return oCEGanadoEnfermoResponse;
		}
	public void setoCEGanadoEnfermoRequest (CEGanadoEnfermo oCECeGanadoEnfermoRequest) {
		this.oCEGanadoEnfermoRequest = oCECeGanadoEnfermoRequest;
	}
	public void setoCEGanadoEnfermoResponse (CEGanadoEnfermo oCEGanadoEnfermoResponse) {
		this.oCEGanadoEnfermoResponse = oCEGanadoEnfermoResponse;
	}
	}

	