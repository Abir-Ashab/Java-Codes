package collections;

import java.util.ArrayList;

public class EverythingAboutArrayList {
	public static void main(String [] args) {
		ArrayList <Integer> list = new ArrayList<Integer> (); 
		
		for (int i = 1; i <= 5; i++)
            list.add(i);
  
        // Printing elements
        System.out.println(list);
  
        // Remove element at index 3
        list.remove(3);
  
        // Displaying the ArrayList
        // after deletion
        System.out.println(list);
  
        // Printing elements one by one
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
	}
}
