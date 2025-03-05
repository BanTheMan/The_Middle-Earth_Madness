package middleearth.management;

import middleearth.characters.Elf;
import middleearth.characters.MiddleEarthCharacter;

public class CharacterManager {
	private MiddleEarthCharacter[] characters = new MiddleEarthCharacter[5]; 
	private int size;
	
	public boolean addCharacter(MiddleEarthCharacter c) 
	{
		if(characters.length == size) 
		{
			MiddleEarthCharacter[] temp = new MiddleEarthCharacter[size * 2];
			for (MiddleEarthCharacter character : characters) {
				// example
			}
			for(int j = 0; j < size; j++) 
			{
				temp[j] = characters[j];
			}
			temp[size+1] = c;
			characters = temp;
			size++;
			return true;
		}
			
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
			if(characters[i].getName().equals(name)) 
			{
				MiddleEarthCharacter copy = new Elf(
						characters[i].getName(), 
						characters[i].getHealth(i), 
						characters[i].getPower());
				characters[i].getRace();
				// Look at constructor parameters and pass them by retrieving them from the character
				// Make a copy of the character as their respective class - may require switch case
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
				if(characters[i].getName() != name) 
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
		MiddleEarthCharacter[] temp = new MiddleEarthCharacter[size];
		for(int i = 0; i < size; i++) 
		{
			if(characters[i] != character) 
			{
				temp[i] = characters[i];
			}
		}
		
		characters = temp;
		size--;
		return true;
	}
	
	public void displayAllCharacters() 
	{
		for(MiddleEarthCharacter character: characters)
		{
			if (character != null) 
			{
				character.displayInfo();
			}	
		}
	}
}
