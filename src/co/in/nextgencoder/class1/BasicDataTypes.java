/**
 * 
 */
package co.in.nextgencoder.class1;

/**
 * @author Rajat
 * Date : 27 Sept 2020
 */
public class BasicDataTypes {
	public static void main(String[] args) {
		
		/*                            *
		 *      Number Data Types     *
		 * 		-----------------	  *
		 *							  *
		*/
		
		// 1. byte 			2. short
		// 3. int 			4. long

		System.out.println( "Min value of Byte :"+ Byte.MIN_VALUE); 
		System.out.println( "Max value of Byte :"+ Byte.MAX_VALUE); 

		System.out.println();
		
		System.out.println( "Min value of Short :"+ Short.MIN_VALUE); 
		System.out.println( "Max value of Short :"+ Short.MAX_VALUE); 

		System.out.println();
		
		System.out.println( "Min value of Integer :"+ Integer.MIN_VALUE); 
		System.out.println( "Max value of Integer :"+ Integer.MAX_VALUE); 

		System.out.println();
		
		System.out.println( "Min value of Long :"+ Long.MIN_VALUE); 
		System.out.println( "Max value of Long :"+ Long.MAX_VALUE); 

		// l should be at the end of value
		long number1 = 9223372036854775807l;
		System.out.println( "After adding l at end of the long number " + number1);
		
		System.out.println();
		
		
		/*                             *
		 *      Decimal Data Types     *
		 * 		-----------------	   *
		 *							   *
		*/
		
		// 1. float 		2. double

		System.out.println( "Min value of float :"+ Float.MIN_VALUE); 
		System.out.println( "Max value of float :"+ Float.MAX_VALUE); 
		
		// f should be at the end of value
		float decimal1 = 32245.12123f;
		
		System.out.println( "After adding f at the end of the float" + decimal1);
		
		System.out.println();

		System.out.println( "Min value of double :"+ Double.MIN_VALUE); 
		System.out.println( "Max value of double :"+ Double.MAX_VALUE); 

		System.out.println();
		
		
		
		/*                            *
		 *    Character Data Types    *
		 * 	  --------------------	  *
		 *							  *
		*/
		
		
		// 1. char 			2. String( int 2 bytes)

		// can only contain single letter
		char ch = 'a'; 
		System.out.println( "Single character :"+ ch);
		
		// can contain unicode values 
		char unicode = '\u0000';
		System.out.println( "Unicodes are stored but not shown :"+ unicode);
		
		// are stored in int
		int num = 'a';
		System.out.println( "character stored in int:"+num);
		
		System.out.println();
		

		String str = "Hello" + " World";
		System.out.println(str);

	}
}