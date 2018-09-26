import java.io.File;

public class PathCheckerApp {

	public static void main(String[] args) {
		System.out.println("Path Checker");
		System.out.println();
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			String path = null;
			path = Console.getString("Enter a path: ");
			File file = new File(path);
			if (file.exists()) {
				if (file.isFile()) {
					System.out.println("That path points to a file.");
		}
				else if (file.isDirectory()) {
					System.out.println("That path points to a directory.");
				}
			} else {
				System.out.println("That path does not exist.");
			}
				choice = Console.getString("Continue? (y/n): ");
		}
		System.out.println("Bye");
	}
}
