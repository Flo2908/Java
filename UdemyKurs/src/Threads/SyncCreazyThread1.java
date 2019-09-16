
package Threads;

public class SyncCreazyThread1 implements Runnable {

	private static final long LIMIT = 1000000000L;
	//volatile 
	boolean alive;
	//volatile 
	long i;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("C.Thread1 started.....");
		i = 0;
		alive = true;
		while (true) {
			synchronized (this) {
				if (alive) {
					i++;
				} else {
					break;
				}
			}
		}
		System.out.println("C.Thread ends....");
	}

	public static void main(String[] args) {
		SyncCreazyThread1 c = new SyncCreazyThread1();
		new Thread(c).start();

		while (Thread.activeCount() > 1) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			long iNow;
			synchronized (c) {
				iNow = c.i;
				System.out.println("Thread1 :" + iNow);
				if (iNow >= LIMIT) {
					synchronized (c) {
						c.alive = false;
					}
					System.out.println("Thread1 STOPPED! ( alive = " + c.alive + ")");
				}
			}
		}
		System.out.println("Programm Thread1 exit...");
	}
}
