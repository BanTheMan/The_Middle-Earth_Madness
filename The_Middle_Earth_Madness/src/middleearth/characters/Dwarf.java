package middleearth.characters;

/**
 * Author: Brandon Gomes
 */
public class Dwarf extends MiddleEarthCharacter {

	/**
	 * Dwarf character constructor
	 * @param name of character
	 * @param health of character
	 * @param power of character
	 */
	public Dwarf(String name, double health, double power) {
		super(name, health, power);
	}

	@Override
	public boolean attack(MiddleEarthCharacter target) {
		// Can also use target instanceof Race
		if (target.getRace().equals("Elf")) { 
			target.takeDamage(getPower() * 1.5);
			return true;
		}
		else if (target.getRace().equals("Wizard")
				|| target.getRace().equals("Dwarf")) {
			return false;
		}
		else if (target.getRace().equals("Human")
				|| target.getRace().equals("Orc")) {
			target.takeDamage(getPower());
			return true;
		}
		return false;
	}

	@Override
	public String getRace() {
		return "Dwarf";
	}

}
