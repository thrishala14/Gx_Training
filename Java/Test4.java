package javaDemo;

import java.util.HashMap;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int price = 0;
			int total = 0;
			HashMap<String, Integer> grocery = new HashMap<>();
			grocery.put("a", 500);
			grocery.put("b", 700);
			grocery.put("c", 800);
			
			while(true) {
			System.out.println("Enter item");
			System.out.println(grocery);
			Scanner s = new Scanner(System.in);
			
			String item = s.nextLine();
			if(item=="0") break;
			
			if(grocery.containsKey(item)) {
				price = grocery.get(item);
				total +=price;
			}
			System.out.println(total);
		}
	}
}
