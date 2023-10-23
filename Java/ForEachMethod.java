package forEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 *  java 8 has forEach method in java.lang.Interable 
 *  interface. it takes java.util.funvtion.Consumer
 */

public class ForEachMethod {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =1; i<=10; i++) {
			list.add(i);
		}
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		}
		
		list.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("for each anonymous class value : " +t);
			}
		});
		
		MyConsumer action = new MyConsumer();
		list.forEach(action);
			
	}

}

class MyConsumer implements Consumer<Integer> {
	public void accept(Integer i) {
		System.out.println(i);
	}
}
