package ThreadsDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyClass implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i< 5; i++) {
			System.out.println("Running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
}
public class SingleExecutor{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		ExecutorService ex = Executors.newSingleThreadExecutor();
		
		ex.execute(new MyClass());
		
	}

}
