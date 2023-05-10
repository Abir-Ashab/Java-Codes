package oop;

private class Private_keyword_basics {
	private String fname = "John";
	private String lname = "Doe";
	private String email = "john@doe.com";
	private int age = 24;	
}
class Student extends Private_keyword_basics {//private class extend kora jayna
	  private int graduationYear = 2018;
	  public static void main(String[] args) {
	    Student myObj = new Student();
	    //private variable access kora jayna onno class theke
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	    System.out.println("Graduation Year: " + myObj.graduationYear);
	  }
}
