package co.in.nextgencoder.class13;

import java.util.ArrayList;

public class ArrayListMethods2 {

	public static void main(String[] args) {

		
		ArrayList<Integer> list =  new ArrayList<Integer>();

		list.add(1); // 0
		list.add(2); // 1
		list.add(4); // 2
		list.add(5); // 3
		list.add(6); // 4
		
		
		
		// contains checks whether list has element or not
		// then returns true if it contains else return false
		boolean doesListHasElement = list.contains( 3);
		
		System.out.println( "Element is present : "+ doesListHasElement);
		// 1 = true
		// 3 = false

		
		
		
		// indexOf returns index of given element in a list
		// if element is not present then it returns -1
		int index = list.indexOf( 5);
		
		System.out.println( "Element is present at : "+index);
		// Element is present at : 3
		
		
		
		
		// returns size / length of the list
		int sizeOfList = list.size();
		System.out.println( "Size of List is : "+ sizeOfList);
		// Size of List is : 5
		
		
		
		ArrayList<Integer> list2 =  new ArrayList<Integer>();
		
		// returns in boolean whether list is empty or not
		boolean isListEmpty = list2.isEmpty();
		
		System.out.println( "Is List Empty : " + isListEmpty);
		// Is List Empty : true
		
	}

}
