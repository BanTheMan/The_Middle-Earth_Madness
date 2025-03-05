package middleearth.characters;

public class Orc extends MiddleEarthCharacter {

	public Orc(String name, double health, double power) {
		super(name, health, power);
	}

	@Override
	public boolean attack(MiddleEarthCharacter target) {
		// Can also use target instanceof Race
		if (target.getRace().equals("Human")) { 
			target.takeDamage(getPower() * 1.5);
			return true;
		}
		else if (target.getRace().equals("Elf")
				|| target.getRace().equals("Orc")) {
			return false;
		}
		else if (target.getRace().equals("Dwarf")
				|| target.getRace().equals("Wizard")) {
			target.takeDamage(getPower());
			return true;
		}
		return false;
	}

	@Override
	public String getRace() {
		return "Orc";
	}

}
