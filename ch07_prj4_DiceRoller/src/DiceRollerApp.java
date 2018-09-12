import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Roll the dice (y/n)? ");
		String choice = sc.next();
		while (choice.equalsIgnoreCase("y")) {
			// new instance will automatically roll the dice
			Dice d = new Dice();
			// Dice toString() will return result of roll
			System.out.println(d);
			
			System.out.println("Roll again (y/n)? ");
			choice = sc.next();
		}
		
		sc.close();
		System.out.println("Bye!");
	}

}
