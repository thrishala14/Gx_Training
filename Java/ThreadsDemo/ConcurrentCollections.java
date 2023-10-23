package ThreadsDemo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollections extends Thread{

	static ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<Integer, String>();
	
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("child thread");
		chm.put(10, "rrr");
		for (Map.Entry<Integer, String> set :chm.entrySet()) {

	           // Printing all elements of a Map
	           System.out.println(set.getKey() + " = "
	                              + set.getValue());
	       }
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		chm.put(1, "a");
		chm.put(2, "b");
		
		ConcurrentCollections c = new ConcurrentCollections();
		c.start();
		
		for (Map.Entry<Integer, String> set :chm.entrySet()) {

           // Printing all elements of a Map
           System.out.println(set.getKey() + " = "
                              + set.getValue());
       }
		
		
	}
}
