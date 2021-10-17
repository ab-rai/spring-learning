package com.in28minutes.spring.basics.abspringin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// this annotation make spring automatically scan current packages and sub packages which it is in
@SpringBootApplication
public class AbSpringIn5StepsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext= SpringApplication.run(AbSpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch =appContext.getBean(BinarySearchImpl.class);
//		System.out.println("Hello ab first");
//		BinarySearchImpl binarySearch= new BinarySearchImpl(new BubbleSortAlgo());
		int resInd=binarySearch.binarySearch(new int[] {3,2,1,4}, 4);
		System.out.println("resInd="+resInd);
	}

}
