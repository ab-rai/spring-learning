package com.in28minutes.spring.basics.abspringin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.basics.abspringin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.abspringin5steps.cdi.SomeCdiBusiness;
import com.in28minutes.spring.basics.abspringin5steps.scope.PersonDao;

@SpringBootApplication

public class AbSpringIn5StepsCdiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext= SpringApplication.run(AbSpringIn5StepsCdiApplication.class, args);
		SomeCdiBusiness  cdiApp=appContext.getBean(SomeCdiBusiness.class);
		System.out.println(cdiApp );
		System.out.println(cdiApp.getSomeCdiDao());
		
	}

}
