package middleearth.management;

public class MiddleEarthCouncil {

	private static MiddleEarthCouncil instance;
	private CharacterManager characterManager;
	
	private MiddleEarthCouncil() {
		this.characterManager = new CharacterManager();
	}
	
	public static MiddleEarthCouncil getInstance() 
	{
		if (instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance;
	}
	
	public CharacterManager getCharacterManager() {
		return this.characterManager;
	}
}
