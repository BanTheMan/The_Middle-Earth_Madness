package middleearth.management;

import middleearth.characters.Elf;
import middleearth.characters.Dwarf;
import middleearth.characters.Orc;
import middleearth.characters.Wizard;
import middleearth.characters.Human;
import middleearth.characters.MiddleEarthCharacter;

public class CharacterManager {
	private MiddleEarthCharacter[] characters = new MiddleEarthCharacter[5]; 
	private int size = 0;
	
	public boolean addCharacter(MiddleEarthCharacter c) 
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
	
	boolean updateCharacter (MiddleEarthCharacter character, String name, int health, int power) 
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
