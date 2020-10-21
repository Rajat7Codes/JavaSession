package co.in.nextgencoder.class13;

import java.util.ArrayList;

public class Problem1 {

	public static void main(String[] args) {

		/*
		 * Write a program to add first 5 letters of Alphabets 
		 * in a list and replace “c” with “n” and add “j” at the 
		 * first index then print the list.
		 * 
		 * Input : a , b, c, d, e 
		 * Output : [ j, a, b, n, d, e]
		 * 
		 */
		
		ArrayList<String> list = new ArrayList<String>();

		list.add( "a");	//	0
		list.add( "b"); //	1
		list.add( "c"); // 	2
		list.add( "d"); //	3
		list.add( "e"); // 	4
		
		// list.add( 2, "n");
		list.set( 2, "n");
		
		System.out.println( list);
		// [a, b, n, d, e]
		
		list.add( 0, "j");
		
		System.out.println( list);
		// [j, a, b, n, d, e]
		
	}

}
