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
	 * Add character
	 * @param c character to be added to the manager/array.
	 * @return True or False based on whether the character was added or not.
	 */
	public boolean addCharacter(MiddleEarthCharacter c) 
	{
		if(c != null) {
			if(characters.length <= size) 
			{
				MiddleEarthCharacter[] temp = new MiddleEarthCharacter[characters.length * 2];
				for(int j = 0; j < size; j++) 
				{
					temp[j] = characters[j];
				}
				characters = temp;
			}
			
			size++;
				
			for(int i = 0; i < this.characters.length; i++) 
			{
				if(characters[i] == null) {
					characters[i] = c;
					return true;
				}
			}
		}
	return false;	
	}
	
	/**
	 * Retrieve character
	 * @param name to be searched for in the manager.
	 * @return A copy of the character that matches the name given.
	 */
	public MiddleEarthCharacter getCharacter(String name) 
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
	 * Update character
	 * @param character to be updated, the name, health, and power to be inserted if need be.
	 * @return true or false based on if there was an update made to a character or not.
	 */
	public boolean updateCharacter (MiddleEarthCharacter character, String name, int health, int power) 
	{
		//find index
		int index = -1;
		for(int i = 0; i < characters.length; i++) 
		{
			if(characters[i] != null && characters[i].getName().equals(name)) 
			{
					index = i;
					break;
			}
		}
		if (index == -1) {
			System.out.println("Couldn't find character.");
			return false;
		}
		
		MiddleEarthCharacter characterToUpdate = characters[index];
		
		int check = 0;
		if(!characterToUpdate.getName().equals(name)) 
		{
			characterToUpdate.setName(name);
			check++;
		}
		
		if(characterToUpdate.getHealth() != health) 
		{
			characterToUpdate.setHealth(health);
			check++;
		}
		
		if(characterToUpdate.getPower() != power) 
		{
			characterToUpdate.setPower(power);
			check++;
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
	 * Delete character
	 * @param character to be deleted.
	 * @return true or false depending on if a character was deleted or not by the function.
	 */
	public boolean deleteCharacter(MiddleEarthCharacter character) 
	{
		if(character == null) {
			System.out.println("Character not found.");
			return false;
		}
		
		MiddleEarthCharacter[] temp = new MiddleEarthCharacter[characters.length];
		int newSize = 0;
		
		for(int i = 0; i < characters.length; i++) 
		{
			if(characters[i] != null && !characters[i].getName().equals(character.getName())) 
			{
				temp[newSize] = characters[i];
				newSize++;
			}
		}
		
		characters = temp;
		size = newSize;
		return true;
	}
	
	/**
	 * Display all character information
	 */
	public void displayAllCharacters() 
	{
		for(MiddleEarthCharacter character: this.characters)
		{
			if (character != null) 
			{
				character.displayInfo();
			}	
		}
	}
}
