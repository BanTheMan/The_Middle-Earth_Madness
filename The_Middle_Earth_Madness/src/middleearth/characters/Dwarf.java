package middleearth.characters;

public class Dwarf extends MiddleEarthCharacter {

	public Dwarf(String name, double health, double power) {
		super(name, health, power);
	}

	@Override
	boolean attack(MiddleEarthCharacter target) {
		// Can also use target instanceof Race
		if (target.getRace().equals("Elf")) { 
			target.health -= power * 1.5;
			return true;
		}
		else if (target.getRace().equals("Wizard")
				|| target.getRace().equals("Dwarf")) {
			return false;
		}
		else if (target.getRace().equals("Human")
				|| target.getRace().equals("Orc")) {
			target.health -= power;
			return true;
		}
		return false;
	}

	@Override
	String getRace() {
		return "Dwarf";
	}

}
