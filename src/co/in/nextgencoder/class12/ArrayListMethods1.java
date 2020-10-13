package co.in.nextgencoder.class12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		// To add element at the last position
		list.add("ABC");
		list.add("DEF");
		list.add("JKL");
		
		// To add element at given index
		list.add( 2, "GHI");
		
		list.add("MNO");
		list.add("JKL");
		
		// How to get element from given index
		System.out.println("Element at 4th index is "+list.get(4));
		// Output : Element at 4th index is MNO
		
		
		// How to set element to given index
		list.add( 5, "PQR");
		
		// add() function adds element on that index
		// set() function replaces the element with new element
		
		System.out.println( "List : "+list);
		// List : [ABC, DEF, GHI, JKL, MNO, PQR]
		
	}

}
