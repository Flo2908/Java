package classen.pcp;

public class Consumer implements Runnable {

	private final Pipline pipeline;
	
	public Consumer(Pipline pipeline) {
		this.pipeline = pipeline;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Consumer wants to enter get()...");
			pipeline.get();
			
			try {
				Thread.sleep((long)(Math.random() * 2000));
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
