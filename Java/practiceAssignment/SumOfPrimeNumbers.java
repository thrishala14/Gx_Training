package practiceAssignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 	13. Write a program to find the sum of all the prime numbers in the range n to m. 
 * 		Display each prime number and the final sum.
 */

public class SumOfPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower limit");
		int n = sc.nextInt();
		System.out.println("Enter the upper limit");
		int m = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = n; i<=m; i++) {
			int flag = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				list.add(i);
			}
		}
		
		int sum = 0;
		for(int i: list) {
			sum += i;
		}
		System.out.println("The prime numbers between " +n+ " and " +m+ " is " +list);
		System.out.println("The sum is " +sum);
		
		sc.close();
	}

}
