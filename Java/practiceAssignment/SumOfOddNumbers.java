package practiceAssignment;

import java.util.Scanner;

/**
 * 9. Write a program to find the sum of all odd numbers from 1 to N. Accept N.
 * Display the sum.
 */

public class SumOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for N");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if(i%2==1) {
				sum += i;
			}
		}
		System.out.println("The sum of all odd number between 1 and "+n+ " is "+sum);
		sc.close();
	}

}
