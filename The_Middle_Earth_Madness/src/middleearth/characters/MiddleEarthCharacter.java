package middleearth.characters;


 /**
 * Author: Brandon Gomes
 */
public abstract class MiddleEarthCharacter {
	
	private String name;
	private double health;
	private double power;
	
	
	/**
	 * MiddleEarthCharacter constructor 
	 * @param name of new character
	 * @param health of new character
	 * @param power of new character
	 */
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}
	
	
	/**
	 * Get name of character
	 * @return name of character
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set 
	 * @param name - new character name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return health of character
	 */
	public double getHealth() {
		return this.health;
	}
	
	/**
	 * @param health - new health of character
	 */
	public void setHealth(double health) {
		this.health = health;
	}

	/**
	 * @param damageTaken by character
	 */
	public void takeDamage(double damageTaken) {
		this.health += damageTaken;
	}

	/**
	 * @param healAmount - increase health by
	 */
	public void heal(double healAmount) {
		this.health += healAmount;
	}

	/**
	 * @return power of character
	 */
	public double getPower() {
		return power;
	}

	/**
	 * @param power - new power of character
	 */
	public void setPower(double power) {
		this.power = power;
	}

	/**
	 * @param target of attack
	 * @return if attack hit
	 */
	public abstract boolean attack(MiddleEarthCharacter target);
	
	/**
	 * @return
	 */
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
