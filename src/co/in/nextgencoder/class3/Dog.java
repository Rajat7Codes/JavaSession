// Package declaration
package co.in.nextgencoder.class3;

// Built-in package section
import java.util.ArrayList;


// User defined imports
import co.in.nextgencoder.class1.BasicDataTypes;


// class declaration
public class Dog {
	
	// Class data members / Attributes
	private int legs;
	private String sound;
	
	
	// Constructor / Initialising
 	public Dog() {
 		legs = 4;
 		sound = "bark";
	}
	
 	
 	// Parameterised constructor
 	public Dog( int newLegs, String newSound) {
 		legs = newLegs;
 		sound = newSound;
 	}
 	

	// Class member function / Behaviour
	public void run() {
		// 4 legs used
		System.out.println(legs+" legs used...");
	}
	

	// Class member function / Behaviour
	public void talk() {
		// 4 legs used
		System.out.println(sound+" produced...");
	}
	
}







