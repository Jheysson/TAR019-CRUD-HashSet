package pe.unjfsc.daw.spring5.logical;

import java.util.HashSet;

import pe.unjfsc.daw.spring5.entity.CENatalidad;

public abstract class CANatalidad {
	public abstract void saveNatalidad(CENatalidad pCENatalidad);
	public abstract void updateNatalidad(CENatalidad pCENatalidad);
	public abstract void deleteNatalidad(int CUIA);
	
	public abstract HashSet<CENatalidad> consultaAll();
	public abstract CENatalidad consultarByCuia(int CUIA);
}
