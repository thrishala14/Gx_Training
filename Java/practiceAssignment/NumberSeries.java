package practiceAssignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 12. Write as many programs to generate the following series. 
 * In all the following cases, accept N: 
		 * a. 4, 16, 36, 64, … N 
		 * b. 1, 2, 3, 4, 5, 6, … N
		 * c. 1, 4, 27, 256, 3125, … N 
		 * d. 1, 4, 7, 12, 23, 42, 77, … N 
		 * e. 1, 4, 9, 25, 36, 49, 81, 100, … N 
		 * f. 1, 5, 13, 29, 49, 77, … N
 */

public class NumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number N");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print((int) Math.pow(i, 2) + ", ");
			}
		}

		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.print((int) i + ", ");
		}
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.print((int) Math.pow(i, i) + ", ");
		}
		System.out.println();

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(7);
		
		for(int i = 3; i < 10; i++) {
			list.add(list.get(i-3) + list.get(i-2) + list.get(i-1) );
		}
		for(Integer i:list)
			System.out.print(i + ", ");
		
		System.out.println();
		for (int i = 1; i <= n; i++) {
			if (!((i % 4) == 0))
				System.out.print((int) Math.pow(i, 2) + ", ");
		}
		System.out.println();
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		for (int i = 1; i <= n; i++) {
			if(!((i%3)==0)) {
				list1.add(list1.get(list1.size()-1) + 4*i);
			}
		}
		
		for(Integer i:list1)
			System.out.print(i + ", ");

		sc.close();
	}

}
