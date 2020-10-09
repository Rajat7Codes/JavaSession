package co.in.nextgencoder.class9;

import java.util.Arrays;

public class ArraysMethods2 {

	public static void main(String[] args) {

		Integer arr[] = { 4, 6, 2, 7 };

		System.out.println( arr.toString());
		// [Ljava.lang.Integer;@3cd1a2f1
		
		
		System.out.println( Arrays.toString( arr)); 
		// [4, 6, 2, 7]
		

		for (int item : arr) {
			System.out.println( item);
		}
		
//		4
//		6
//		2
//		7
		
	}

}
