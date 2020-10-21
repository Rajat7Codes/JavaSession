package co.in.nextgencoder.class16;

import java.util.Scanner;

public class InputDemo1 {

	public static void main(String[] args) {
		
		// Addition of two numbers
		
		// Creates a input scanner
		Scanner scan = new Scanner( System.in);
		
		int a = scan.nextInt(); // Input 1 - 10
		int b = scan.nextInt(); // Input 2 - 20
		
		int sum = a+b;
		
		System.out.println( sum);
		
		// Challenge
		// Sample Input : 10 20
		// Sample Output : 30
		// Hidden Inputs : 30 5
		// Hidden Output : 35  ( Expected Output)
	}

}
