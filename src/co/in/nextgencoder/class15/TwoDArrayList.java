package co.in.nextgencoder.class15;

import java.util.ArrayList;

public class TwoDArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add( 1);
		list.add( 2);
		list.add( 3);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add( 1);
		list1.add( 2);
		

		// Integer = 1, 2, 3, 4, 5
		// String = "a", "b"
		// ArrayList<T> = [], [], []
		
		ArrayList<ArrayList<Integer>> twoDList = new ArrayList<ArrayList<Integer>>();
		twoDList.add( list);
		twoDList.add( list1);
		
		System.out.println( twoDList);
		
	}

}
