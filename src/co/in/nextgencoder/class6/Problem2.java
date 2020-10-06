package co.in.nextgencoder.class6;

public class Problem2 {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Write a program to count every similar 
		 * elements from two strings
		 * 
		 * Input : BOUNDED  	HOUND
		 * Output : 4
		 * Explanation : OUND
		 * 
		 */
		
		
		String str1 = "BOUNDED";
		String str2 = "HOUND";
		
		String str1Arr[] = str1.split("");
		String str2Arr[] = str2.split("");
		
		int length = 0;
		
		// Storing smaller length in length variable
		// To handle ArrayOutOfBounds Exception
		if( str1.length() < str2.length()) {
			length = str1.length();
		} else {
			length = str2.length();
		}
		
		int output = 0;
		
		for( int i=0; i < length; i++) {
			String str1Char = str1Arr[i];  //BOUNDED
			String str2Char = str2Arr[i];  //HOUND 
			
			if( str1Char.equals( str2Char) ) {
				output++;
			} 
		}
		
		System.out.println(output); // 4

	}

}
