package thread;

public class Thread_Basics_extends_class extends Thread {
	public static void main(String[] args) {
//		Thread_Basics_extends_class thread = new Thread_Basics_extends_class();
//	    thread.start();
	    Thread t = new Thread(new thread(),"shera");
	    t.start();
	    System.out.println("This code is outside of the thread");
	    System.out.println(t.getName());
	  }
}
class thread implements Runnable {
	public void run() {
	    System.out.println("This code is running in a thread");
	}
}
