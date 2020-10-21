package co.in.nextgencoder.class15;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Stack;

public class ListDemo {

	public static void main(String[] args) {
		
		// Index based data 
		Stack<String> stack = new Stack<String>();

		stack.push( "Orange");
		stack.push( "Blue");
		stack.push( "Green");

		System.out.println( stack);
		// [Orange, Blue, Green]
		
		
		// Pop
		System.out.println( stack.pop());
		// Green
		
		
		System.out.println( stack);
		// [Orange, Blue]
		
		
	}

}













