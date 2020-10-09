package co.in.nextgencoder.class9;

public class Problem1 {

	public static void main(String[] args) {

		int arr[] = { 2, 9, 6, 4, 6, 1 };
		
		// i   arr[i]   arr[i+1]
		// 0     2 			9
		// 1     9 			6
		// 2     6 			4
		// 3     4 			6
		// 4     6 			1    7
		
		int max = Integer.MIN_VALUE;
		
		
		for( int i=0; i<arr.length-1; i++) {
			int firstNum = arr[i];  // 2
			int secondNum = arr[i+1];  // 9
			
			int sum = firstNum + secondNum;
			
			max = Integer.max( sum, max);
			System.out.println( sum);
		}
		
//		11
//		15
//		10
//		10
//		7
		
		System.out.println( "max : "+max);
		// max : 15

	}

}
