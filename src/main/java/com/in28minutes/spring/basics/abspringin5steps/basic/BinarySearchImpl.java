package com.in28minutes.spring.basics.abspringin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

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
}
