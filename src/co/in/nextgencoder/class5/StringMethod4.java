package co.in.nextgencoder.class5;

public class StringMethod4 {

	public static void main(String[] args) {

		// Hello
		String str = "Hello World";

		// startsWith() compares starting 
		// index value with given string
		boolean startsWithStringOrNot = str.startsWith( "Hello");
		
		System.out.println( startsWithStringOrNot);  // true
		

		// endsWith() compares ending 
		// index values with given string
		boolean endsWithStringOrNot = str.endsWith( "World");
		
		System.out.println( endsWithStringOrNot);  // true
		
		
		
		// url valid or not
		String input = "www.google.com";

		boolean startsWithWwwOrNot = input.startsWith("www.");
		boolean endsWithComOrNot = input.endsWith(".com");

		if( startsWithWwwOrNot && endsWithComOrNot) {
			System.out.println("Valid URL");  // true
		} else {
			System.out.println("InValid URL"); // ---
		}
	}

}
