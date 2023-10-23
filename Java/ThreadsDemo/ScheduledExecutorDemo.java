package ThreadsDemo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledExecutorService ex = 
				Executors.newScheduledThreadPool(1);
		MyClass1 m1 = new MyClass1("a");
		MyClass1 m2 = new MyClass1("b");
		
		ex.schedule(m1, 2, TimeUnit.SECONDS);
		ex.schedule(m2, 1, TimeUnit.MILLISECONDS);
		ex.scheduleAtFixedRate(m2, 1, 2, TimeUnit.SECONDS);
	}

}
