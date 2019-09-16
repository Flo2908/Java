package Threads;

public class SyncCreazyThread3 implements Runnable {

	int x;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int loop = 0;
		while (true) {
			synchronized (this) {
				if (x < 10000) {
					x++;
					loop++;
				} else {
					break;
				}

			}
		}
		System.out.println(Thread.currentThread().getName() + " has finished after " + loop + " loops");
	}

	public static void main(String[] args) {
		SyncCreazyThread3 c = new SyncCreazyThread3();
		new Thread(c).start();
		new Thread(c).start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (c) {

			System.out.println("Thread3 ... x is : " + c.x);
		}
	}

}
