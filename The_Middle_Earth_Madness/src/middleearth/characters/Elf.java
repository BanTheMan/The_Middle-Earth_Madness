package middleearth.characters;

public class Elf extends MiddleEarthCharacter {

	public Elf(String name, double health, double power) {
		super(name, health, power);
	}

	@Override
	boolean attack(MiddleEarthCharacter target) {
		// Can also use target instanceof Race
		if (target.getRace().equals("Orc")) { 
			target.health -= power * 1.5;
			return true;
		}
		else if (target.getRace().equals("Dwarf")
				|| target.getRace().equals("Elf")) {
			return false;
		}
		else if (target.getRace().equals("Human")
				|| target.getRace().equals("Wizard")) {
			target.health -= power;
			return true;
		}
		return false;
	}

	@Override
	String getRace() {
		return "Elf";
	}
	
}
