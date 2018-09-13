import java.util.Scanner;

public class StuffyDispenserApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stuffy Dispenser!");
		System.out.println("Create a new Stuffy...");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter stuffy name: ");
		String name = sc.next();
		
		System.out.println("Enter stuffy type: ");
		String type = sc.next();
		
		System.out.println("Enter stuffy color: ");
		String color = sc.next();
		
		Stuffy myStuffy = new Stuffy(name, type, color);
		
		System.out.println("New stuffy: "+myStuffy);
		
		Stuffy s2 = new Stuffy("bruce", "Monkey", "green");
		System.out.println(s2);
		System.out.println(myStuffy);
		sc.close();
		System.out.println("Bye!");
	}

}
