package co.in.nextgencoder.class15;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {

		// Set only allows elements
		// which are unique and
		// are in ASC order
		HashSet<Integer> set = new HashSet<Integer>();

		set.add( 3);
		set.add( 6);
		set.add( 2);
		set.add( 3);
		set.add( 6);
		set.add( 5);
		set.add( 8);
		
		System.out.println( set);
		// [2, 3, 5, 6, 8]
		// [2, 3, 5, 6, 8]
	}

}
