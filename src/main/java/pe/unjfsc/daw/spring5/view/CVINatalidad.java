package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.logical.impl.CMANatalidad;
import pe.unjfsc.daw.spring5.logical.impl.CMINatalidad;

public class CVINatalidad {
	private static final Logger log = LoggerFactory.getLogger("CVNatalidad");
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-natalidad.xml");
		log.info("[EVL] Context: {}",oCntx);
		
		CMINatalidad oCMINatalidad = (CMINatalidad) oCntx.getBean("idCMINatalidad");
		//CENatalidad oCENatalidad = new CENatalidad(2020, LocalDate.of(2020, 10, 4), 600, 2.00, "Criollo", "Hembra", 7001, 8001, 1);
		
		//log.info("[EVL] Todos los registros : {}" , oCMINatalidad.consultaAll());
		//log.info("[EVL] Solo un registro : {}" , oCMINatalidad.consultarByCuia(2002));
		//oCMINatalidad.updateNatalidad(oCENatalidad);
		log.info("[EVL] Todos los registros : {}" , oCMINatalidad.consultaAll());
		//oCMNatalidad.deleteNatalidad(2002);
		//log.info("[EVL] Todos los registros : {}" , oCMINatalidad.consultarByCuia(2001));
		//oCMINatalidad.deleteNatalidad(2002);
		//log.info("[EVL] Todos los registros : {}" , oCMINatalidad.consultaAll());
		//oCMINatalidad.updateNatalidad(oCENatalidad);
		//oCMINatalidad.saveNatalidad(oCENatalidad);
		//log.info("[EVL] Todos los registros : {}" , oCMINatalidad.consultaAll());
		((ConfigurableApplicationContext) oCntx).close();

	}

}
