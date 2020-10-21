package co.in.nextgencoder.class13;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to check whether given list 
		 * is empty or not if not empty then check if 
		 * alphabet is present in a list or not if yes 
		 * then print its index.
		 * 
		 * Input : [ a, b, c, d, e ]        c 
		 * Output : 2
		 */
		
		
		List<Integer> list = new ArrayList<Integer>();

		int inputNumber = 3;		
		
		boolean isListEmpty = list.isEmpty();
		boolean doesListHasElement = list.contains( inputNumber);
		
		if( isListEmpty) {
			System.out.println("List is empty");
			// List is empty
		} else {
			if( doesListHasElement) {
				int indexOfElement = list.indexOf( inputNumber);
				System.out.println("Index of element in a list is : "+indexOfElement);
				// Index of element in a list is : 2
			} else {
				System.out.println("List does not contain "+inputNumber);
				// List does not contain 3
			}
		}
		
		
	}

}
