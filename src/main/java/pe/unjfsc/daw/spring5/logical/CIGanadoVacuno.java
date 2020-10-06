package pe.unjfsc.daw.spring5.logical;

import java.util.HashSet;

import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;

public interface CIGanadoVacuno {
	public void saveGanadoVacuno(CEGanadoVacuno poCEGanadoVacuno);
	public void updateGanadoVacuno(CEGanadoVacuno poCEGanadoVacuno);
	public void deleteGanadoVacuno(int CUIA);
	public  HashSet<CEGanadoVacuno> consultaAll();
	public CEGanadoVacuno showByCUIA(int CUIA);
}
