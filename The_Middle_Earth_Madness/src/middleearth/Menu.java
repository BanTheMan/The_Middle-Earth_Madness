package middleearth;


import java.util.Scanner;

public class Menu {
	private Scanner scanner;
	private CharacterManager characterManager;



public Menu() {
	scanner = new Scanner(System.in);
	characterManager = new CharacterManager();
}

	while (true) {
public void displayMenu() {
	System.out.println("\n --== Middle Earth Character Menu ==--\n");
	System.out.println("1. Add a new character.\n");
	System.out.println("2. View all characters.\n");
	System.out.println("3. Update a character.\n");
	System.out.println("4. Delete a character.\n");
	System.out.println("5. Execute all characeters' attack actions.\n");
	System.out.println("6. Exit.\n");
	
	System.out.println("Please enter an input: \n");
	int choice = scanner.nextInt();
	
	switch (choice) {
		case 1:
			addCharacter();
			break;
		
		case 2:
			viewCharacters();
			break;
		
		case 3:
			updateCharacter();
			break;
			
		case 4:
			deleteCharacter();
			break;
			
		case 5:
			executeAttacks();
			break;
			
		case 6:
			System.out.println("Exiting system.\n");
			return;
		
		default:
			System.out.println("Invalid input. Please try agian.\n");
			
	}
	
	
	
	
	
	
	
}