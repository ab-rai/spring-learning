package com.in28minutes.spring.basics.abspringin5steps;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.abspringin5steps.xml.XmlPersonDao;

// this annotation make spring automatically scan current packages and sub packages which it is in
@Configuration
@ComponentScan("com.in28minutes.spring.basics.abspringin5steps")
public class AbSpringIn5StepsXmlContextApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		XmlPersonDao personDao =appContext.getBean(XmlPersonDao.class);
		System.out.println(personDao);
		System.out.println(personDao.getXmlJdbcConnection());
		
		appContext.close();
	}

}
