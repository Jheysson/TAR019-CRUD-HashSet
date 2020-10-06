package pe.unjfsc.daw.spring5.logical;

import java.util.HashSet;

import pe.unjfsc.daw.spring5.entity.CEGanadoEnfermo;

public abstract class CAGanadoEnfermo {
	public abstract void saveGanadoEnfermo (CEGanadoEnfermo pCEGanadoEnfermo);
	public abstract void updateGanadoEnfermo (CEGanadoEnfermo pCEGanadoEnfermo);
	public abstract void deleteGanadoEnfermo (int CUIA);
	
	public abstract HashSet<CEGanadoEnfermo> consultaAll();
	public abstract CEGanadoEnfermo consultarByCuia (int CUIA);

}
