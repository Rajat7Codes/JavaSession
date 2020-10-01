package co.in.nextgencoder.class4;

public class StringMethod2 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";

		// toUpperCase() -- Capital
		String str3 = str1.toUpperCase();

		System.out.println( "str1  ==> "+str1);  // Hello
		System.out.println( "str3  ==> "+str3);  // HELLO
		
		
		// toLowerCase() -- Small
		String str4 = str2.toLowerCase();

		System.out.println( "str2  ==> "+str2);  // World
		System.out.println( "str4  ==> "+str4);  // world
		
		
		
		
		
		// Java		java			JAVA
		// none		lowercase		uppercase
		
		
		String inputStr = "java";
		String upperInput = inputStr.toUpperCase();  // JAVA
		String lowerInput = inputStr.toLowerCase();  // java
		
		// Java == JAVA (false)  
		// JAVA == JAVA ( true)
		if( inputStr.equals(upperInput)) {
			System.out.println("uppercase");
		} 
		else if( inputStr.equals( lowerInput)) {
			// java == java (true )
			System.out.println("lowercase");
		} 
		else {
			System.out.println("none");
		}
		
	}

}
