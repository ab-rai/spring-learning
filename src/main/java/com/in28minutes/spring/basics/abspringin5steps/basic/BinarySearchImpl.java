package com.in28minutes.spring.basics.abspringin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.basics.componentscan.PostConstruct;
import com.in28minutes.spring.basics.componentscan.PreDestroy;

@Component
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	@Autowired
	private SortAlgo quickSortAlgo;
	public int binarySearch(int[] array, int num) {
		int[] sortedArray=quickSortAlgo.sort(array);
		System.out.println(quickSortAlgo);
		return 3;
	}
	@javax.annotation.PostConstruct
	public void postConstruct() {
		System.out.println("Post construct");
	}
	@javax.annotation.PreDestroy
	public void preDestroy() {
		System.out.println("preDestroy");
	}
}
