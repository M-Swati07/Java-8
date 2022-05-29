package com.swati.foreach;

import java.util.Arrays;
import java.util.List;

public class DemoForEach {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		for(int i : list) {			//External Loops
			System.out.println(i);
		}
		System.out.println();
		list.forEach(i -> System.out.println(i));	//Internal Loops in Java 8 -> Internal Iterations
		//i -> System.out.println(i) is the implementation of "Consumer Interface" 
	}
}

//Internal for loops are much faster than external for loops
//For processing huge amount of data, internal for loop (ForEach) can be faster and helpful