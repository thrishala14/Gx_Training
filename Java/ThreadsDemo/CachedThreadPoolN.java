package ThreadsDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolN {
	public static void main(String[] args) {
		ExecutorService ex = Executors.newCachedThreadPool(); 
		
		ex.submit(new MyClass());  
	    ex.submit(new MyClass());  
	    
	}
}
