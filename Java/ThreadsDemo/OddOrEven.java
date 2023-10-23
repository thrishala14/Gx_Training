package ThreadsDemo;

/**
 * Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
 */

public class OddOrEven extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		OddOrEven odd = new OddOrEven();
		OddOrEven even = new OddOrEven();
		
		Thread t1 = new Thread(odd);
		Thread t2 = new Thread(even);
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();	
		t1.join(1000);
		
		t2.start();
		t2.join(1000);
		
		
	}
	
	public void run() {
		if(Thread.currentThread().getName() == "t1") {
			for(int i = 1; i<=20; i++) {
				if(i % 2 != 0) {
					System.out.println("odd thread " +i );
				}
			}
		}
		if (Thread.currentThread().getName() == "t2") {
			for(int i = 1; i<=20; i++) {
				if(i % 2 == 0) {
					System.out.println("even thread " +i);
					
				}
			}
			
		}
	}
}
