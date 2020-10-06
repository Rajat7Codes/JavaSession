package co.in.nextgencoder.class6;

public class Problem3 {
	public static void main(String[] args) {
		
		/**
		 * 
		 * Write a program to print every 
		 * words given in camelCase String
		 * 
		 * Input : getCamelCase  	
		 * Output : get \n Camel \n Case
		 * 
		 */
		
		String input = "easyStringSolution";
		String upperInput = input.toUpperCase();	// EASYSTRINGSOLUTION
		
		String [] strArr = input.split("");	
		String [] strArrUpper = upperInput.split("");
		
		for( int i=0; i<strArr.length; i++) {
			if( strArr[i].equals( strArrUpper[i])) {
				System.out.println();
			}

			System.out.print( strArr[i]);
		}
		
		//		easy
		//		String
		//		Solution
	}
}
