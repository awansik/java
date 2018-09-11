
public class Grade {
	private int number;

	public Grade() {
		super();
		number = 0;
	}

	public Grade(int number) {
		super();
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	//Convert the number to a letter grade
	public String getLetter() {
		String letterGrade = "";
		
		// Convert the numericGrade to letterGrade
				if (number>=88) {
					letterGrade = "A";
				} else if (number >= 80) {
					letterGrade = "B";
				} else if (number >= 68) {
					letterGrade = "C";
				} else if (number >= 60) {
					letterGrade = "D";
				} else {
					letterGrade = "F";
				}
		
		return letterGrade;
	}
}
