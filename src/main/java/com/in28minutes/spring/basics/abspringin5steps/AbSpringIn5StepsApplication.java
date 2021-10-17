package com.in28minutes.spring.basics.abspringin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbSpringIn5StepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbSpringIn5StepsApplication.class, args);
		System.out.println("Hello ab first");
		BinarySearchImpl binarySearch= new BinarySearchImpl(new BubbleSortAlgo());
		int resInd=binarySearch.binarySearch(new int[] {3,2,1,4}, 4);
		System.out.println("resInd="+resInd);
	}

}
