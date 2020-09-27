/**
 * 
 */
package co.in.nextgencoder.class1;

/**
 * @author Rajat
 * Date : 27 Sept 2020
 */

public class BooleanDataType {
	public static void main(String[] args) {

		
		/*                            *
		 *      Boolean Data Type     *
		 * 		-----------------	  *
		 *							  *
		*/
		
		
		// Direct initializing with 
		// true and false value
		
		boolean directTrue = true;
		boolean directFalse = false;

		
		System.out.println("true = "+directTrue+" false = "+directFalse);
		
		
		// Values changed dynamically
		// As per condition
		
		boolean dynamicallyTrue = ( 2 < 5);
		boolean dynamicallyFalse = ( 2 > 5);

		System.out.println("( 2 < 5 ) = "+dynamicallyTrue+" ( 2 > 5 ) = "+dynamicallyFalse);
		
	}
}
