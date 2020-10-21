package co.in.nextgencoder.class16;

import java.util.Scanner;

public class InputDemo3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner( System.in);
		
//		for( int i=0; i<5; i++) {
//			int temp = scanner.nextInt();
//			
//			System.out.println( temp);
//		}
		
		
		// unlimited elements
		// Elements will stop when you get -1 
		
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
