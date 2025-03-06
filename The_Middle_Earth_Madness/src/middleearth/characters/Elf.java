package middleearth.characters;

public class Elf extends MiddleEarthCharacter {

	/**
	 * Elf character constructor
	 * @param name of character
	 * @param health of character
	 * @param power of character
	 */
	public Elf(String name, double health, double power) {
		super(name, health, power);
	}

	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target == null) {
	        return false;
	    }
		// Can also use target instanceof Race
		if (target.getRace().equals("Orc")) { 
			target.takeDamage(getPower() * 1.5);
			return true;
		}
		else if (target.getRace().equals("Dwarf")
				|| target.getRace().equals("Elf")) {
			return false;
		}
		else if (target.getRace().equals("Human")
				|| target.getRace().equals("Wizard")) {
			target.takeDamage(getPower());
			return true;
		}
		return false;
	}

	@Override
	public String getRace() {
		return "Elf";
	}
	
}
