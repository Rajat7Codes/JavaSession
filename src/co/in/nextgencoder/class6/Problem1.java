package co.in.nextgencoder.class6;

public class Problem1 {

	public static void main(String[] args) {

		/**
		 * 
		 * Write a program to duplicate the elements
		 * after their position
		 * 
		 * Input : ABCD
		 * Ouput : AABBCCDD
		 * 
		 */
		
		String input = "Hello";
		String strArr[] = input.split(""); 	// { "H", "e", "l", "l", "o" }
		String output = ""; // HHeelllloo
		
		for( int i=0; i<strArr.length; i++) {
			String temp = strArr[i];
			output += (temp+temp);		
		}

		System.out.println(output);  // HHeelllloo
	}

}
