package Threads;

public class MultiThreadingDemo {

	public static void main(String[] args) {

		MyTask t = new MyTask();
		Thread thread = new Thread(t);
		thread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
			t.cancel();
		

	}
}
