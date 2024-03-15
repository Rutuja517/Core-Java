package com.tnsif.array;

import java.util.Arrays;

public class ArraysDemo {
	
	public static void main(String[] args) {
		int a[] = {10,45,23,54,65,11,15,87,58,100};
		
		System.out.println("Before sorting : "+Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After sorting : "+Arrays.toString(a));
		
		//Binary Search
				int key=65;
				System.out.println(key+" found at index "+Arrays.binarySearch(a, key));
		
		

	}

}
