package co.in.nextgencoder.class8;

public class Problem1 {

	public static void main(String[] args) {
		
		/*
		 * Given two numbers print 
		 * positive subtraction of them.
		 * 
		 */
		
		int input1 = 23;
		int input2 = 10;

		int max = Integer.max( input1, input2);
		int min = Integer.min( input1, input2);
		
		int output = max - min;
		
		System.out.println( output);   // 13
	}

}
