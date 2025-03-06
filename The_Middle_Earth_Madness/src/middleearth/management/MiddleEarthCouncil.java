package middleearth.management;

/**
 * Author: Ivan R.
 */
public class MiddleEarthCouncil {

	private static MiddleEarthCouncil instance;
	private CharacterManager characterManager;
	
	/**
	 * Private constructor for singleton
	 */
	private MiddleEarthCouncil() {
		this.characterManager = new CharacterManager();
	}
	
	/**
	 * Create or return singleton council instance
	 * @return instance of council
	 */
	public static MiddleEarthCouncil getInstance() 
	{
		if (instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance;
	}
	
	/**
	 * Get character manager
	 * @return character manager object
	 */
	public CharacterManager getCharacterManager() {
		return this.characterManager;
	}
}
