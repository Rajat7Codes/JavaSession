package co.in.nextgencoder.class14;

import java.util.ArrayList;

public class Problem2 {

	public static void main(String[] args) {
		
		
		/*
		 * There are 5 birds numbered from 1 to 5 
		 * count number of times they appeared
		 * 
		 * 	Input :  1, 4, 2, 3, 4, 5, 2, 3, 4
		 *  Output : 1  1 
		 *  		 2  2  
		 *  		 3  2  
		 *  		 4  3 
		 *  		 5  1
		 */
		  
		 

		
		// Problem with this solution
		// if total birds are more than 5 or not mentioned

//		int bird1 = 0;  // 1  ++
//		int bird2 = 0;  // 2  ++ 
//		int bird3 = 0;  // 3  ++
//		int bird4 = 0;  // 4  ++
//		int bird5 = 0;  // 5  ++
//		
//		int arr[] = { 1, 4, 2, 3, 4, 5, 2, 3, 4 };
//		
//		
//		for( int bird : arr) {
//			if( bird==1) bird1++;
//			if( bird==2) bird2++;
//			if( bird==3) bird3++;
//			if( bird==4) bird4++;
//			if( bird==5) bird5++;
//		}
//
//		System.out.println( "Bird 1 = "+bird1);
//		System.out.println( "Bird 2 = "+bird2);
//		System.out.println( "Bird 3 = "+bird3);
//		System.out.println( "Bird 4 = "+bird4);
//		System.out.println( "Bird 5 = "+bird5);
		
//		Bird 1 = 1
//		Bird 2 = 2
//		Bird 3 = 2
//		Bird 4 = 3
//		Bird 5 = 1
		
		

		int arr[] = { 0, 1, 4, 2, 0, 3, 4, 5, 2, 3, 4 };
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		// Index : [ 0, 1, 2, 3, 4, 5 ]
		// Init  : [ 0, 0, 0, 0, 0, 0 ]
		// Value : [ 1, 1, 1, 1, 2, 0 ]
		
		
		int max = Integer.MIN_VALUE;
		
		for( int i=0; i<arr.length; i++) {
			max = Integer.max( max, arr[i]);
		}
		
		for( int i=0; i<=max; i++) {
			list.add(0);
		}
		
		for( int bird : arr) {
			int value = list.get(bird) + 1;
			
			// list.set( index, value);
			list.set( bird, value);
		}
		
		System.out.println( list);
		// [2, 1, 2, 2, 3, 1]
		
	}

}





















