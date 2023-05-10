package file;
import java.io.*;
import java.util.*;
public class Read_Write {
	public static void main(String args[]) {
		
	File obj = new File("info.txt");
//	
//	try {
//		if(obj.createNewFile()) {
//			System.out.println(obj.getName());
//		}
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
	try {
		FileWriter file = new FileWriter("info.txt");
		file.write("hello world");
		file.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	try {
	      Scanner myReader = new Scanner(obj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	if(obj.delete()) System.out.println("file Deleted");
	}
	
}
