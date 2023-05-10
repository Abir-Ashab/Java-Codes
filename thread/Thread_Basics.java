package thread;

public class Thread_Basics implements Runnable {
	  public static void main(String[] args) {
		Thread_Basics obj = new Thread_Basics();
	    //Thread thread = new Thread( new Thread_Basics()); upor ar nicher 2 line na likhe etao likha jay
		Thread thread = new Thread(obj);
	    thread.start();
	    while(thread.isAlive()) System.out.println("This code is outside of the thread");
	  }
	  public void run() {//run is not a user defined Method,rather it is developed in runnable interface
	    System.out.println("This code is running in a thread");
	  }
}
