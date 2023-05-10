package oop;

abstract class Abstarction_basics {
	  public String fname = "John";
	  public int age = 24;
	  public abstract void study(); // abstract method which doesnot have any body
	  void kahini() {
		  System.out.println("shei natok");
	  }
}

//subclass (inherit from Main)
class info extends Abstarction_basics {
	  public int graduationYear = 2018;
	  //the body of the abstract method is provided here
	  public void study() { 
	    System.out.println("Studying all day long");
	  }
}
class calc {
	  public static void main(String[] args) {
	  //create an object of the Student class (which inherits attributes and methods from Main)
	  info myObj = new info();

	  System.out.println("Name: " + myObj.fname);
	  System.out.println("Age: " + myObj.age);
	  System.out.println("Graduation Year: " + myObj.graduationYear);
	  myObj.study();
	  myObj.kahini();
	 }
}
		  