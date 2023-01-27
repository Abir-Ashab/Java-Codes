package MyPackage;

import java.util.Scanner;

public class Testing {
	 public static void main(String[] args) {
		 
		 String name;
		 int roll,phone;
		 
		 Scanner input=new Scanner(System.in);
		 
		 System.out.println("Enter number of test:");
		 int test=input.nextInt();
			
		    	 while(test!=0){
					 System.out.println("Enter name:");
		    		 name =input.next();
		    		 
		    		 System.out.println("Enter roll:");
		    		 roll =input.nextInt();
		    		 
		    		 System.out.println("Enter phone number:");
		    		 phone=input.nextInt();
		    		 
		    		 test--;
		    		 
		    		 Constructor first=new Constructor(name,roll,phone);
		    		 
		    		 first.display(); 
		    }
		    	 
		    }

		 
		 //Constructor first= new Constructor("niloy",15,1794406966);
		 
		 
    
}
