package middleearth.management;

import middleearth.characters.Elf;
import middleearth.characters.Dwarf;
import middleearth.characters.Orc;
import middleearth.characters.Wizard;
import middleearth.characters.Human;
import middleearth.characters.MiddleEarthCharacter;


/**
 * Author: Ivan R.
 */
public class CharacterManager {
	private MiddleEarthCharacter[] characters = new MiddleEarthCharacter[5]; 
	private int size = 0;
	
	/**
	 * @param Character to be added to the manager/array.
	 * @return True or False based on whether the character was added or not.
	 */
	boolean addCharacter(MiddleEarthCharacter c) 
	{
		if(c != null) {
			if(characters.length == size) 
			{
				MiddleEarthCharacter[] temp = new MiddleEarthCharacter[size * 2];
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
	}
	return false;	
	}
	
	/**
	 * @param Name to be searched for in the manager.
	 * @return A copy of the character that matches the name given.
	 */
	MiddleEarthCharacter getCharacter(String name) 
	{
		MiddleEarthCharacter copy = null;
		
		for(int i = 0; i < size; i++) 
		{
			if(characters[i].getName().equals(name)) 
			{
				switch(characters[i].getRace()) 
				{
				case "Elf": copy = new Elf(
						characters[i].getName(), 
						characters[i].getHealth(), 
						characters[i].getPower());
					return copy;
				
				case "Orc": copy = new Orc(
						characters[i].getName(), 
						characters[i].getHealth(), 
						characters[i].getPower());
					return copy;
				
				case "Human": copy = new Human(
						characters[i].getName(), 
						characters[i].getHealth(), 
						characters[i].getPower());
					return copy;
				
				case "Wizard": copy = new Wizard(
						characters[i].getName(), 
						characters[i].getHealth(), 
						characters[i].getPower());
					return copy;
				
				case "Dwarf": copy = new Dwarf(
						characters[i].getName(), 
						characters[i].getHealth(), 
						characters[i].getPower());
					return copy;
				}
			}
		}
		return copy;
	}
	
	/**
	 * @param Character to be updated, the name, health, and power to be inserted if need be.
	 * @return true or false based on if there was an update made to a character or not.
	 */
	public boolean updateCharacter (MiddleEarthCharacter character, String name, int health, int power) 
	{
		int check = 0;
		for(int i = 0; i < size; i++) 
		{
			if (characters[i] == character)
			{
				if(characters[i].getName() != name) 
				{
					characters[i].setName(name);
					check++;
				}
				
				if(characters[i].getHealth() != health) 
				{
					characters[i].setHealth(health);
					check++;
				}
				
				if(characters[i].getPower() != power) 
				{
					characters[i].setPower(power);
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
	
	/**
	 * @param Character to be deleted.
	 * @return true or false depending on if a character was deleted or not by the function.
	 */
	boolean deleteCharacter(MiddleEarthCharacter character) 
	{
		if(character != null) 
		{
		MiddleEarthCharacter[] temp = new MiddleEarthCharacter[size];
		for(int i = 0; i < size; i++) 
		{
			if(characters[i] != character && characters[i] != null) 
			{
				temp[i] = characters[i];
			}
		}
		
		characters = temp;
		size--;
		return true;
		}
		return false;
	}
	
	/**
	 * @param None, just called.
	 * @return Nothing, just prints all of the characters in the manager.
	 */
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
