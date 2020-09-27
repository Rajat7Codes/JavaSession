/**
 * 
 */
package co.in.nextgencoder.class1;

/**
 * @author Rajat
 * Date : 27 Sept 2020
 */
public class OperatorsLogical {
	public static void main(String[] args) {

		/*                            *
		 *      Logical Operators     *
		 * 		-----------------	  *
		 *							  *
		*/
		
		
		//  &&  ( AND )
		
		//		Logical AND Operation 
		
		//  true    &&   false    =   false
		//  false   &&   true     =   false
		//  false   &&   false    =   false
		//  true    &&   true     =   true
		
		
		int age = 14;
		String name = "ABC";
		
		boolean isUserEligible = false;
		
		isUserEligible = ( age >= 18 ) && ( name.equals("ABC") );
		
		if( isUserEligible) {
			System.out.println("( with && ) User is eligible");
		} else {
			System.out.println("( with && ) User is not eligible");
		}

		
		//  ||  ( OR )
	
		//		Logical OR Operation 
		
		//  true    ||   false    =   true
		//  false   ||   true     =   true
		//  false   ||   false    =   false
		//  true    ||   true     =   true
		
		if( isUserEligible) {
			System.out.println("( with || )  User is eligible");
		} else {
			System.out.println("( with || )  User is not eligible");
		}
	}
}
