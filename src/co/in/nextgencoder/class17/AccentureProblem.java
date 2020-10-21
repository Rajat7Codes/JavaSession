package co.in.nextgencoder.class17;

import java.util.HashMap;
import java.util.Map;

public class AccentureProblem {

	public static void main(String[] args) {

		
		/*
		 * Replace most frequently repeated 
		 * character with given input character
		 * 
		 * Input : 		bbadbbababb  	t
		 * Output : 	ttadttatatt
		 * 
		 */
		
		
		String input = "bbadbbababb";
		// b = 7 most repeated
		// a = 3
		// d = 1
		
		// replace with "t"
		
		// Step 1 : store every repetitions
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String strArr[] = input.split("");
		
		for( int i=0; i<strArr.length; i++) {
			String eachChar = strArr[i];  // b
			
			if( map.containsKey( eachChar)) {
				int oldCount = map.get( eachChar); // 1
				map.put( eachChar, oldCount+1);
			} else {
				map.put( eachChar, 1);
			}
		}
		
		
		// Step 2 : Find max repeated character 
		String maxRepeated = ""; // b
		int max = Integer.MIN_VALUE;

		for( Map.Entry<String, Integer> entry : map.entrySet()) {
			if( max < entry.getValue()) {
				max = entry.getValue(); // 7
				maxRepeated = entry.getKey(); // b
			}
		}
		
		// Step 3 : replace character with t
		String output = input.replace( maxRepeated, "t");
		
		System.out.println( output);
		// ttadttatatt
	}

}
