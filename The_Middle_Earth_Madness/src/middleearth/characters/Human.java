package middleearth.characters;

public class Human extends MiddleEarthCharacter {

	/**
	 * Human character constructor
	 * @param name of character
	 * @param health of character
	 * @param power of character
	 */
	public Human(String name, double health, double power) {
		super(name, health, power);
	}

	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target == null) {
	        return false;
	    }
		// Can also use target instanceof Race
		if (target.getRace().equals("Wizard")) { 
			target.takeDamage(getPower());
			return true;
		}
		else if (target.getRace().equals("Orc")
				|| target.getRace().equals("Human")) {
			return false;
		}
		else if (target.getRace().equals("Elf")
				|| target.getRace().equals("Dwarf")) {
			target.takeDamage(getPower());
			return true;
		}
		return false;
	}

	@Override
	public String getRace() {
		return "Human";
	}

}
