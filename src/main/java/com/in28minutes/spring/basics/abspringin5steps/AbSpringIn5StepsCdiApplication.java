package com.in28minutes.spring.basics.abspringin5steps;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.abspringin5steps.cdi.SomeCdiBusiness;

@Configuration
@ComponentScan
public class AbSpringIn5StepsCdiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext=new AnnotationConfigApplicationContext(AbSpringIn5StepsCdiApplication.class);
		SomeCdiBusiness  cdiApp=appContext.getBean(SomeCdiBusiness.class);
		System.out.println(cdiApp );
		System.out.println(cdiApp.getSomeCdiDao());
		appContext.close();
	}

}
