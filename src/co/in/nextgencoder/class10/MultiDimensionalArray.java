package co.in.nextgencoder.class10;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		
		// Array is a collection of elements
		int arr1[] = { 1, 2, 3};
		// length = 3
		
		// 2D array is a collection of arrays
		// mArr[0][1] - > 2
		int twoDArr[][] = {   //  0  1  2
								{ 1, 2, 3 }, 	// row 0
								{ 4, 5, 6 }, 	// row 1
								{ 7, 8, 9 }, 	// row 2
								{ 4, 5, 6 }  	// row 3
							};
		
		// int multiArr[][] = new int[m][n];
		// total no. of elements = m*n
		
		
		// 3D array is a collection of 2D arrays
		int threeDArr[][][] = {
				{  { 1, 2, 3 }, 
				   { 4, 5, 6 }, 
				   { 7, 8, 9 }  
				},
				{  { 1, 2, 3 }, 
				   { 4, 5, 6 }, 
				   { 7, 8, 9 }  
				}
		};
		
	}
}
