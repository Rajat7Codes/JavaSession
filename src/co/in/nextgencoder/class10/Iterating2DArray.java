package co.in.nextgencoder.class10;

public class Iterating2DArray {

	public static void main(String[] args) {
		
		int arr[][] = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};
		
		
		// Table format
		//			 [0]	[1]	   [2]
		//	 [0]	  1		 2		3 		
		//	 [1]	  4		 5		6
		//	 [2]	  7		 8		9
		
		
		
		//  2D arrays Length 
		int totalRows = arr.length;
		int totalColumns = arr[0].length;
		
		
		//	How to iterate 2D array
		
		// 1 2 3 4 5 6 7 8 9
		
		System.out.println( "\nIterating 2D array :");
		
		
		for( int rowIndex = 0; rowIndex < totalRows; rowIndex++) {
			
			for( int colIndex = 0; colIndex < totalColumns; colIndex++) {
				
				System.out.print( arr[rowIndex][colIndex] + "\t");

			}
		}
		
		
		//	How to iterate all 
		// 	elements of a 2D array
		//  In a table format
		
		//  1	2	3
		//	4	5	6
		//	7	8	9
		
		System.out.println( "\n\nIterating 2D array in Tabular Format :");
		
		for( int rowIndex = 0; rowIndex < totalRows; rowIndex++) {
			
			for( int colIndex = 0; colIndex < totalColumns; colIndex++) {
				
				System.out.print( arr[rowIndex][colIndex] + "\t");

			}
			System.out.println();
		}

	}

}
