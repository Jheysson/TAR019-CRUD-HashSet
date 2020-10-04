package pe.unjfsc.daw.spring5.logical.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CENatalidad;
import pe.unjfsc.daw.spring5.logical.CINatalidad;
import pe.unjfsc.daw.spring5.model.CDNatalidad;

public class CMNatalidad  implements CINatalidad{
	private static final Logger log = LoggerFactory.getLogger("CMCrudHashSetLSA");
	private CENatalidad moCENatalidad;
	private CENatalidad oCENatalidadRequest;
	private CENatalidad oCENatalidadResponse;
	
	private HashSet<CENatalidad> moHashCENatalidad;
	
	public CMNatalidad() {
		moHashCENatalidad = new HashSet<CENatalidad>();
		moHashCENatalidad.add(new CENatalidad(2001,"2/10/2020", 200, 1.69, "Criollo", "Hembra", 3001, 4001, 1));
		moHashCENatalidad.add(new CENatalidad(2002,"3/10/2020", 210, 1.39, "Criollo", "Macho", 4001, 5001, 1));
	}
	
	@Override
	public void saveNatalidad(CENatalidad pCENatalidad) {
		log.info("GUARDANDO EL REGISTRO CON EL CUIA "+ pCENatalidad.getCUIA()+"...");
		moHashCENatalidad.add(pCENatalidad);		
	}

	@Override
	public void updateNatalidad(CENatalidad pCENatalidad) {
		log.info("ACTUALIZANDO EL REGISTRO CON EL CUIA "+ pCENatalidad.getCUIA()+"...");
		Iterator<CENatalidad> it = moHashCENatalidad.iterator();
		while(it.hasNext()) {
			// moCENatalidad = new CENatalidad();
			moCENatalidad = it.next();
			if(moCENatalidad.getCUIA() == pCENatalidad.getCUIA()) {
				moCENatalidad.setCUIA(pCENatalidad.getCUIA());
				moCENatalidad.setFechNacimiento(pCENatalidad.getFechNacimiento());
				moCENatalidad.setPeso(pCENatalidad.getPeso());
				moCENatalidad.setTalla(pCENatalidad.getTalla());
				moCENatalidad.setGenotipo(pCENatalidad.getGenotipo());
				moCENatalidad.setSexo(pCENatalidad.getSexo());
				moCENatalidad.setMadre(pCENatalidad.getMadre());
				moCENatalidad.setPadre(pCENatalidad.getPadre());
				moCENatalidad.setEstado(pCENatalidad.getEstado());
			}
		}
	}

	@Override
	public void deleteNatalidad(int CUIA) {
		log.info("ELIMINANDO EL REGISTRO CON EL CUIA "+ CUIA +"...");
		Iterator<CENatalidad> it = moHashCENatalidad.iterator();
		while(it.hasNext()) {
			// moCENatalidad = new CENatalidad();
			moCENatalidad = it.next();
			if(moCENatalidad.getCUIA() == CUIA) {
				moHashCENatalidad.remove(moCENatalidad);
				break;
			}
		}
		
	}

	@Override
	public HashSet<CENatalidad> consultaAll() {
		log.info("MOSTRANDO REGISTROS EXISTENTES");
		return moHashCENatalidad;
	}

	@Override
	public CENatalidad consultarByCuia(int CUIA) {
		log.info("MOSTRANDO EL REGISTRO "+ CUIA +"......");
		
		// CENatalidad moCENatalidadResult = new CENatalidad();
		
		Iterator<CENatalidad> it = moHashCENatalidad.iterator();
		while(it.hasNext()) {
			// moCENatalidad = new CENatalidad();
			moCENatalidad = it.next();
			if(moCENatalidad.getCUIA() == CUIA) {
				oCENatalidadResponse = moCENatalidad;
				break;
			}
		}
		return oCENatalidadResponse;
	}

	public void setoCENatalidadRequest(CENatalidad oCENatalidadRequest) {
		this.oCENatalidadRequest = oCENatalidadRequest;
	}

	public void setoCENatalidadResponse(CENatalidad oCENatalidadResponse) {
		this.oCENatalidadResponse = oCENatalidadResponse;
	}

}
