package generics;

// Using Java Generics converts run time exceptions into
//compile time exception.
import java.util.*;

public class GenericsInArrayList 
{
	public static void main(String[] args)
	{
		// Creating a an ArrayList with String specified
		ArrayList <String> al = new ArrayList<String> ();

		al.add("Sachin");
		al.add("Rahul");

		// Now Compiler doesn't allow this
		
		//al.add(10);
		
		//because the type of the ArrayList is String,if you add anything else then 
		//it will give error without running the code which is far better than run time error
		
		String s1 = (String)al.get(0);
		String s2 = (String)al.get(1);
		//String s3 = (String)al.get(2);
		System.out.println(s1);
		System.out.println(s2);
	}
}

