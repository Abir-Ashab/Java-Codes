package oop;

public class Overriding_Basics extends kahini {
	public static void main(String [] args) {
		Overriding_Basics obj = new Overriding_Basics();
		System.out.println(obj.add(3, 4));
	}
	@Override
	public int add(int a, int b) {
		return (a + b) + 5;
	}
}
class kahini {
	public int add(int a, int b) {
		return (a + b);
	}
}