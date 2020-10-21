package co.in.nextgencoder.class13;

import java.util.ArrayList;

public class Problem3 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to find max 
		 * number present in given list.
		 * 
		 * Input : 4, 7, 2, 4, 6 
		 * Output : 7
		 * 
		 */	
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(4);
		list.add(7);
		list.add(2);
		list.add(4);
		list.add(6);
		
		
		int max = Integer.MIN_VALUE;
		
		for( int item : list) {
			max = Integer.max( max, item);
		}
		
		System.out.println( "Max value is "+max);
		// Max value is 7
		
	}

}
