package middleearth;

import java.util.Scanner;

import middleearth.characters.*;
import middleearth.management.*;

public class Menu {
	private Scanner scanner;
	private MiddleEarthCouncil council;
	private CharacterManager characterManager;



	/**
	 * Menu constructor
	 */
	public Menu() {
		this.scanner = new Scanner(System.in);
		this.council = MiddleEarthCouncil.getInstance();
		this.characterManager = council.getCharacterManager();
	}
	
	/**
	 * Select a character
	 * @return name of character selected
	 */
	public String selectCharacter() {
		System.out.println("Please input the character's name you wish to select.");
		System.out.println("List of available characters:");
		this.characterManager.displayAllCharacters();
		
		String characterName = scanner.next();
		System.out.println("You selected " + characterName);
		return characterName;
				
	}
	
	/**
	 * Create a new character
	 * @return new character object
	 */
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
				break;

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
				break;
				
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
				break;
				
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
				break;
		
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
				break;
				
			default:
				System.out.println("Invalid input. Please try again.\n");
		
		}
		
		if (newCharacter == null) 
		{
			System.out.println("ERROR: Character creation failed.");
		}
		
		return newCharacter;
	
	}
	
	/**
	 * Select character attack actions
	 */
	public void executeAttacks() {
		
		while(true) {
		System.out.println("Welcome to the Battlefield.");
		System.out.println("1. Actiavte Battle");
		System.out.println("2.Exit Battlefield");
		
		int choice = scanner.nextInt();
		scanner.nextLine();
		
		switch (choice) {
		
		case 1:
		
		System.out.println("Enter the name of the character that will ATTACK:");
		this.characterManager.displayAllCharacters();
		String attackerName = scanner.next();
		MiddleEarthCharacter attacker = this.characterManager.getCharacter(attackerName);
		
		System.out.println("Enter the name of the character that will BE ATTACKED:");
		this.characterManager.displayAllCharacters();
		String victimName = scanner.next();
		MiddleEarthCharacter victim = this.characterManager.getCharacter(victimName);
		attacker.attack(victim);
		break;
		
		case 2:
			System.out.println("Exiting Battlefield.");
			return;
			
		default:
			System.out.println("Invalid input. Please try again.\n");
		
			}
		}
		
	}

	/**
	 * Display user interface
	 */
	public void displayMenu() {
		while (true) {
			System.out.println("\n --== Middle Earth Character Menu ==--");
			System.out.println("1. Add a new character.");
			System.out.println("2. View all characters.");
			System.out.println("3. Update a character.");
			System.out.println("4. Delete a character.");
			System.out.println("5. Execute all characters' attack actions.");
			System.out.println("6. Exit.");
			System.out.println("Please enter an input: ");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
				case 1: //Adding new character
					System.out.println("Input 1 selected.");
					MiddleEarthCharacter newCharacter = createCharacterMenu();
					if(newCharacter == null)
					{
						break;
					}
					
					this.characterManager.addCharacter(newCharacter); 
					break;
				
				case 2: //Viewing all characters
					System.out.println("Input 2 selected.");
					this.characterManager.displayAllCharacters();
					break;
				
				case 3: //Update a character
					System.out.println("Input 3 selected.");
					System.out.println("Selecting a character to update.");
					String updateCharacterName = selectCharacter();
					MiddleEarthCharacter characterToUpdate = this.characterManager.getCharacter(updateCharacterName);
					System.out.println("Input character's new name: (Current name: " + characterToUpdate.getName() + ")");
					String newName = scanner.next();
					System.out.println("Input character's new health: (Current health: " + characterToUpdate.getHealth() + ")");
					int newHealth = scanner.nextInt();
					System.out.println("Input character's new power: (Current power: " + characterToUpdate.getPower() + ")");
					int newPower = scanner.nextInt();
					this.characterManager.updateCharacter(characterToUpdate, newName, newHealth, newPower);
					break;
					
				case 4: //Delete a character
					System.out.println("Input 4 selected.\n");
					System.out.println("Selecting a character to delete.");
					String deleteCharacterName = selectCharacter();
					MiddleEarthCharacter characterToDelete = this.characterManager.getCharacter(deleteCharacterName);
					this.characterManager.deleteCharacter(characterToDelete); 
					break;
					
				case 5: //Execute all character attack actions
					System.out.println("Input 5 selected.\n");
					executeAttacks(); 
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

	