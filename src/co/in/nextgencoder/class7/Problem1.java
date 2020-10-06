package co.in.nextgencoder.class7;

public class Problem1 {

	public static void main(String[] args) {

		int numArr[] = { -32, 467, 43, 76, 102 };
		
		int max = Integer.MIN_VALUE;	// 
		
		for( int i=0; i<numArr.length; i++) {
			

			if( max < numArr[i] && numArr[i] < 100) {
				max = numArr[i];
			}
			
		}
		
		System.out.println( max);

	}

}
