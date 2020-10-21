package co.in.nextgencoder.class16;

import java.util.Scanner;

public class InputDemo5 {

	public static void main(String[] args) {
		
		/*
		 * Get Inputs based on length given
		 * and then print addition of them
		 * 
		 * Input : 5  1 2 3 4 5
		 * Explanation : 5 is length then 5 inputs are taken 
		 * Output : 15
		 */

		// unlimited elements
		// Elements will stop when you get -1 
		
		Scanner scanner = new Scanner( System.in);
		
		int inputLength = scanner.nextInt(); 
		
		int sum = 0;
		
		for( int i=0; i<inputLength; i++) {
			int temp = scanner.nextInt();
			sum += temp;
		}
		
		System.out.println( sum);
		// 20
	}

}
