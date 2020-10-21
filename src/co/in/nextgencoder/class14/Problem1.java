package co.in.nextgencoder.class14;

import java.util.ArrayList;

public class Problem1 {

	public static void main(String[] args) {
		
		
		/*
		 * There are 10 numbers given in a list 
		 * remove duplicates from given arraylist
		 * 
		 * 	Input : 1, 4, 7, 2, 4, 6 , 7, 3 
		 * 	Output : 1, 4, 7, 2, 6, 3
		 */
		
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> outputList = new ArrayList<String>();

		// Remove Even element indexes
		
		list.add("A");  // 0 X
		list.add("B");  // 1 
		list.add("C");  // 2 X
		list.add("D");  // 3
		list.add("E");  // 4 X
		list.add("F");  // 5
		list.add("G");  // 6 X
		
		// A  C  E  G
		// [B, D, F] 

		// num % 2 == 0  Even
		// num % 2 == 1  Odd
		
		for( int i = 0; i<list.size(); i++) {
			// 1 % 2 = 1
			// if index is odd
			if( i % 2 == 1) {
				outputList.add( list.get(i));
			}
		}
		System.out.println( outputList);
		// [B, D, F]
	}

}
