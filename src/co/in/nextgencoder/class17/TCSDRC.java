package co.in.nextgencoder.class17;

import java.util.Scanner;

public class TCSDRC {

	public static void main(String[] args) {

		Scanner scan = new Scanner( System.in);
		int n = scan.nextInt(); // total numbers
		
		int mul = 1;
		
		for( int i=0; i<n ;i++) {
			int temp = scan.nextInt();
			mul = mul*temp; // mul *= temp;
		}
		
		System.out.println( mul);
		
	}

}
