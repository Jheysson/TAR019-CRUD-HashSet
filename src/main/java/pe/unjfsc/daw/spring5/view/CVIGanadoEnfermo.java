package pe.unjfsc.daw.spring5.view;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEGanadoEnfermo;
import pe.unjfsc.daw.spring5.logical.impl.CMAGanadoEnfermo;
import pe.unjfsc.daw.spring5.logical.impl.CMIGanadoEnfermo;

public class CVIGanadoEnfermo {

private static final Logger Log = LoggerFactory.getLogger("CVGanadoEnfermo");

public static void main (String[] args) {
	ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-ganadoEnfermo.xml");
	
	Log.info("[EVL] Context: {}",oCntx);
	CMIGanadoEnfermo oCMIGanadoEnfermo= (CMIGanadoEnfermo) oCntx.getBean("idCMIGanadoEnfermo");
	
	Log.info("Todos los registros: {}", oCMIGanadoEnfermo.consultaAll());
	
	CEGanadoEnfermo oCEGanadoEnfermo = new CEGanadoEnfermo(2002,"Mastitis", LocalDate.of(2020, 9, 1),"Mejora considerable", 1);
	oCMIGanadoEnfermo.updateGanadoEnfermo(oCEGanadoEnfermo);
	Log.info("Actualizando un registro: {}", oCMIGanadoEnfermo.consultaAll());
	
	Log.info("Verificar actualización: {}",oCMIGanadoEnfermo.consultaAll());
	
	int cuia = 2002;
	Log.info("Buscando registro con el CUIA "+cuia+" :{} ",oCMIGanadoEnfermo.consultarByCuia(cuia));
	
	Log.info("Verificar último registro: {}",oCMIGanadoEnfermo.consultaAll());
	
	oCMIGanadoEnfermo.deleteGanadoEnfermo(2001);
	
	Log.info("Verificar la eliminación: {}",oCMIGanadoEnfermo.consultaAll());
			((ConfigurableApplicationContext) oCntx).close();

		}

	}
