package co.in.nextgencoder.class4;

public class StringBasics {

	public static void main(String[] args) {
		
		// Converting char [] to String
		char ch[] = { 'H', 'e', 'l', 'l', 'o' };
		
		String str1 = new String( ch); // Hello
		String str2 = "Hello";
		
		// String1 == String1 ( false) Objects
		// String1.equals( String2) Values
		
		if( str1.equals(str2) ) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are different");
		}

		System.out.println( "str1 => "+str1);
		System.out.println( "str2 => "+str2);

		
		// Different ways of creating string
		String string0 = new String( new char[] { 'a'});  // char[] -> String
		String string1 = "Hii";
		String string2 = new String("Hii");

		System.out.println( string1.hashCode());  // 72552
		System.out.println( string2.hashCode());  // 72552
	}

}
