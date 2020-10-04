package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CENatalidad;
import pe.unjfsc.daw.spring5.logical.impl.CMNatalidad;

public class CVNatalidad {
	private static final Logger log = LoggerFactory.getLogger("CVNatalidad");
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-natalidad.xml");
		log.info("[EVL] Context: {}",oCntx);
		
		CMNatalidad oCMNatalidad = (CMNatalidad) oCntx.getBean("idCMNatalidad");
		CENatalidad oCENatalidad = new CENatalidad(2002, "4/10/2020", 600, 2.00, "Criollo", "Hembra", 7001, 8001, 1);
		
		//log.info("[EVL] Todos los registros : {}" , oCMNatalidad.consultaAll());
		//log.info("[EVL] Solo un registro : {}" , oCMNatalidad.consultarByCuia(2002));
		//oCMNatalidad.updateNatalidad(oCENatalidad);
		log.info("[EVL] Todos los registros : {}" , oCMNatalidad.consultaAll());
		//oCMNatalidad.deleteNatalidad(2002);
		//log.info("[EVL] Todos los registros : {}" , oCMNatalidad.consultarByCuia(2001));
		//oCMNatalidad.deleteNatalidad(2002);
		//log.info("[EVL] Todos los registros : {}" , oCMNatalidad.consultaAll());
		oCMNatalidad.updateNatalidad(oCENatalidad);
		//oCMNatalidad.saveNatalidad(oCENatalidad);
		log.info("[EVL] Todos los registros : {}" , oCMNatalidad.consultaAll());
		((ConfigurableApplicationContext) oCntx).close();

	}

}
