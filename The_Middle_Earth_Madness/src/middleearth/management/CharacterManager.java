package middleearth.management;

public class CharacterManager {
	MiddleEarthCharacter[] characters = new MiddleEarthCharacter[5]; 
	private int size;
	
	public boolean addCharacter(MiddleEarthCharacter c) 
	{
		for(int i = 0; i < size; i++) 
		{
			if(characters[i] == null) {
				characters[i] = c;
				size++;
				return true;
			}
		}
	return false;	
	}
	
	MiddleEarthCharacter getCharacter(String name) 
	{
		for(int i = 0; i < size; i++) 
		{
			if(character[i].name == name) 
			{
				MiddleEarthCharacter copy = new MiddleEarthCharacter(character[i]);
				return copy;
			}
		}
	}
	
	boolean updateCharacter (MiddleEarthCharacter character, String name, int health, int power) 
	{
		int check = 0;
		for(int i = 0; i < size; i++) 
		{
			if (characters[i] == character)
			{
				if(characters[i].name != name) 
				{
					characters[i].name = name;
					check++;
				}
				
				if(characters[i].health != health) 
				{
					characters[i].health = health;
					check++;
				}
				
				if(characters[i].power != power) 
				{
					characters[i].power = power;
					check++;
				}
			}
			
		}
		if(check > 0) 
		{
			return true;
		}
			
		else 
		{
			return false;
		}
	}
	
	
	boolean deleteCharacter(MiddleEarthCharacter character) 
	{
		for (int i = 0; i < size; i++) 
		{
			if(characters[i] == character) 
			{
				
			}
		}
	}
	
	public void displayAllCharacters() 
	{
		for(MiddleEarthCharacter character: characters)
		{
			if (character != null) {
				character.displayInfo();
			}	
	}
}
