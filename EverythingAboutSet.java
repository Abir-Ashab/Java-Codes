package collections;

// Java program to demonstrate the
//working of a HashSet
import java.util.*;

public class EverythingAboutSet {
	
	// Main Method
	public static void main(String args[])
	{
		// Creating HashSet and
		// adding elements
		HashSet<String> hs = new HashSet<String>();

		hs.add("Geeks");
		hs.add("For");
		hs.add("Geeks");
		hs.add("Is");
		hs.add("Very helpful");
		hs.add("Aery helpful");

		// Traversing elements
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(hs+"\n");
		
		
		//LinkedHashSet
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		  
        lhs.add("Geeks");
        lhs.add("For");
        lhs.add("Geeks");
        lhs.add("Is");
        lhs.add("Very helpful");
  
        // Traversing elements
        Iterator<String> itr2 = lhs.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        System.out.println(hs+"\n");
        
        //sortedTreeSet
        TreeSet<String> ts = new TreeSet<String>();
        
        ts.add("Geeks");
        ts.add("For");
        ts.add("Geeks");
        ts.add("Is");
        ts.add("Very helpful");
  
        // Traversing elements
        Iterator<String> itr3 = ts.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }
        System.out.println(hs+"\n");
	}
}
//The objects that we insert into the HashSet do not guarantee to be inserted in the same order.
//The objects are inserted based on their hashcode
