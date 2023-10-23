package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapsSession {

	public static void main(String[] args) {
		System.out.println("----WAYS TO CREATE----");
		
		Map<Integer, String> student3 = new HashMap<>();
			/* not allowed before JAVA8 but recommended way now*/
		Map<Integer, String> student4 = new HashMap<Integer, String>();
		HashMap<Integer, String> student5 = new HashMap<Integer, String>();
		HashMap<Integer, String> student6 = new HashMap<>();
		
		
		System.out.println("\n------HASH MAP-----");
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		student.put(1, "Thrishala");
		student.put(2, "Akshatha");
		student.put(3, "Supriya");
		student.put(10, "Komal");
		student.put(4, "Pooja");
		student.put(5, "Tharunya");
	
		for(Integer i: student.keySet()) {
			System.out.println(student.get(i));
		}
		
		
		System.out.println("\n------LINKED HASH MAP-----");
		/* maintains insertion order*/
		LinkedHashMap<Integer, String> student1 = new LinkedHashMap<Integer, String>();
		student1.put(1, "Thrishala");
		student1.put(2, "Akshatha");
		student1.put(3, "Supriya");
		student1.put(10, "Komal");
		student1.put(4, "Pooja");
		student1.put(5, "Tharunya");
		
		for(Integer i: student1.keySet()) {
			System.out.println(student1.get(i));
		}
		
		System.out.println("\n------TREE MAP-----");
		/*in ascending key */
		TreeMap<Integer, String> student2 = new TreeMap<Integer, String>();
		student2.put(1, "Thrishala");
		student2.put(2, "Akshatha");
		student2.put(3, "Supriya");
		student2.put(10, "Komal");
		student2.put(4, "Pooja");
		student2.put(5, "Tharunya");
		
		for(Integer i: student2.keySet()) {
			System.out.println(student2.get(i));
		}
		
		ConcurrentHashMap<Integer, String> student7 = new ConcurrentHashMap<Integer, String>();
		//student7.put(null, "a");  null pointer exception
		
	}

}

//read ConcurrentHashMap  - when to use and benefits 


/**
 *  public class ConcurrentHashMap<K,V>
	extends AbstractMap<K,V>
	implements ConcurrentMap<K,V>, Serializable
	
	
	CONSTRUCTOR:
				ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel);
				
	 *. Thread-safe implementation: multiple threads can access it simultaneously without any synchronization issues.
	 *. Fine-grained locking: it locks only the portion of the map being modified, rather than the entire map.		
	 *. It does not allow to store null key/values.
	 *. Slower than Hashmap.
	 *
		
	In the multi-threaded environment, The ConcurrentHashMap has improved performance than Synchronized HashMap.
	In the single-threaded environment, The HashMap is slightly better than ConcurrentHashMap.
 */

