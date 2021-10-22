package com.in28minutes.spring.basics.abspringin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.basics.abspringin5steps.basic.BinarySearchImpl;

// this annotation make spring automatically scan current packages and sub packages which it is in
@SpringBootApplication
public class AbSpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext= SpringApplication.run(AbSpringIn5StepsBasicApplication.class, args);
		BinarySearchImpl binarySearch =appContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch2 =appContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch2);
		int resInd=binarySearch.binarySearch(new int[] {3,2,1,4}, 4);
		System.out.println("resInd="+resInd);
	}

}
