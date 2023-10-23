package practiceAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *  6. Write a program to find the largest and second largest of 3 numbers 
 */


public class LargestAndSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 0; i <3;i++) {
			numbers.add(sc.nextInt());
		}
		
		System.out.println("The entered numbers are : ");
		for(int i = 0; i <numbers.size();i++) {
			System.out.print(numbers.get(i) +", ");
		}
		
		Collections.sort(numbers);
		System.out.println();
		System.out.println("The largest number is "+numbers.get(2));
		System.out.println("The second largest number is "+numbers.get(1));
		
		sc.close();
		
	}

}
