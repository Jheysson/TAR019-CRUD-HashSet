package pe.unjfsc.daw.spring5.logical;

import java.util.HashSet;

import pe.unjfsc.daw.spring5.entity.CENatalidad;

public interface CINatalidad {
	public void saveNatalidad(CENatalidad pCENatalidad);
	public void updateNatalidad(CENatalidad pCENatalidad);
	public void deleteNatalidad(int CUIA);
	
	public HashSet<CENatalidad> consultaAll();
	public CENatalidad consultarByCuia(int CUIA);
}
