package practiceAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 	19. Write a program to do the following: 
 * 		a. Input: 270176 
 * 		b. Output: Two Seven Zero One Seven Six
*/
public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> numbers = new HashMap<Integer, String>();
		numbers.put(1, "One");
		numbers.put(2, "Two");
		numbers.put(3, "Three");
		numbers.put(4, "Four");
		numbers.put(5, "Five");
		numbers.put(6, "Six");
		numbers.put(7, "Seven");
		numbers.put(8, "Eight");
		numbers.put(9, "Nine");
		numbers.put(0, "Zero");
		
		System.out.println("Enter the digits");
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		
		ArrayList<String> al = new ArrayList<String>();
		
		while(num>0) {
			al.add(numbers.get(num % 10));
			num = num/10;
		}
		
		for(int i = al.size()-1; i>=0; i--)
			System.out.print(al.get(i) + " ");
		
		sc.close();
	}

}
