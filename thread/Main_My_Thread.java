package thread;

public class Main_My_Thread {
	public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        // Wait for the thread to complete
        while (myThread.isAlive()) {
            System.out.println("Waiting for MyThread to finish...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("MyThread has completed.");
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread is running...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread has finished executing.");
    }
}

