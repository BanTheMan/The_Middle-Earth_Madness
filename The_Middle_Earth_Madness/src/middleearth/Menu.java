package middleearth;

import java.util.Scanner;

import middleearth.management.CharacterManager;
import middleearth.characters.MiddleEarthCharacter;
import middleearth.characters.Dwarf;
import middleearth.characters.Elf;
import middleearth.characters.Human;
import middleearth.characters.Orc;
import middleearth.characters.Wizard;

public class Menu {
	private Scanner scanner;
	private CharacterManager characterManager;



	public Menu() {
		this.scanner = new Scanner(System.in);
		this.characterManager = new CharacterManager();
	}
	
	public String selectCharacter() {
		System.out.println("Please input the character you wish to select.\n");
		String characterName = scanner.next();
		return characterName;
				
	}
	
	public MiddleEarthCharacter createCharacterMenu() {
		System.out.println("Creating a new character.");
		System.out.println("Please select a number to choose your character's race:");
		System.out.println("1. Dwarf");
		System.out.println("2. Elf");
		System.out.println("3. Human");
		System.out.println("4. Orc");
		System.out.println("5. Wizard");
		System.out.println("Please enter an input:");
		
		int choice = scanner.nextInt();
		scanner.nextLine();
		
		MiddleEarthCharacter newCharacter = null;
		
		switch (choice) {
			case 1:
				System.out.println("Please choose your Dwarf's name:");
				String nameD = scanner.next();
				System.out.println("Please choose your Dwarf's health:");
				double healthD = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Please choose your Dwarf's power level:");
				double powerD = scanner.nextDouble();
				scanner.nextLine();
				
				newCharacter = new Dwarf(nameD, healthD, powerD);

			case 2:
				System.out.println("Please choose your Elf's name:");
				String nameE = scanner.next();
				System.out.println("Please choose your Elf's health:");
				double healthE = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Please choose your Elf's power level:");
				double powerE = scanner.nextDouble();
				scanner.nextLine();
				
				newCharacter = new Elf(nameE, healthE, powerE);
				
			case 3:
				System.out.println("Please choose your Human's name:");
				String nameH = scanner.next();
				System.out.println("Please choose your Humam's health:");
				double healthH = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Please choose your Human's power level:");
				double powerH = scanner.nextDouble();
				scanner.nextLine();
				
				newCharacter = new Human(nameH, healthH, powerH);
				
			case 4:
				System.out.println("Please choose your Orc's name:");
				String nameO = scanner.next();
				System.out.println("Please choose your Orc's health:");
				double healthO = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Please choose your Orc's power level:");
				double powerO = scanner.nextDouble();
				scanner.nextLine();
				
				newCharacter = new Orc(nameO, healthO, powerO);
		
			case 5:
				System.out.println("Please choose your Wizard's name:");
				String nameW = scanner.next();
				System.out.println("Please choose your Wizard's health:");
				double healthW = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Please choose your Wizard's power level:");
				double powerW = scanner.nextDouble();
				scanner.nextLine();
				
				newCharacter = new Wizard(nameW, healthW, powerW);
		
			
		}
		
		if (newCharacter == null) 
		{
			System.out.println("ERROR: Character creation failed.");
		}
		
		return newCharacter;
	
	}
	
	public void displayMenu() {
		while (true) {
			System.out.println("\n --== Middle Earth Character Menu ==--\n");
			System.out.println("1. Add a new character.\n");
			System.out.println("2. View all characters.\n");
			System.out.println("3. Update a character.\n");
			System.out.println("4. Delete a character.\n");
			System.out.println("5. Execute all characters' attack actions.\n");
			System.out.println("6. Exit.\n");
			System.out.println("Please enter an input: \n");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
				case 1: //Adding new character
					System.out.println("Input 1 selected.\n");
					MiddleEarthCharacter newCharacter = createCharacterMenu();
					if(newCharacter == null)
					{
						break;
					}
					
					characterManager.addCharacter(newCharacter); // Use given information to create and pass a character instance
					break;
				
				case 2: //Viewing all characters
					System.out.println("Input 2 selected.\n");
					characterManager.displayAllCharacters();
					break;
				
				case 3: //Update a character
					System.out.println("Input 3 selected.\n");
					String givenName = selectCharacter();
					characterManager.updateCharacter(characterManager.getCharacter(givenName)); // Ask and pass the character and stats to update
					break;
					
				case 4: //Delete a character
					System.out.println("Input 4 selected.\n");
					characterManager.deleteCharacter(); // Ask for and pass appropriate character
					break;
					
				case 5: //Execute all character attack actions
					System.out.println("Input 5 selected.\n");
					characterManager.executeAttacks(); // No function exists, may need to call individually
					break;
					
				case 6: //Exit
					System.out.println("Input 6 selected.\n");
					System.out.println("Exiting system.\n");
					scanner.close();
					return;
				
				default:
					System.out.println("Invalid input. Please try again.\n");
				}
			}
		}
}

	