package ThreadsDemo;

public class SleepMethod extends Thread{
	public static void main(String[] args) throws InterruptedException {
		RunnableExample1 runex1 = new RunnableExample1();
		RunnableExample2 runex2 = new RunnableExample2();
		Thread thread1 = new Thread(runex1);
		thread1.start();
		Thread thread2 = new Thread(runex2);
		
		thread2.start();
		
	}
}
class RunnableExample1 extends Thread {
	public void run() {
		
		for(int i=0; i<10;i++) {
		System.out.println("inside run ex 1");
		try {
			
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
class RunnableExample2 extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0; i<10;i++) {
		System.out.println("inside run ex 2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
