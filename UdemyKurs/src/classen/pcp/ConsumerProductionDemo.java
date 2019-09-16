package classen.pcp;

public class ConsumerProductionDemo {

	public static void main(String[] args) {

		Pipline pipeline = new Pipline();

		Producer p1 = new Producer(pipeline);
		Producer p2 = new Producer(pipeline);
		Producer p3 = new Producer(pipeline);
		Consumer c = new Consumer(pipeline);

		new Thread(p1).start();
		new Thread(p2).start();
		new Thread(p3).start();
		new Thread(c).start();

	}
}
