package co.in.nextgencoder.class5;

public class StringMethod9 {

	public static void main(String[] args) {

		// Hello World Program
		String str = "Hello World Program";
		String strArr[] = str.split(" "); // Hello, World, Program
		
		// Hello, World, Program
		// Hello-World-Program

		// Join joins String array elements to single array
		String output = String.join( "-", strArr);
		System.out.println(output);
		
		
		String arr[] = { "02", "10", "2020"};
		// { "02", "10", "2020" } -> "02/10/2020"
		
		String date = String.join("/", arr);
		
		System.out.println(date);
		//  02/10/2020
	}

}
