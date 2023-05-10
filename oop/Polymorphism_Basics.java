package oop;

class Animal {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
}

class Pig extends Animal {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
}

class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
}

public class Polymorphism_Basics {
	public static void main(String[] args) {
	    Animal myAnimal = new Animal();// Create a Animal object, normal
	    Animal myPig = new Pig();// Create a Pig object,upore eta extend koray kono labh e hoyni
	    Animal myDog = new Dog();// Create a Dog object,upore eta extend koray kono labh e hoyni
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();
	}
}


//Why And When To Use "Inheritance" and "Polymorphism"?
//- It is useful for code reusability: 
//reuse attributes and methods of an existing class when you create a new class.