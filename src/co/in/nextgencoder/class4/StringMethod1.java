package co.in.nextgencoder.class4;

public class StringMethod1 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		
		// concat() -- Append / Join
		String str3 = str1.concat(" "+str2); 
		str3 = str1 + " " + str2;
		
		// length() -- length of String
		int lenStr3 = str3.length();

		System.out.println( str3); 	// Hello World
		System.out.println( lenStr3); 	// 11
	}

}
