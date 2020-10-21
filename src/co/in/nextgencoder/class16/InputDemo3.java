package co.in.nextgencoder.class16;

import java.util.Scanner;

public class InputDemo3 {

	public static void main(String[] args) {

		/*
		 * Get Input of 5 numbers and 
		 * print addition of them
		 */
		
		Scanner scanner = new Scanner( System.in);
		
		int sum = 0;
		for( int i=0; i<5; i++) {
			int temp = scanner.nextInt();
			sum += temp;
		}
		
		System.out.println( sum);
		// 20
		
	}

}
