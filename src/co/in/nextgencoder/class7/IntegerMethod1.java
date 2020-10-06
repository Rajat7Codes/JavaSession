package co.in.nextgencoder.class7;

public class IntegerMethod1 {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 20;
		
		// Max return larger number between two numbers
		int max = Integer.max( num1, num2);
		
		System.out.println( "Max num = "+max);	// Max num = 30
		
		// Min return smaller number between two numbers
		int min = Integer.min( num1, num2);
		
		System.out.println( "Min num = "+min);	// Min num = 20
		
	}

}
