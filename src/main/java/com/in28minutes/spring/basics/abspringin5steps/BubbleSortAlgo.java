package com.in28minutes.spring.basics.abspringin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("bubble")
public class BubbleSortAlgo implements SortAlgo {
	public int[] sort(int[] array) {
		//Sorting the array
		//Return the result

		System.out.println("Sorting the array with Bubble Sort ");
			return array;
		}
}
