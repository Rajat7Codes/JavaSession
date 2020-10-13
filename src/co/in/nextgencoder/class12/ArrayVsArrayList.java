package co.in.nextgencoder.class12;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

	public static void main(String[] args) {

		// Fixed Size problem in arrays
		int arr[] = new int[5];
		// 0 -> 1 -> 2 -> 3 -> 4 -> 5
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// arr[5] = 60;
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		// at co.in.nextgencoder.class12.ArrayVsArrayList.main(ArrayVsArrayList.java:20)
		
		// Index 5 out of bounds for length 5
		System.out.println( Arrays.toString(arr));
		// [10, 20, 30, 40, 50]
		
		
		// retrieve data in arrays
		System.out.println( arr[2]);
		// 30
		
		
		
		
		// How to solve it using ArrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		
		System.out.println( arrayList);
		// [10, 20, 30, 40, 50]
		
		// retrieve data in arrays
		System.out.println( arrayList.get(2));
		// 30
		
	}

}
