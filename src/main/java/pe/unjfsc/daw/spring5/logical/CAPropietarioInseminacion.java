package pe.unjfsc.daw.spring5.logical;

import java.util.HashSet;

import pe.unjfsc.daw.spring5.entity.CEPropietarioInseminacion;


public abstract class CAPropietarioInseminacion {

	public abstract void savePropiInseminacion(CEPropietarioInseminacion pCEPropiInseminacion);
	public abstract void updatePropiInseminacion(CEPropietarioInseminacion pCEPropiInseminacion);
	public abstract void deletePropieInseminacion(int codigo);
	public abstract HashSet<CEPropietarioInseminacion> showAll();
	public abstract CEPropietarioInseminacion showBycodigo(int codigo);
}
