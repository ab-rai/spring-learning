package com.in28minutes.spring.basics.abspringin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.basics.abspringin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.abspringin5steps.scope.PersonDao;

@SpringBootApplication

public class AbSpringIn5StepsScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext= SpringApplication.run(AbSpringIn5StepsScopeApplication.class, args);
		PersonDao  personDao=appContext.getBean(PersonDao.class);
		PersonDao  personDao2=appContext.getBean(PersonDao.class);
		System.out.println(personDao);
		System.out.println(personDao.getJdbcConnection());
		System.out.println(personDao.getJdbcConnection());
		System.out.println(personDao2);
		System.out.println(personDao2.getJdbcConnection());
		
	}

}
