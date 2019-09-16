package Threads;

public class SyncCreazyThread2 implements Runnable {

	int x;
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for (i = 0; i < 2000; i++) {
			synchronized (this) {
				x++;
			}
		}
		System.out.println(Thread.currentThread().getName() + " has finished after " + i + " loops");
	}

	public static void main(String[] args) {
		SyncCreazyThread2 c = new SyncCreazyThread2();
		new Thread(c).start();
		new Thread(c).start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (c) {

			System.out.println("Thread2 ... x is : " + c.x);
		}
	}

}
