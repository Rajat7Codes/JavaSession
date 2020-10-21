package co.in.nextgencoder.class14;

import java.util.ArrayList;

public class ArrayListMethods3 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add( "A");	// 0
		list.add( "B"); // 1
		list.add( "C"); // 2
		list.add( "D"); // 3
		list.add( "E"); // 4
		list.add( "F"); // 5
		
		
		// remove( int index) method removes element from list
		// from given index and returns the removed item
		String removedItem = list.remove( 3);
		
		System.out.println( "Removed Item is "+removedItem);
		// Removed Item is D
		
		System.out.println( list);
		// [A, B, C, E, F]


		
		// remove( T object) method removes element from list
		// which is equal to value of given parameter
		list.remove("A");
		
		System.out.println( list);
		// [B, C, E, F]
		
		
		
		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(1); // 0
		intList.add(2); // 1
		intList.add(3); // 2
		intList.add(4); // 3
		intList.add(5); // 4
		intList.add(6); // 5
		
		System.out.println( "Index of 4 : "+intList.indexOf( 4));
		// Index of 4 : 3
		
		intList.remove( intList.indexOf(4));
		
		System.out.println( intList);
		// [1, 2, 3, 5, 6]
		
		
		
		// Truncates / delete every elements from list
		intList.clear();
		
		System.out.println( intList);
		// []
		
	}

}
