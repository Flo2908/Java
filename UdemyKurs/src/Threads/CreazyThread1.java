
package Threads;

import javax.naming.LimitExceededException;

public class CreazyThread1 implements Runnable {

	private static final long LIMIT = 1000000000L;
	boolean alive;
	long i;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("C.Thread1 started.....");
		i = 0;
		alive = true;
		while (true) {
			if (alive) {
				i++;
			} else {
				break;
			}
		}
		System.out.println("C.Thread ends....");
	}

	public static void main(String[] args) {
		CreazyThread1 c = new CreazyThread1();
		new Thread(c).start();

		while (Thread.activeCount() > 1) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			long iNow = c.i;
			System.out.println("Thread1 :" + iNow );
			if(iNow>= LIMIT) {
				c.alive = false;
				System.out.println("Thread1 STOPPED! ( alive = " + c.alive + ")");
			}
		}
		System.out.println("Programm Thread1 exit...");
	}
}
