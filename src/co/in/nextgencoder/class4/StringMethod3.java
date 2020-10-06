package co.in.nextgencoder.class4;

public class StringMethod3 {

	public static void main(String[] args) {

		String str = "HelloWorldProgram";
		
		// contains() = checks whether string contains another string in it
		boolean isWordInString = str.contains("World");
		
		System.out.println(isWordInString); // true
		
		// indexOf() = return index of another string inside the string
		// indexing starts from 0
		
		//	 0123456789 
		//   HelloWorldProgram
		
		int indexOfWord = str.indexOf("World"); // 5
		int lengthOfWord = "World".length(); // 5
		int endOfWord = (indexOfWord + (lengthOfWord-1));
		
		
		System.out.println("start of word " + indexOfWord);
		System.out.println("end of word " + endOfWord);
		
	}

}
