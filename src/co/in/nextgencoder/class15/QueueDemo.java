package co.in.nextgencoder.class15;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {


		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		queue.add( 1);
		queue.add( 2);
		queue.add( 3);
		queue.add( 4);
		queue.add( 5);
		queue.add( 6);
		
		
		System.out.println( queue);
		// [1, 2, 3, 4, 5, 6]
		
		
		
		System.out.println( queue.poll());
		// 1
		
		
		System.out.println( queue);
		// [2, 4, 3, 6, 5]
		
		
		ArrayDeque<Integer> dQueue = new ArrayDeque<Integer>();
		
		dQueue.add( 1);
		dQueue.add( 2);
		dQueue.add( 3);
		dQueue.add( 4);
		dQueue.add( 5);
		dQueue.add( 6);
		
		System.out.println( dQueue);
		// [ 1, 2, 3, 4, 5, 6]
		
		dQueue.pollFirst(); // 1
		// [ 2, 3, 4, 5, 6]
		dQueue.pollLast(); // 6
		// [ 2, 3, 4, 5]
		
		System.out.println( dQueue);
		// [2, 3, 4, 5]
		
	}

}
