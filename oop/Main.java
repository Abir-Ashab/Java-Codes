package oop;

public class Main {
	public static void main(String[] args) {
	    first myObj = new first();
	    System.out.println(myObj.x);
	    myObj.x = 20;//will change the value
	    //myObj.y = 100; eta kaj korbena karon final keyword use korate eta constant hoye gese
	    System.out.println(myObj.y);
	 }
}
