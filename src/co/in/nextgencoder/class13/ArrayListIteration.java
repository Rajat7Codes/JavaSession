package co.in.nextgencoder.class13;

import java.util.ArrayList;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		
		int lengthOfList = list.size();
		
		// When you need index
		for( int i=0; i<lengthOfList; i++) {
			int item = list.get(i);
			System.out.println( item);
		}

//		11
//		22
//		33
//		44
//		55
//		66

		
		// When you do not need index
		for( int item : list ) {
			System.out.println( item);
		}
		
//		11
//		22
//		33
//		44
//		55
//		66
		
		
	}

}
