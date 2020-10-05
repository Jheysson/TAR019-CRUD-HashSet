package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.unjfsc.daw.spring5.logical.impl.CMAPropietarioInseminacion;

public class CVAPropietarioInseminacion {

private static final Logger log = LoggerFactory.getLogger("CVAPropietarioInseminacion");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("abstract-context-propietarioInseminacion.xml");
		
		log.info("Context: {}",oCntx);
		CMAPropietarioInseminacion oCMAPropiInse= (CMAPropietarioInseminacion) oCntx.getBean("idCMAPropiInseminacion");
		//CEPropietarioInseminacion oCEPropiInse=  new CEPropietarioInseminacion(520, 588.00, 1.68, "Establo actualizado", 25.00, "26/09/2020", 1, "Gyrolando","N/O");
		

		//Mostrar registros actuales
		log.info("Todos los registros: {}", oCMAPropiInse.consultaAll());
		
		//Actualizar un registro 
		//oCMIPropiInse.savePropiInseminacion(oCEPropiInse);
		
		log.info("[EVL] Todos los registros actuales: {}" , oCMAPropiInse.consultaAll());
		
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
