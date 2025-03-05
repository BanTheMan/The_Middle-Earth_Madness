package middleearth.characters;

public class Orc extends MiddleEarthCharacter {

	public Orc(String name, double health, double power) {
		super(name, health, power);
	}

	@Override
	boolean attack(MiddleEarthCharacter target) {
		// Can also use target instanceof Race
		if (target.getRace().equals("Human")) { 
			target.health -= power * 1.5;
			return true;
		}
		else if (target.getRace().equals("Elf")
				|| target.getRace().equals("Orc")) {
			return false;
		}
		else if (target.getRace().equals("Dwarf")
				|| target.getRace().equals("Wizard")) {
			target.health -= power;
			return true;
		}
		return false;
	}

	@Override
	String getRace() {
		return "Orc";
	}

}
