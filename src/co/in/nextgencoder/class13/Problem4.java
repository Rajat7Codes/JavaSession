package co.in.nextgencoder.class13;

import java.util.ArrayList;

public class Problem4 {

	public static void main(String[] args) {
		
		
		/*
		 * Write a program to add letters in a list then print 2 letters on same line
		 * then go to next line
		 * 
		 * 
		 * Input : 		a , b, c, d, e 
		 * Output : 	ab 
		 * 				cd 
		 * 				e
		 */
		
		
		ArrayList<String> list = new ArrayList<String>();

		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		// ab
		// cd
		// e
		
		for( int i=0; i<list.size(); i++) {
			String word = list.get( i);
			System.out.print(word);
			
			if( i%2==1) {
				System.out.println();
			}
		}

//		ab
//		cd
//		e
		
		
	}

}
