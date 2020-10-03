package co.in.nextgencoder.class5;

public class StringMethod5 {

	public static void main(String[] args) {

		// Hello World
		String str = "Hello World";

		// replace( String old, String new) 
		// replaces old substring to new substring
		System.out.println( str.replace("ell", "a"));  // Hao World
		
		// replace( char old, char new) 
		// replaces old character to new character
		System.out.println( str.replace('o', 'i'));  // Helli Wirld
	}

}
