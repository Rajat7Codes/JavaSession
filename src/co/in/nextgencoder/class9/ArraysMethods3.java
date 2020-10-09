package co.in.nextgencoder.class9;

import java.util.Arrays;

public class ArraysMethods3 {

	public static void main(String[] args) {

		boolean visited[] = new boolean[5];
		
		// Iterating to fill values
		for( int i=0; i<visited.length; i++) {
			visited[i] = false;
		}

		// Optimised and easy solution
		Arrays.fill( visited, false);
		
		System.out.println( Arrays.toString( visited));
		// [false, false, false, false, false]
		// [5, 5, 5, 5]
		
	}

}
