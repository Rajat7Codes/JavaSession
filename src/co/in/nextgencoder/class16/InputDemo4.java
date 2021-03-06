package co.in.nextgencoder.class16;

import java.util.Scanner;

public class InputDemo4 {

	public static void main(String[] args) {
		
		/*
		 * Get Input of numbers until -1 occurs
		 * and then print addition of them
		 */

		// unlimited elements
		// Elements will stop when you get -1 
		
		Scanner scanner = new Scanner( System.in);
		
		int sum = 0;
		
		while( true) {
			int temp = scanner.nextInt();
			
			if( temp == -1) break;
			
			sum += temp;
		}
		
		System.out.println( sum);
		// 20
	}

}
