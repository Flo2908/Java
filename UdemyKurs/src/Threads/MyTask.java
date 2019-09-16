package Threads;

import java.awt.SystemColor;
import java.util.Random;

public class MyTask implements Runnable {

	private boolean alive = true;

	@Override
	public void run() {

		long start = System.currentTimeMillis();

		int bestMove = Integer.MIN_VALUE;
		Random rnd = new Random();
		for (int i = 1; i <= 100; i++) {
			for (int j = 0; j < 2000; j++) {
				for (int k = 0; k < 2000; k++) {
					synchronized (rnd) {

						if (!alive) {
							System.out.println("Thread wurde beendet...");
							return;
						}
					}
					int move = rnd.nextInt();
					if (move > bestMove) {
						bestMove = move;
					}
				}
			}
			System.out.println("Thinking .... " + i + "%");
		}
		long stop = System.currentTimeMillis();
		long time = stop - start;
		System.out.println(Thread.currentThread().getName() + " FINISHED AFTER " + time / 1000. + " secondes.");

	}

	public synchronized void cancel() {
		//synchronized (this) {
			alive = false;
		//}
	}
	public static synchronized void x() {
		// ---> ruf intern synchronized(MyTask.class) auf
	}

}
