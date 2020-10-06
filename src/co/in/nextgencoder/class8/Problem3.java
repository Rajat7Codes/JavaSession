package co.in.nextgencoder.class8;

public class Problem3 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to find sum of 
		 * every elements from an array
		 * 
		 */
		
		int arr[] = { 2, 4, 6, 2 };
		
		int sum = 0;
		
		for( int item : arr) {
			sum = sum + item;
			// sum += item;
		}
		
		System.out.println( "Sum : " +sum);  // 14
		
		
		
		int mul = 1;
		
		for( int item : arr) {
			mul = mul * item;
			// sum += item;
		}
		
		System.out.println( "Mul : " +mul);  // 96
		
	}

}
