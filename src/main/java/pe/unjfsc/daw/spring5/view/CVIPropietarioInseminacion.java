package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEPropietarioInseminacion;
import pe.unjfsc.daw.spring5.logical.impl.CMIPropietarioInseminacion;

public class CVIPropietarioInseminacion {

private static final Logger log = LoggerFactory.getLogger("CVIPropietarioInseminacion");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-propietarioInseminacion.xml");
		
		log.info("Context: {}",oCntx);
		CMIPropietarioInseminacion oCMIPropiInse= (CMIPropietarioInseminacion) oCntx.getBean("idCMIPropiInseminacion");
		
		//Mostrar registros actuales
		log.info("Todos los registros: {}", oCMIPropiInse.showAll());
				
		
		//Actualizar un registro según su codigo
		CEPropietarioInseminacion oCEPropiInse=  new CEPropietarioInseminacion(520, 588.00, 1.68, "Establo actualizado", 25.00, "26/09/2020", 1, "Gyrolando","N/O");
		oCMIPropiInse.updatePropiInseminacion(oCEPropiInse);
		
		
		//Buscamos solo un registro por el codigo
		int codigo = 220;
		oCMIPropiInse.showBycodigo(codigo);
		
		//Agregamos un nuevo registro
		CEPropietarioInseminacion oCMAPropiInse2 = new CEPropietarioInseminacion(620, 538.00, 1.62, "Establo nuevo", 25.00, "26/09/2020", 1, "Gyrolando","N/O");
		oCMIPropiInse.savePropiInseminacion(oCMAPropiInse2);
		 
		//verificar registro agregado
		log.info("Verificar último registro: {}",oCMIPropiInse.showAll());
		
		//Eliminamos un registro por codigo
		oCMIPropiInse.deletePropieInseminacion(420);
		
		//Verificamos si se eliminó el registro

		log.info("[EVL] Todos los registros actuales: {}" , oCMIPropiInse.showAll());
		
		((ConfigurableApplicationContext) oCntx).close();
		
	}

}
