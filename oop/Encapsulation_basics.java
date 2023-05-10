package oop;

public class Encapsulation_basics {
	public static void main(String[] args) {
		run myObj = new run();
	    myObj.setName("John"); // Set the value of the name variable to "John"
	    System.out.println(myObj.toString());
	}
}
class run {
	private String name; // private = restricted access
	// Getter, ja dara private variable e access neya jay
	public String getName() {
	   return name;
	}
	// Setter
	public void setName(String newName) {
	  this.name = newName;
	}	
	@Override
	public String toString() {
		return "name = " + name;
	}
}