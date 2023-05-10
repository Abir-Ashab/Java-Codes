package exception_Handling;

public class Try_Catch {
	public static void main(String[ ] args) {
		int[] myNumbers = {1, 2, 3};
	    try {
	      System.out.println(myNumbers[10]);
	    } 
	    catch (IndexOutOfBoundsException | ArithmeticException e) {
	      //e.printStackTrace();
	      if(e instanceof IndexOutOfBoundsException )System.out.println("Index bere gechhe");
	      else System.out.println("something else");
	    }
	    finally {
	      System.out.println("It will must execute whether error occur or not");
	    }
	}
}
