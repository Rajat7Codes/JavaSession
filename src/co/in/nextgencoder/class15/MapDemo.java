package co.in.nextgencoder.class15;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		// key = userId <Integer>
		// value = color <String>
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// How to add entry
		map.put( 1, "Red");		// Entry
		map.put( 2, "Blue");
		
		// How to replace existing value
		map.put( 8, "Orange");
		map.put( 3, "Green");
		map.put( 5, "Purple");
		
		// remove( key)
		map.remove( 2);
		
		System.out.println( map);
		// {1=Orange, 3=Green, 4=Purple}
		
		// Single Item : Collection
		// Map.Entry<Integer, String> entryItem : map.entrySet()
		for( Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println( "Key : "+entry.getKey()+"\t Value : "+entry.getValue());
		}
//		Key : 1	 Value : Orange
//		Key : 3	 Value : Green
//		Key : 4	 Value : Purple
		
	}

}
