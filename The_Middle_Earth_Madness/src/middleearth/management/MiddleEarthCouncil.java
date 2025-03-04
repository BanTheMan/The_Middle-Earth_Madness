package middleearth.management;

public class MiddleEarthCouncil {

	private static MiddelEarthCouncil instance;
	
	private MiddleEarthCouncil() {}
	
	public static MiddleEarthCouncil getInstance() 
	{
		if (instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance;
	}
	
	public static CharacterManager getCharacterManager() {
		
	}
}
