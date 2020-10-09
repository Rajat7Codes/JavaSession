package co.in.nextgencoder.class10;

public class Problem2 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to print 
		 * all corners of 2D array
		 */

		int arr[][] = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};
		
		// Expected Output : 
		//  1	3	7	9	
		
		
		// Table format
		//			 [0]	[1]	   [2]
		//	 [0]	  1		 2		3 		
		//	 [1]	  4		 5		6
		//	 [2]	  7		 8		9

		// 1 => rowIndex = start, colIndex = start
		// 3 => rowIndex = start, colIndex = end
		// 7 => rowIndex = end, colIndex = start
		// 9 => rowIndex = end, colIndex = end
		
		
		//  2D arrays Length 
		int totalRows = arr.length;
		int totalColumns = arr[0].length;
		

		int rowStart = 0;
		int colStart = 0;
		int rowEnd = totalRows-1;
		int colEnd = totalColumns-1;
		
		
		//	How to iterate 2D array
		
		for( int rowIndex = 0; rowIndex < totalRows; rowIndex++) {
			
			for( int colIndex = 0; colIndex < totalColumns; colIndex++) {
				
				boolean isLeftTopElement = 
						( rowIndex == rowStart) && ( colIndex == colStart);
				
				boolean isRightTopElement = 
						( rowIndex == rowStart) && ( colIndex == colEnd);
				
				boolean isLeftBottomElement = 
						( rowIndex == rowEnd) && ( colIndex == colStart);
				
				boolean isRightBottomElement = 
						( rowIndex == rowEnd) && ( colIndex == colEnd);
				
				
				if ( isLeftBottomElement || isRightBottomElement ||
						isLeftTopElement || isRightTopElement) {
					System.out.println( arr[ rowIndex][ colIndex]);
				}


			}
		}
		
		
//		1
//		3
//		7
//		9



	}

}
