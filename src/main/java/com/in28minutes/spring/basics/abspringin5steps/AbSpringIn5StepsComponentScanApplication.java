package com.in28minutes.spring.basics.abspringin5steps;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.componentscan.ComponentPersonDao;

@Configuration
@ComponentScan
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class AbSpringIn5StepsComponentScanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext=new AnnotationConfigApplicationContext(AbSpringIn5StepsComponentScanApplication.class);
		ComponentPersonDao  personDao=appContext.getBean(ComponentPersonDao.class);
		ComponentPersonDao  personDao2=appContext.getBean(ComponentPersonDao.class);
		System.out.println(personDao);
		
		System.out.println(personDao2);
		
		
	}
	

}
