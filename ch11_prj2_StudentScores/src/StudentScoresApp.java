import java.util.Arrays;

public class StudentScoresApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Student Scores App");
		
		int n = Console.getInt("# of students: ", 0, Integer.MAX_VALUE);
		
		Student[] students = new Student[n];
		for (int i=0; i < n; i++) {
			System.out.println("STUDENT "+ (i+1));
			String lName = Console.getString("Last Name: ");
			String fName = Console.getString("First Name: ");
			int s = Console.getInt("Score: ", -1, 101);
			Student student = new Student(fName, lName, s);
			students[i] = student;
		}
		
		Arrays.sort(students);
		
		System.out.println("SUMMARY");
		for (Student s : students) {
			System.out.println(s);
		}
		System.out.println("Bye!");
	}

}
