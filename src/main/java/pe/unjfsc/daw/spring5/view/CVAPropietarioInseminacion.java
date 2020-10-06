package pe.unjfsc.daw.spring5.view;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.unjfsc.daw.spring5.entity.CEPropietarioInseminacion;
import pe.unjfsc.daw.spring5.logical.impl.CMAPropietarioInseminacion;

public class CVAPropietarioInseminacion {

private static final Logger log = LoggerFactory.getLogger("CVAPropietarioInseminacion");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-propietarioInseminacion.xml");
		
		log.info("Context: {}",oCntx);
		CMAPropietarioInseminacion oCMAPropiInse= (CMAPropietarioInseminacion) oCntx.getBean("idCMAPropiInseminacion");
		
		//Mostrar registros actuales
		log.info("Todos los registros: {}", oCMAPropiInse.showAll());

		//Actualizar un registro según su codigo
		CEPropietarioInseminacion oCEPropiInse=  new CEPropietarioInseminacion(520, 588.00, 1.68, "Establo actualizado", 25.00, "26/09/2020", 1, "Gyrolando","N/O");
		oCMAPropiInse.updatePropiInseminacion(oCEPropiInse);
		
		//Buscamos solo un registro por el codigo
		int codigo = 220;
		oCMAPropiInse.showBycodigo(codigo);
				
		//Agregamos un nuevo registro
		CEPropietarioInseminacion oCMAPropiInse2 = new CEPropietarioInseminacion(620, 538.00, 1.62, "Establo nuevo", 25.00, "03/10/2020", 1, "Gyrolando","N/O");
		oCMAPropiInse.savePropiInseminacion(oCMAPropiInse2);
				 

		//verificar registro agregado
		log.info("Todos los registros: {}", oCMAPropiInse.showAll());
		
		//Eliminamos un registro por codigo
				oCMAPropiInse.deletePropieInseminacion(420);
				
		//Verificamos si se eliminó el registro
		
				log.info("[EVL] Todos los registros actuales: {}" , oCMAPropiInse.showAll());
		
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
