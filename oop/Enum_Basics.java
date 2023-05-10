package oop;

public class Enum_Basics {  
	enum Day { 
		SUNDAY(3), MONDAY(4), TUESDAY(10), WEDNESDAY(2);
		private int value;  
		Day(int value) {  
		this.value=value;  
		}  
	}  
	public static void main(String args[]) {  
	  Day day=Day.WEDNESDAY;  
	  
	  switch(day){  
	   case SUNDAY: {  
	   System.out.println(day + " = "  + day.value);  
	   break;  
	   }
	   case MONDAY: { 
	   System.out.println(day + " = "  + day.value);  
	   break;  
	   }
	   default: { 
	   System.out.println(day + " = "  + day.value);  
	   }
	  }   
	}
}
