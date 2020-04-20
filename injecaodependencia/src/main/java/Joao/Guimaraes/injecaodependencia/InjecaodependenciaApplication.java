package Joao.Guimaraes.injecaodependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InjecaodependenciaApplication {

	public static void main(String[] args) {
		//Criamos uma variável no ApplicationContext para ter o contexto da aplicação.
		ApplicationContext applicationContext = SpringApplication.run(InjecaodependenciaApplication.class,args);

		Pet pet = applicationContext.getBean(Pet.class);
			pet.exexute();

	}

}