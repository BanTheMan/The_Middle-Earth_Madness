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
			if(characters.length == size) 
			{
				MiddleEarthCharacter[] temp = new MiddleEarthCharacter[characters.length * 2];
				for(int j = 0; j < size; j++) 
				{
					temp[j] = characters[j];
				}
				characters = temp;
				return true;
			}

			size++;
				
			for(int i = 0; i < size; i++) 
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
		int check = 0;
		for(int i = 0; i < this.characters.length; i++) 
		{
			if (this.characters[i] == character)
			{
				if(this.characters[i].getName() != name) 
				{
					this.characters[i].setName(name);
					check++;
				}
				
				if(this.characters[i].getHealth() != health) 
				{
					this.characters[i].setHealth(health);
					check++;
				}
				
				if(this.characters[i].getPower() != power) 
				{
					this.characters[i].setPower(power);
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
	 * Delete character
	 * @param character to be deleted.
	 * @return true or false depending on if a character was deleted or not by the function.
	 */
	public boolean deleteCharacter(MiddleEarthCharacter character) 
	{
		if(character != null) 
		{
		MiddleEarthCharacter[] temp = new MiddleEarthCharacter[size];
		for(int i = 0; i < size; i++) 
		{
			if(this.characters[i] != character && this.characters[i] != null) 
			{
				temp[i] = this.characters[i];
			}
		}
		
		this.characters = temp;
		size--;
		return true;
		}
		return false;
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
