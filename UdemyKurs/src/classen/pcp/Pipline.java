package classen.pcp;

public class Pipline {
	private Object data = null;

	public synchronized void put(Object newData) {
		System.out.println("Producer " + Thread.currentThread().getName() + " entreded put()....");
		while (data != null) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		data = newData;
		System.out.println("Producer " + Thread.currentThread().getClass() + " put data : " + data);
		this.notifyAll();
	}

	public synchronized Object get() {
		System.out.println("Consumer : entered get().... ");
		while (data == null) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Object theData = data;
		data = null;
		System.out.println("Consumer retrieved data : " + theData);
		this.notifyAll();
		return theData;
	}
}
