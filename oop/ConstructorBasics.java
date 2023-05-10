package oop;

public class ConstructorBasics {
	  int modelYear;
	  String modelName;

	  public ConstructorBasics(int modelYear, String modelName) {
	    this.modelYear = modelYear;
	    this.modelName = modelName;
	  }

	  public static void main(String[] args) {
		ConstructorBasics myCar = new ConstructorBasics(1969, "Mustang");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	  }
}
