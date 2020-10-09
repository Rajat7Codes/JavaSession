package co.in.nextgencoder.class9;

import java.util.Arrays;
import java.util.Collections;

public class ArraysMethods1 {

	public static void main(String[] args) {

		Integer arr[] = { 4, 6, 2, 7};
		
		// Sort array ( ASC order)
		Arrays.sort( arr);		
		
		// Sort array ( DESC order)
		// If we are using Collections Class
		// then datatype should be only an Object
		Arrays.sort( arr, Collections.reverseOrder());
		

		for (int item : arr) {
			System.out.println( item);
		}
		
	}

}
