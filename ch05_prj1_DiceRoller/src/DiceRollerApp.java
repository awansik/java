import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
        System.out.println("Dice Roller");
        System.out.println();  

        Scanner sc = new Scanner(System.in);
        
        String choice = getUserChoice(sc, "Roll the dice? (y/n): ");

        while (choice.equalsIgnoreCase("y")) {
            int die1 = rollDie();
            int die2 = rollDie();
            printDice(die1, die2);

            choice = getUserChoice(sc, "Roll again? (y/n): ");
        }
    }
    
    private static String getUserChoice(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.next();
    }
    
    private static int rollDie() {
        return (int)(Math.random() * 6) + 1;
    }
    
    private static void printDice(int die1, int die2) {
        int total = die1 + die2;
        
        System.out.println();
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total: " + total);
        printSpecialMessage(total);
    }
    
    private static void printSpecialMessage(int total) {
        switch (total) {
            case 2:
                System.out.println("Snake eyes!");
                System.out.println();
                break;
            case 12:
                System.out.println("Boxcars!");
                System.out.println();
                break;
            default:
                System.out.println();
        }
    }

}
