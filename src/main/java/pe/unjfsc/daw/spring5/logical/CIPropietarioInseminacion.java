package pe.unjfsc.daw.spring5.logical;

import java.util.HashSet;

import pe.unjfsc.daw.spring5.entity.CEPropietarioInseminacion;

public interface CIPropietarioInseminacion {
	public void savePropiInseminacion(CEPropietarioInseminacion pCEPropietario);
	public void updatePropiInseminacion(CEPropietarioInseminacion pCEPropietario);
	public void deletePropieInseminacion(int codigo);
	
	public HashSet<CEPropietarioInseminacion> consultaAll();
	public CEPropietarioInseminacion showBycodigo(int codigo);


}
