package finalExam;

public class DivisorException {
     private boolean Allow=false;
     public DivisorException(boolean Allow) {
    	 this.Allow=Allow;
     }
     public void returD(double divisor,double dividend) {
    	 if(divisor==0 && !Allow) {
    		 System.out.println(dividend+" is divided by zero");
    	 }
     }
}