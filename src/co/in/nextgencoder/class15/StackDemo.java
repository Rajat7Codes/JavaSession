package co.in.nextgencoder.class15;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		// Index based data 
		Stack<String> stack = new Stack<String>();

		// Push Adds element in stack
		stack.push( "Orange");
		stack.push( "Blue");
		stack.push( "Green");

		// FILO -> First In Last Out
		// Element added first will get removed at the last
		
		System.out.println( stack);
		// [Orange, Blue, Green]
		
		
		// Pop removes last element
		System.out.println( stack.pop());
		// Green
		
		
		System.out.println( stack);
		// [Orange, Blue]
		
		
	}

}













