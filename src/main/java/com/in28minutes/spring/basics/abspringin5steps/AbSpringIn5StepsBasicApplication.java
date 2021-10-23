package com.in28minutes.spring.basics.abspringin5steps;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.abspringin5steps.basic.BinarySearchImpl;

// this annotation make spring automatically scan current packages and sub packages which it is in
@Configuration
@ComponentScan("com.in28minutes.spring.basics.abspringin5steps")
public class AbSpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext=new AnnotationConfigApplicationContext(AbSpringIn5StepsBasicApplication.class);
		BinarySearchImpl binarySearch =appContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch2 =appContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch2);
		int resInd=binarySearch.binarySearch(new int[] {3,2,1,4}, 4);
		System.out.println("resInd="+resInd);
		appContext.close();
	}

}
