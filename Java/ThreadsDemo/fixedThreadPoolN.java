package ThreadsDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyClass1 implements Runnable{

	String s;
	 public MyClass1(String s) {
		 this.s = s;
	 }
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i< 3; i++) {
			System.out.println(i + " Running..." +s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
		
	}
	
}
public class fixedThreadPoolN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		ExecutorService fixedPool = Executors.newFixedThreadPool(3);
		
		for(int i = 0; i< 3; i++) {
			MyClass1 m = new MyClass1("string " +i);
			fixedPool.execute(m);
		}
	}

}
