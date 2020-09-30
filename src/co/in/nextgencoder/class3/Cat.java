package co.in.nextgencoder.class3;

public class Cat {
	private int legs;
	private String sound;
	
	public Cat() {
		legs = 4;
		sound = "Meow";
	}
	
	
	public Cat(int legs, String sound) {
		super();
		this.legs = legs;
		this.sound = sound;
	}


	// Getter ( To access private member from external class)
	// Should have same return type as member e.g. legs
	// Should be public
	public int getLegs() {
		return legs;
	}
	
	// Setter ( To set value of private member from external class)
	// Should contain same parameter type as member e.g. int
	// Should be public
	public void setLegs( int newLegs) {
		legs = newLegs;
	}

	// To generate getters and setter 
	// Right click => Source => Generate Getters and Setters ( Eclipse )
	// Check those members you have to generate G&S for and Generate them
	public String getSound() {
		return sound;
	}


	public void setSound(String sound) {
		this.sound = sound;
	}
	
}
