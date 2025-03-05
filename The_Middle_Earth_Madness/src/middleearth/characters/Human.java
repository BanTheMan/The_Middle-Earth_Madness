package middleearth.characters;

public class Human extends MiddleEarthCharacter {

	public Human(String name, double health, double power) {
		super(name, health, power);
	}

	@Override
	boolean attack(MiddleEarthCharacter target) {
		// Can also use target instanceof Race
		if (target.getRace().equals("Wizard")) { 
			target.health -= power * 1.5;
			return true;
		}
		else if (target.getRace().equals("Orc")
				|| target.getRace().equals("Human")) {
			return false;
		}
		else if (target.getRace().equals("Elf")
				|| target.getRace().equals("Dwarf")) {
			target.health -= power;
			return true;
		}
		return false;
	}

	@Override
	String getRace() {
		return "Human";
	}

}
