package practiceAssignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 		15. Write a program to find whether a given number is a Fibonacci number or not.
 */


public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		
		for(int i = 2; i < 50; i++) {
			list.add(list.get(i-2) + list.get(i-1) );
		}
		//System.out.println(list);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		if (list.contains(number)) {
			System.out.println("The number " +number+ " is a Fibonacci Number." );
		}
		else {
			System.out.println("The number " +number+ " is not a Fibonacci Number." );
		}
		
		sc.close();
	}

}
