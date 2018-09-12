import java.text.NumberFormat;
import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
	System.out.println("Welcome to the Temperature Converter");
	Scanner sc = new Scanner(System.in);
	
	String choice = "y";
	while (choice.equalsIgnoreCase("y")) {

	System.out.println("Enter Degrees in Fahrenheit: ");
	double Fahrenheit = sc.nextDouble();
	double Celsius = (Fahrenheit - 32) * 5/9;
	
	NumberFormat number = NumberFormat.getNumberInstance();
	number.setMaximumFractionDigits(2);
	System.out.println("Degrees in Celsius: " + number.format(Celsius));
	
	System.out.print("Continue? y/n: ");
	choice = sc.next();
	
	System.out.println("Bye!");
	
	}
		sc.close();
}
}