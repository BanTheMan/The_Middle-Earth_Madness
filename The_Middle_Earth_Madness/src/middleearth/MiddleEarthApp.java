package middleearth;


/**
 * Author: Nate Spencer
 */
public class MiddleEarthApp {

	/**
	 * Calls menu for user interface
	 * @param args for main method
	 */
	public static void main(String[] args) {
		
		System.out.println("\nWelcome to Middle Earth Madness!\n");
		
		Menu menu = new Menu();
		menu.displayMenu();
		
	}
}

