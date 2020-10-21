package co.in.nextgencoder.class17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MethodPlatform1 {

	public static void main(String[] args) {

		// String = inputString => bbadbbababb
		// String = inputString => t
		// String = outputString => ttadttatatt
	
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String replacement = sc.nextLine();
		
		String output = replaceMaxOccurance( input, replacement);
		
		System.out.println( output);
	}

	
	// return Type     ( inputs.....)
	private static String replaceMaxOccurance(String input, String replacement) {
		
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
				
		// Step 3 : replace character with max repeated character 
		
		String output = input.replace( maxRepeated, replacement);
		
		return output;
	}

}
