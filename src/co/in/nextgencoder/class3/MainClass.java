package co.in.nextgencoder.class3;

import co.in.nextgencoder.class3.Dog;

public class MainClass {
	public static void main(String[] args) {
		
		// Class example
		Dog puppy = new Dog();
		puppy.run();
		puppy.talk();
		
		System.out.println("New DOG");
		
		// Parameterised Constructor
		Dog newPuppy = new Dog( 3, "Meow");
		newPuppy.run();
		newPuppy.talk();
		
		
		// Getters and setters
		Cat cat = new Cat();
		
		int legs = cat.getLegs(); // Getter
		System.out.println("cat legs ===> "+legs);
		
		cat.setLegs( 2); // Setter
		legs = cat.getLegs(); // Getter
		System.out.println("cat legs after setter ===> "+legs);
		
		// Auto Generated Getter and Setters
		String sound = cat.getSound(); // Getter
		System.out.println("cat sound ====>"+sound);
		
		cat.setSound( "Bark"); // Setter
		sound = cat.getSound(); // Getter
		System.out.println("cat sound after setter ====>"+sound);
	}
	
}
