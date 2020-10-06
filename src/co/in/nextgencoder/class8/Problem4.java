package co.in.nextgencoder.class8;

public class Problem4 {

	public static void main(String[] args) {
		
		/* 
		 * Write a program to count 
		 * how many candles are there 
		 * with maximum height
		 * 
		 */

		int arr[] = { 2, 4, 6, 2, 6 };
		
		int max = Integer.MIN_VALUE;
		
		for( int item : arr) {
			max = Integer.max(max, item);
		}

		int count = 0;
		
		for( int item : arr) {
			if( item==max) {
				count++;
			}
		}
		
		System.out.println( "Max elements are : "+count);
		// Max elements are : 2
	}

}
