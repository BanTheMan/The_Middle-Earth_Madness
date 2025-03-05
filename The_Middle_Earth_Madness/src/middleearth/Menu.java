package middleearth;

import java.util.Scanner;

import middleearth.management.CharacterManager;

import middleearth.characters.MiddleEarthCharacter;

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
		System.out.println("Creating a new character.\n");
		System.out.println("Please select a number to choose your character's race:\n")
		System.out.println("1. Dwarf\n");
		System.out.println("2. Elf\n");
		System.out.println("3. Human\n");
		System.out.println("4. Orc\n");
		System.out.println("5. Wizard\n");
		System.out.println("Please enter an input:\n");
		
		int choice = scanner.nextInt();
		scanner.nextLine();
		
		switch (choice) {
		scanner.nextLine();
		
		
		}
	
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
				case 1: // Consider asking them to choose a race and amount of health & power
					System.out.println("Input 1 selected.\n");
					characterManager.addCharacter(); // Use given information to create and pass a character instance
					break;
				
				case 2:
					System.out.println("Input 2 selected.\n");
					characterManager.displayAllCharacters();
					break;
				
				case 3: // Consider given the user the option to choose which character to update
					System.out.println("Input 3 selected.\n");
					
					
					
					String givenName = selectCharacter();
					characterManager.updateCharacter(characterManager.getCharacter(givenName)); // Ask and pass the character and stats to update
					break;
					
				case 4:
					System.out.println("Input 4 selected.\n");
					characterManager.deleteCharacter(); // Ask for and pass appropriate character
					break;
					
				case 5: // Consider creating an interface for selecting who attacks who
					System.out.println("Input 5 selected.\n");
					characterManager.executeAttacks(); // No function exists, may need to call individually
					break;
					
				case 6:
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

	