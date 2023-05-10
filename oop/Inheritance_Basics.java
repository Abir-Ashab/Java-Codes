package oop;

//sub-class/child-class
class Vehicle {
	  protected String brand = "Ford";       
	  static void honk() {                 
	    System.out.println("Tuut, tuut!");
	  }
}

public class Inheritance_Basics extends Vehicle {
	  private String modelName = "Mustang";    // Car attribute
	  public static void main(String[] args) {

	    // Create a myCar object
		Inheritance_Basics myCar = new Inheritance_Basics();

	    // Call the honk() method (from the Vehicle class) on the myCar object
	    myCar.honk();

	    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
	    System.out.println(myCar.brand + " " + myCar.modelName);		  
	}
}

//If I don't want other classes to inherit from a class, use the final keyword: