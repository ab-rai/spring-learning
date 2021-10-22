package com.in28minutes.spring.basics.abspringin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basics.abspringin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.abspringin5steps.scope.PersonDao;
import com.in28minutes.spring.basics.componentscan.ComponentPersonDao;

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class AbSpringIn5StepsComponentScanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext= SpringApplication.run(AbSpringIn5StepsComponentScanApplication.class, args);
		ComponentPersonDao  personDao=appContext.getBean(ComponentPersonDao.class);
		ComponentPersonDao  personDao2=appContext.getBean(ComponentPersonDao.class);
		System.out.println(personDao);
		
		System.out.println(personDao2);
	
		
	}

}
