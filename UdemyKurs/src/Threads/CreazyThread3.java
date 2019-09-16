package Threads;

public class CreazyThread3 implements Runnable{

	int x;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int loop  =0 ;
		while(true) {
			if(x < 10000) {
				x++;
				loop++;
			
			}else {
				break;
			}
		}
		System.out.println(Thread.currentThread().getName() 
				+ " has finished after " + loop + " loops" );
	}
	public static void main(String[] args) {
		CreazyThread3 c = new CreazyThread3();
		new Thread(c).start();
		new Thread(c).start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread3 ... x is : " + c.x);
	}

}
