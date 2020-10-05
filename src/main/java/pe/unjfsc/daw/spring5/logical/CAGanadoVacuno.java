package pe.unjfsc.daw.spring5.logical;

import java.util.HashSet;

import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;

public abstract class CAGanadoVacuno {
	public abstract void saveGanadoVacuno(CEGanadoVacuno poCEGanadoGacuno);
	public abstract void updateGanadoVacuno(CEGanadoVacuno poCEGanadoVacuno);
	public abstract void deleteGanadoVacuno(int CUIA);
	public abstract  HashSet<CEGanadoVacuno> consultaAll();
	public abstract CEGanadoVacuno showByCUIA(int CUIA);
}
