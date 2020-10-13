package co.in.nextgencoder.class11;

public class SpiralMatrix {

	public static void main(String[] args) {

		/*
		 * 
		 * Write a program to print elements in a spiral order of the given matrix
		 *
		 *	Input :  1   2   3	                Output :   1  2  3  6  9  8  7  4  5
		 *           4   5   6					    
		 *           7   8   9 					     
		 *
		 * 
		 * 
		 * 
		 */
		
		
		int arr[][] = {
				{  1,  2,  3,  4, 21 }, //0
				{ 12, 13, 14,  5, 42 },	//1
				{ 11, 16, 15,  6,  4 },	//2
				{ 10,  9,  8,  7, 52 },	//2
				{ 75, 95, 52, 67, 51 }	//3
				// 0   1   2  3
			};
		
		
		// 		1 2 3 4 21 42 4 52 51 67 52 95 75 10 11 12 13 14 5 6 7 8 9 16
		//		15

		// leftCol <= rightCol
		// topRow <= bottomRow
		
		
		int topRow = 0;
		int bottomRow = arr.length - 1;	// 3
		
		int leftCol = 0;
		int rightCol = arr[0].length - 1;
		
	
		// leftCol <= rightCol
		// topRow <= bottomRow
		
		while( leftCol <= rightCol && topRow <= bottomRow) {
			
			// Prints from Left element to right
			for( int i=leftCol; i <= rightCol; i++) {
				System.out.println( arr[topRow][i]);
			}

			// Prints from Top element to Bottom
			for( int i=topRow+1; i <= bottomRow; i++) {
				System.out.println( arr[i][rightCol]);
			}

			// Prints from Right element to Left
			for( int i=rightCol-1; i >= leftCol; i--) {
				System.out.println( arr[bottomRow][i]);
			}

			// Prints from Bottom element to Top
			for( int i=bottomRow-1; i > topRow; i--) {
				System.out.println( arr[i][leftCol]);
			}
			
			topRow++;
			rightCol--;
			bottomRow--;
			leftCol++;
			
		}
		
	}

}
