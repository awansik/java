import java.util.Scanner;
public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Travel Time Calculator!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter miles: ");
			double miles = sc.nextDouble();
			System.out.print("Enter miles per hour:  ");
            double mph = sc.nextDouble();
            System.out.println();

            double hours = miles / mph;

            int minutes = (int) (hours * 60);

            int hoursInt = minutes / 60;
            minutes = minutes % 60;

            System.out.println("Estimated travel time");
            System.out.println("---------------------");
            System.out.println("Hours:   " +  hoursInt);
            System.out.println("Minutes: " +  minutes);
            System.out.println();

            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
		System.out.println("Bye!");
        sc.close();
    }
}
