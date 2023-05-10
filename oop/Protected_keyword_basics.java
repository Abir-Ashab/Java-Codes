package oop;

public class Protected_keyword_basics {
	protected String fname = "John";
	protected String lname = "Doe";
	protected String email = "john@doe.com";
	protected int age = 24;		
}
class Student extends Protected_keyword_basics {
	  private int graduationYear = 2018;
	  public static void main(String[] args) {
	    Student myObj = new Student();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	    System.out.println("Graduation Year: " + myObj.graduationYear);
	  }
}