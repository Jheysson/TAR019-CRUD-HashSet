package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CELecheProducidaDia;
import pe.unjfsc.daw.spring5.logical.impl.CMLecheProducidaDia;

public class CVLecheProducidaDia {
	private static final Logger log = LoggerFactory.getLogger("CVLecheProducidaDia");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-LecheProducidaDia.xml");
		
		CMLecheProducidaDia oCMLecheProducidaDia = (CMLecheProducidaDia) oCntx.getBean("idCMLecheProducidaDia");
		CELecheProducidaDia oCELecheProducidaDia = new CELecheProducidaDia(1, 10.00, "1/10/2020", 4012);
		
		log.info("[EVL] Todos los registros : {}" , oCMLecheProducidaDia.consultaAll());
		//log.info("[EVL] Solo un registro : {}" , oCMLecheProducidaDia.consultarById(4001));
		//oCMLecheProducidaDia.updateLecheProducidaDia(oCELecheProducidaDia);
		//log.info("[EVL] Todos los registros : {}" , oCMLecheProducidaDia.consultaAll());
		//oCMLecheProducidaDia.deleteLecheProducidaDia(4002);
		//log.info("[EVL] Todos los registros : {}" , oCMLecheProducidaDia.consultarById(4002));
		oCMLecheProducidaDia.deleteLecheProducidaDia(1);
		//log.info("[EVL] Todos los registros : {}" , oCMLecheProducidaDia.consultaAll());
		//oCMLecheProducidaDia.updateLecheProducidaDia(oCELecheProducidaDia);
		//oCMLecheProducidaDia.saveLecheProducidaDia(oCELecheProducidaDia);
		log.info("[EVL] Todos los registros : {}" , oCMLecheProducidaDia.consultaAll());
		((ConfigurableApplicationContext) oCntx).close();

	}

}
