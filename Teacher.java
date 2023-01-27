package inheritance;

public class Teacher extends Person {
	String qualification;
	void displayInformation2() {
	 displayInformation();
	 System.out.println("qualification :"+qualification);
	}
}
