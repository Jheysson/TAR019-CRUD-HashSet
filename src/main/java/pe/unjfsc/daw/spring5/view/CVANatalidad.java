package pe.unjfsc.daw.spring5.view;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CENatalidad;
import pe.unjfsc.daw.spring5.logical.impl.CMANatalidad;

public class CVANatalidad {
	private static final Logger log = LoggerFactory.getLogger("CVNatalidad");
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("abstract-context-natalidad.xml");
		log.info("[EVL] Context: {}",oCntx);
		
		CMANatalidad oCMANatalidad = (CMANatalidad) oCntx.getBean("idCMANatalidad");
		//CENatalidad oCENatalidad = new CENatalidad(2020, LocalDate.of(2020, 10, 4), 600, 2.00, "Criollo", "Hembra", 7001, 8001, 1);
		
		//log.info("[EVL] Todos los registros : {}" , oCMANatalidad.consultaAll());
		//log.info("[EVL] Solo un registro : {}" , oCMANatalidad.consultarByCuia(2002));
		//oCMANatalidad.updateNatalidad(oCENatalidad);
		log.info("[EVL] Todos los registros : {}" , oCMANatalidad.consultaAll());
		//oCMANatalidad.deleteNatalidad(2002);
		//log.info("[EVL] Todos los registros : {}" , oCMANatalidad.consultarByCuia(2001));
		//oCMANatalidad.deleteNatalidad(2002);
		//log.info("[EVL] Todos los registros : {}" , oCMANatalidad.consultaAll());
		//oCMANatalidad.updateNatalidad(oCENatalidad);
		//oCMANatalidad.saveNatalidad(oCENatalidad);
		//log.info("[EVL] Todos los registros : {}" , oCMANatalidad.consultaAll());
		((ConfigurableApplicationContext) oCntx).close();

	}

}
