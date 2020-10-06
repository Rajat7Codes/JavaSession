package co.in.nextgencoder.class8;

public class IterationArrays {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };
		
		
		int startIndex = 0;
		int endingIndex = arr.length - 1;  //  5 - 1 = 4
		int length = arr.length;  //  5 
		
		// Single value access
		// System.out.println( arr[0]);	// 10
		
		
		// Iterate over all elements
		for( int i=startIndex; i <= endingIndex; i++) {
			int element = arr[i];
			// System.out.println( element);
		}
		
		
		//		10
		//		20
		//		30
		//		40
		//		50
		
		
		// int arr[] = { 10, 20, 30, 40, 50 };
		
		// Advanced loop / for each
		for( int element : arr) {
			System.out.println( element);
		}

		//		10
		//		20
		//		30
		//		40
		//		50

		
	}

}
