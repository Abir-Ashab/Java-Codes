package finalExam;

import java.util.Scanner;

public class StringTOint {
   public static void main(String []args) {
	   //string to int
	   String anotherPalindrome = "1092090121"; 
	   int m=Integer.valueOf(anotherPalindrome);
	   System.out.println(m);
	   //char to int
	   char a = anotherPalindrome.charAt(9);
	   int i=a-'0';
       System.out.println(i);
       
	   
	   String []s= {"1000","jhsjhj"};  
	   for(int e=0;e<s.length;e++) {
		   System.out.println(s[e]);
	   }
	   
	   
	   Scanner input = new Scanner(System.in);
	   
		char s2[]=new char[5];
		   for(int j=0;j<5;j++) {
			   char x = input.next().charAt(0);
			   s2[j] =x;
		   }
	   for(int k=0;k<5;k++) {
		   System.out.println(s2[k]);
	   }
	  
   }
   
}
