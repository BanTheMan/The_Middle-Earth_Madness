package middleearth;


import java.util.Scanner;

public class Menu {
	private Scanner scanner;
	private CharacterManager characterManager;



public Menu() {
	scanner = new Scanner(System.in);
	characterManager = new CharacterManager();
}


public void displayMenu() {
	while (true) {
		System.out.println("\n --== Middle Earth Character Menu ==--\n");
		System.out.println("1. Add a new character.\n");
		System.out.println("2. View all characters.\n");
		System.out.println("3. Update a character.\n");
		System.out.println("4. Delete a character.\n");
		System.out.println("5. Execute all characeters' attack actions.\n");
		System.out.println("6. Exit.\n");
		System.out.println("Please enter an input: \n");
		
		int choice = scanner.nextInt();
		scanner.nextLine();
		
		switch (choice) {
			case 1:
				System.out.println("Input 1 selected.\n");
				addCharacter();
				break;
			
			case 2:
				System.out.println("Input 2 selected.\n");
				viewCharacters();
				break;
			
			case 3:
				System.out.println("Input 3 selected.\n");
				updateCharacter();
				break;
				
			case 4:
				System.out.println("Input 4 selected.\n");
				deleteCharacter();
				break;
				
			case 5:
				System.out.println("Input 5 selected.\n");
				executeAttacks();
				break;
				
			case 6:
				System.out.println("Input 6 selected.\n");
				System.out.println("Exiting system.\n");
				return;
			
			default:
				System.out.println("Invalid input. Please try again.\n");
				}
			}
		}
	
	private void addCharacter() {
		System.out.println("Adding a new character:\n"); //help
	}
	
	private void viewCharacters() {
		characterManager.viewCharacters(); //help
	}
	
	private void updateCharacter() {
		
	}
		
	private void deleteCharacter() {
		
	}
	
	private void executeAttacks() {
		
	}
	
}

	