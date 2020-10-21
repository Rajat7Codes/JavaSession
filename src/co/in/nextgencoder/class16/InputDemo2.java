package co.in.nextgencoder.class16;

import java.util.Scanner;

public class InputDemo2 {

	public static void main(String[] args) {

		
		// How to solve \n escaping problem
		
		Scanner scan = new Scanner( System.in);
		
		// next
		int input1 = scan.nextInt(); // 10
		double input2 = scan.nextDouble(); // 10.5
		scan.nextLine(); // \n
		String input3 = scan.nextLine(); // Hello

		// 10
		// 10.5 
		// Hello
		
		//		Hello
		//		10.5
		//		10
		
		System.out.println( input3);
		System.out.println( input2);
		System.out.println( input1);
		
		
	}

}
