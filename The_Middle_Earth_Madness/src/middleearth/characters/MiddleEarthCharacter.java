package middleearth.characters;

public abstract class MiddleEarthCharacter {
	
	private String name;
	private double health;
	private double power;
	
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getHealth() {
		return this.health;
	}
	
	public void setHealth(double health) {
		this.health = health;
	}

	public void takeDamage(double damageTaken) {
		this.health += damageTaken;
	}

	public void heal(double healAmount) {
		this.health += healAmount;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public abstract boolean attack(MiddleEarthCharacter target);
	
	public abstract String getRace();
	
	public void displayInfo() {
		System.out.println(
				this.name + ":" +
				"Health: " + this.health +
				"Power: " + this.power +
				"Race: " + getRace()
				);
	}
}
