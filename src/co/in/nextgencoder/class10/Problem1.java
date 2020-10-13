package co.in.nextgencoder.class10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Problem1 {

	public static void main(String[] args) {
		
		
		/*
		 * Write a program to print
		 * elements from top left to 
		 * bottom right ( Diagonal ) 
		 * of 2D array
		 */
		
		
		int arr[][] = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};
		
		// Expected Output : 1	 5	 9		
		
		// Table format
		//			 [0]	[1]	   [2]
		//	 [0]	  1		 2		3 		
		//	 [1]	  4		 5		6
		//	 [2]	  7		 8		9
		
		
		
		//  2D arrays Length 
		int totalRows = arr.length;
		int totalColumns = arr[0].length;
		
		
		for( int rowIndex = 0; rowIndex < totalRows; rowIndex++) {
			
			for( int colIndex = 0; colIndex < totalColumns; colIndex++) {
				
				if( rowIndex == colIndex) {
					System.out.println( arr[rowIndex][colIndex]);
				}

			}
		}
		

		
//		1
//		5
//		9


	}

}
