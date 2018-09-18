
public class AnimalCounterApp {

	public static void main(String[] args) {
		System.out.println("Counting alligators...");
		Alligator a = new Alligator();
		Sheep s = new Sheep("Blackie");
		Sheep s2 = null;
		try {
		s2 = (Sheep) s.clone();
		}
		catch (CloneNotSupportedException e) {
			System.out.println("Clone not available");
		}
		s2.setName("Dolly");
		count(a,3);
		System.out.println();
		System.out.println("Counting sheep...");
		count(s, 2);
		System.out.println();
		count(s2, 3);
		System.out.println();
		count(s, 1);
		System.out.println("Goodbye!");
	}

	public static void count(Countable c, int maxcount) {
		while (maxcount>0) {
			maxcount-=1;
			c.incrementCount();
			System.out.println(c.getCountString());
		} c.resetCount();
	}
}
