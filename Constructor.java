package MyPackage;

public class Constructor {
	String name;
	int roll,phone;
	
        Constructor(String s,int m,int n) {
		name=s;
		roll=m;
		phone=n;
	}
	
	void display() {
		System.out.println("name:"+name);
		System.out.println("Roll:"+roll);
		System.out.println("Number:"+phone);
	}

}
