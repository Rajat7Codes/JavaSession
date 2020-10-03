package co.in.nextgencoder.class5;

public class StringCharDiff {

	public static void main(String[] args) {
		String str1 = new String("Hii");
		String str2 = "Hii";
		

		System.out.println( str1 == str2); // false
		// String isEquals()
		System.out.println( str1.equals(str2)); // true
		
		// char primitive datatype
		int ch1 = 'c';
		char ch2 = 'c';

		System.out.println( ch1 == ch2); // true
	}

}
