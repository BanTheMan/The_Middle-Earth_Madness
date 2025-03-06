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
	 * Set name of character
	 * @param name - new character name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get current health of character
	 * @return health of character
	 */
	public double getHealth() {
		return this.health;
	}
	
	/**
	 * Set character health
	 * @param health - new health of character
	 */
	public void setHealth(double health) {
		this.health = health;
	}

	/**
	 * Decrease character health
	 * @param damageTaken by character
	 */
	public void takeDamage(double damageTaken) {
		this.health += damageTaken;
	}

	/**
	 * Increase character health
	 * @param healAmount - increase health by
	 */
	public void heal(double healAmount) {
		this.health += healAmount;
	}

	/**
	 * Get power of character
	 * @return power of character
	 */
	public double getPower() {
		return power;
	}

	/**
	 * Set power of character
	 * @param power - new power of character
	 */
	public void setPower(double power) {
		this.power = power;
	}

	/**
	 * Make character attack another character
	 * @param target of attack
	 * @return if attack hit
	 */
	public abstract boolean attack(MiddleEarthCharacter target);
	
	/**
	 * Get race of character
	 * @return race of character
	 */
	public abstract String getRace();
	
	/**
	 * Display character information
	 */
	public void displayInfo() {
		System.out.println(
				this.name + ":" +
				"\nHealth: " + this.health +
				"\nPower: " + this.power +
				"\nRace: " + getRace()
				);
	}
}
