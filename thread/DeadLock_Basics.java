package thread;

//Since, both threads are waiting for each other to release the lock,
//the condition is called deadlock.
public class DeadLock_Basics {
	public static void main(String[] args) {  
	    final String resource1 = "ratan jaiswal";  
	    final String resource2 = "vimal jaiswal";  
	    // t1 tries to lock resource1 then resource2  
	    Thread t1 = new Thread() {  
	      public void run() {  
	          synchronized (resource1) {  
	           System.out.println("Thread 1: locked resource 1");  
	  
	           try { Thread.sleep(100);} catch (Exception e) {}  
	  
	           synchronized (resource2) {  
	            System.out.println("Thread 1: locked resource 2");  
	           }  
	         }  
	      }  
	    };  
	  
	    // t2 tries to lock resource2 then resource1  
	    Thread t2 = new Thread() {  
	      public void run() {  
	        synchronized (resource2) {  
	          System.out.println("Thread 2: locked resource 2");  
	  
	          try { Thread.sleep(100);} catch (Exception e) {}  
	  
	          synchronized (resource1) {  
	            System.out.println("Thread 2: locked resource 1");  
	          }  
	        }  
	      }  
	    };  
	  
	      
	    t1.start();  
	    t2.start();  
	  }  
}       
//Deadlocks cannot be completely resolved. But we can avoid them by following basic rules mentioned below:
//Avoid Nested Locks: We must avoid giving locks to multiple threads, this is the main reason for a deadlock condition. It normally happens when you give locks to multiple threads.
//Avoid Unnecessary Locks: The locks should be given to the important threads. Giving locks to the unnecessary threads that cause the deadlock condition.
//Using Thread Join: A deadlock usually happens when one thread is waiting for the other to finish. In this case, we can use join with a maximum time that a thread will take.