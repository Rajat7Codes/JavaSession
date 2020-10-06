package co.in.nextgencoder.class5;

public class StringMethod8 {

	public static void main(String[] args) {

		// Hello World Program
		String str = "A-B-C";
		// { "A", "B", "C" }
		
		String strArr[] = str.split("-");
		
		for( int i=0; i<strArr.length; i++) {
			System.out.println( strArr[i]);
		}
		
//		A
//		B
//		C
		

//		// Hello, World, Program
//
//		// strArr[0] = Hello
//		// strArr[1] = World
//		// strArr[2] = Program
//		
//		// 				0		  1			2
//		// strArr = { "Hello", "World", "Program" }
//		String [] strArr = str.split("");
//		
//		
//		for( int i=0; i < strArr.length; i++) {
//			String temp = strArr[i];
//			System.out.println( temp);
//		}	
//		
//		// Hello
//		// World
//		// Program

	}

}
