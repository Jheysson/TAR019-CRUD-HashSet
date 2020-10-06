package pe.unjfsc.daw.spring5.logical.impl;

import java.util.HashSet;
import java.util.Iterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEPropietarioInseminacion;
import pe.unjfsc.daw.spring5.logical.CIPropietarioInseminacion;

public class CMAPropietarioInseminacion implements CIPropietarioInseminacion{
	
private static final Logger log = LoggerFactory.getLogger("CMPropietarioInseminacion");
	
	private CEPropietarioInseminacion moCEPropietarioInse;
	private CEPropietarioInseminacion oCEPropietarioInseRequest;
	private CEPropietarioInseminacion oCEPropietarioInseResponse;
	
	private HashSet<CEPropietarioInseminacion> moHashCEPropietario;
	
	public CMAPropietarioInseminacion() {
		moHashCEPropietario = new HashSet<CEPropietarioInseminacion>();
		moHashCEPropietario.add(new CEPropietarioInseminacion(120, 620.00, 1.61, "Establo 1", 20.00, "20/09/2020", 1, "Hereford","N/O"));
		moHashCEPropietario.add(new CEPropietarioInseminacion(220, 600.00, 1.63, "Establo 2", 24.00, "21/09/2020", 1, "Charolais","N/O"));
		moHashCEPropietario.add(new CEPropietarioInseminacion(320, 618.00, 1.54, "Establo 3", 18.00, "22/09/2020", 1, "Brahman","N/O"));
		moHashCEPropietario.add(new CEPropietarioInseminacion(420, 578.00, 1.72, "Establo 4", 22.00, "23/09/2020", 1, "Lomousin","N/O"));
		moHashCEPropietario.add(new CEPropietarioInseminacion(520, 588.00, 1.68, "Establo 5", 25.00, "24/09/2020", 1, "Gyrolando","N/O"));
		}

	@Override
	public void savePropiInseminacion(CEPropietarioInseminacion pCEPropietario) {
		
		log.info("GUARDANDO EL REGISTRO CON EL CODIGO" + pCEPropietario.getcodigo()+"...");
		oCEPropietarioInseRequest.setcodigo(pCEPropietario.getcodigo());
		oCEPropietarioInseRequest.setPeso(pCEPropietario.getPeso());
		oCEPropietarioInseRequest.setTalla(pCEPropietario.getTalla());
		oCEPropietarioInseRequest.setLugar(pCEPropietario.getLugar());
		oCEPropietarioInseRequest.setPrecio(pCEPropietario.getPrecio());
		oCEPropietarioInseRequest.setFechcompra(pCEPropietario.getFechcompra());
		oCEPropietarioInseRequest.setEstado(pCEPropietario.getEstado());
		oCEPropietarioInseRequest.setGenotipo(pCEPropietario.getGenotipo());
		oCEPropietarioInseRequest.setObse(pCEPropietario.getObse());
		moHashCEPropietario.add(oCEPropietarioInseRequest);
	}
	
	

	@Override
	public void updatePropiInseminacion(CEPropietarioInseminacion pCEPropietario) {
		
		Iterator<CEPropietarioInseminacion> it = moHashCEPropietario.iterator();
		while (it.hasNext()){
			moCEPropietarioInse = it.next();
			if(moCEPropietarioInse.getcodigo() == pCEPropietario.getcodigo()) {
				log.info("ACTUALIZANDO EL REGISTRO CON EL CODIGO "+pCEPropietario.getcodigo()+"...");
				moCEPropietarioInse.setcodigo(pCEPropietario.getcodigo());
				moCEPropietarioInse.setPeso(pCEPropietario.getPeso());
				moCEPropietarioInse.setTalla(pCEPropietario.getTalla());
				moCEPropietarioInse.setLugar(pCEPropietario.getLugar());
				moCEPropietarioInse.setPrecio(pCEPropietario.getPrecio());
				moCEPropietarioInse.setFechcompra(pCEPropietario.getFechcompra());
				moCEPropietarioInse.setEstado(pCEPropietario.getEstado());
				moCEPropietarioInse.setGenotipo(pCEPropietario.getGenotipo());
				moCEPropietarioInse.setObse(pCEPropietario.getObse());
			}
		}
		log.info("Verificar actualización: {}",showAll());
	}

	@Override
	public void deletePropieInseminacion(int codigo) {
		log.info("ELIMINANDO EL REGISTRO CON EL CODIGO "+ codigo +"...");
		Iterator<CEPropietarioInseminacion> it = moHashCEPropietario.iterator();
		while(it.hasNext()) {
			// moCENatalidad = new CENatalidad();
			moCEPropietarioInse = it.next();
			if(moCEPropietarioInse.getcodigo() == codigo) {
				moHashCEPropietario.remove(moCEPropietarioInse);
				break;
			}
		}
		
	}

	@Override
	public HashSet<CEPropietarioInseminacion> showAll() {
		return moHashCEPropietario;
	}

	@Override
	public CEPropietarioInseminacion showBycodigo(int codigo) {
		log.info("BUSCANDO EL REGISTRO "+ codigo +"......");
		
		
		Iterator<CEPropietarioInseminacion> it = moHashCEPropietario.iterator();
		while(it.hasNext()) {
			// moCENatalidad = new CENatalidad();
			moCEPropietarioInse = it.next();
			if(moCEPropietarioInse.getcodigo() == codigo) {
				oCEPropietarioInseResponse = moCEPropietarioInse;
				break;
			}
		}
		log.info("{}",oCEPropietarioInseResponse);
		return oCEPropietarioInseResponse;
	}

	public void setoCEPropietarioInseRequest(CEPropietarioInseminacion oCEPropietarioInseRequest) {
		this.oCEPropietarioInseRequest = oCEPropietarioInseRequest;
	}

	public void setoCEPropietarioInseResponse(CEPropietarioInseminacion oCEPropietarioInseResponse) {
		this.oCEPropietarioInseResponse = oCEPropietarioInseResponse;
	}
	
	}
