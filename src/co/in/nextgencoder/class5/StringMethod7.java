package co.in.nextgencoder.class5;

public class StringMethod7 {

	public static void main(String[] args) {

		// Hello World
		String str = "Program";

		// char str.charAt( int index)
		// return character of the string from given index
		char ch = str.charAt(6);   // m
		
		// System.out.println(ch);   // W
		
		
		int startIndex = 0; // 0
		int lastIndex = str.length()-1;  // 6
		int middleIndex = lastIndex/2;  // 3
		
		char startChar = str.charAt( startIndex);  // P
		char lastChar = str.charAt( lastIndex);	// m
		char middleChar = str.charAt( middleIndex);	//g

		System.out.println( "Starting Char ==> "+startChar);  // P
		System.out.println( "Ending Char ==> "+lastChar);	// m
		System.out.println( "Middle Char ==> "+middleChar);		// g
		
	}

}
