package co.in.nextgencoder.class15;

import java.util.TreeMap;

public class TreeDemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		// How to add entry
		map.put( 1, "Red");		// Entry
		map.put( 2, "Blue");
		
		// How to replace existing value
		map.put( 8, "Orange");
		map.put( 3, "Green");
		map.put( 5, "Purple");
		
		System.out.println( map.ceilingKey(4)); 
		// 5
		
		// remove( key)
		map.remove( 2);
		
		System.out.println( map);
		// {1=Orange, 3=Green, 4=Purple}
		// {1=Red, 3=Green, 5=Purple, 8=Orange}

	}

}
