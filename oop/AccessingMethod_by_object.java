package oop;

//method must be declared within the class
public class AccessingMethod_by_object {
	  public void fullThrottle() {
	    System.out.println("The car is going as fast as it can!");
	  }

	  public void speed(int maxSpeed) {
	    System.out.println("Max speed is: " + maxSpeed);
	  }

	  public static void main(String[] args) {
		AccessingMethod_by_object myCar = new AccessingMethod_by_object();  
	    myCar.fullThrottle();      
	    myCar.speed(200);          
	  }
}
