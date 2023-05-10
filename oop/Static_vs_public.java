package oop;

public class Static_vs_public {
		  static void myStaticMethod() {
		    System.out.println("Static methods can be called without creating objects");
		  }

		  public void myPublicMethod() {
		    System.out.println("Public methods must be called by creating objects");
		  }

		  // Main method
		  public static void main(String[] args) {
		    myStaticMethod(); 
		    // myPublicMethod(); This would compile an error

		    Static_vs_public  myObj = new Static_vs_public();
		    myObj.myPublicMethod(); 
		  }
}
