package pe.unjfsc.daw.spring5.logical;

import java.util.HashSet;

import pe.unjfsc.daw.spring5.entity.CEGanadoEnfermo;

public interface CIGanadoEnfermo {
	public void saveGanadoEnfermo (CEGanadoEnfermo pCEGanadoEnfermo);
	public void updateGanadoEnfermo (CEGanadoEnfermo pCEGanadoEnfermo);
	public void deleteGanadoEnfermo (int CUIA);
	
	public HashSet<CEGanadoEnfermo> consultaAll();
	public CEGanadoEnfermo consultarByCuia (int CUIA);
	

}
