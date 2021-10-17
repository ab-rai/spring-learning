package com.in28minutes.spring.basics.abspringin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgo sortAlgo;
	public BinarySearchImpl(SortAlgo sortAlgoParam) {
		super();
		this.sortAlgo= sortAlgoParam;
	}
	public int binarySearch(int[] array, int num) {
		//Sorting the array
//		BubbleSortAlgo bubbleSort=new BubbleSortAlgo();
//		int[] sortedArray=bubbleSort.sort(array);
//		System.out.println("Received sorted array");
//		QuickSortAlgo quickSort=new QuickSortAlgo();
//		int[] sortedArray2=quickSort.sort(array);
//		System.out.println("Received sorted array2");
		int[] sortedArray=sortAlgo.sort(array);
		System.out.println(sortAlgo);
		//Search the array
		//Return the result
		return 3;
	}
}
