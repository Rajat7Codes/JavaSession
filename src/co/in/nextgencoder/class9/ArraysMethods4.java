package co.in.nextgencoder.class9;

import java.util.Arrays;

public class ArraysMethods4 {

	public static void main(String[] args) {

		// Binary Search Algorithm
		// Searches element in an array
		// return element index
		// Array should be sorted
		
		// Un sorted array
		int arr[] = { 3, 6, 2, 1, 7 };
		
		// Sorted array
		Arrays.sort( arr);
		// { 1, 2, 3, 6, 7 }
		
		
		// Searching arr for key
		int searchedIndex = Arrays.binarySearch( arr, 2);
		
		
		System.out.println( searchedIndex);
		// 1
	}

}
