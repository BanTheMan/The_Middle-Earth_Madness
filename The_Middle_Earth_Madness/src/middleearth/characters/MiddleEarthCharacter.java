package middleearth.characters;

public abstract class MiddleEarthCharacter {
	
	public String name;
	public double health;
	public double power;
	
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	abstract boolean attack(MiddleEarthCharacter target);
	
	abstract String getRace();
	
	public void displayInfo() {
		System.out.println(
				this.name + ":" +
				"Health: " + this.health +
				"Power: " + this.power +
				"Race: " + getRace()
				);
	}
}
