package co.in.nextgencoder.class7;

public class IntegerMethod2 {

	public static void main(String[] args) {

		String strNum = "2794d";
		
		// parseInt() -> converts String into number
		
		int num = 0;
		
		try {
			num = Integer.parseInt( strNum);
			System.out.println( "In try block");
		} catch( Exception e) {
			System.out.println( "In catch block");
		}
		
		System.out.println( num);  
//		In catch block
//		18
		
//		In try block
//		2794

		System.out.println( 2+strNum); // 22794   22794
		System.out.println( 2+num); // 2796 	2+2794 
		
		
	}

}
