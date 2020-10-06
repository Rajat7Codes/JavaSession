package co.in.nextgencoder.class7;

public class Problem2 {

	public static void main(String[] args) {

		int numArr[] = { 2, 45, 315, 3, 58 };
		
		for( int i=0; i<numArr.length; i++) {
			// 2
			int num = numArr[i];
			String strNum = num+"";		// variable+""
			
			if( strNum.length()==2) {
				System.out.println(num);
			}
		}

	}

}
