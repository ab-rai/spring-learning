package com.in28minutes.spring.basics.abspringin5steps;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.abspringin5steps.scope.PersonDao;

@Configuration
@ComponentScan
public class AbSpringIn5StepsScopeApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext appContext=new AnnotationConfigApplicationContext(AbSpringIn5StepsScopeApplication.class))
		{
		PersonDao  personDao=appContext.getBean(PersonDao.class);
		PersonDao  personDao2=appContext.getBean(PersonDao.class);
		System.out.println(personDao);
		System.out.println(personDao.getJdbcConnection());
		System.out.println(personDao.getJdbcConnection());
		System.out.println(personDao2);
		System.out.println(personDao2.getJdbcConnection());
		}
	}

}
