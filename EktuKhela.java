package generics;

// Java program to show working
//of user-defined Generic classes

//We use < > to specify Parameter type
public class Test<T> {
	// An object of type T is declared
	T obj;
	Test(T obj) { this.obj = obj; } // constructor
	public T getObject() { return this.obj; }
}

//Driver class to test above
public class EktuKhela {
	public static void main(String[] args)
	{
		// instance of Integer type
		Test<Object> iObj = new Test<Object>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		Test<Object> sObj
			= new Test<Object>("GeeksForGeeks");
		System.out.println(sObj.getObject());
		iObj = sObj; // This results an error
		System.out.println(iObj.getObject());
		System.out.println(sObj.getObject());
	}
}

