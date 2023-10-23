package ThreadsDemo;

public class ErrorInThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ErrorInThread er1 = new ErrorInThread();
		ErrorInThread er2 = new ErrorInThread();
		Thread thread1 = new Thread(er1);
		thread1.setName("1");
		Thread thread2 = new Thread(er2);
		thread2.setName("2");
		thread1.start();
		thread2.start();
		
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5;i++) {
			
			System.out.println(42/ Integer.valueOf(Thread.currentThread().getName()));
			
			try {
				
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
