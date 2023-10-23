package practiceAssignment;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 20. Write a program that takes amount and displays them in words 
 * 		a. Input:	1234 
 * 		b. Output: One thousand two hundred and thirty four only
 */

public class AmountInWords {

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
		numbers.put(10, "Ten");
		numbers.put(11, "Eleven");
		numbers.put(12, "Twelve");
		numbers.put(13, "Thirteen");
		numbers.put(14, "Fourteen");
		numbers.put(15, "Fifteen");
		numbers.put(16, "Sixteen");
		numbers.put(17, "Seventeen");
		numbers.put(18, "Eighteen");
		numbers.put(19, "Nineteen");
		numbers.put(20, "Twenty");

		HashMap<Integer, String> tensNumbers = new HashMap<Integer, String>();
		tensNumbers.put(2, "Twenty");
		tensNumbers.put(3, "Thirty");
		tensNumbers.put(4, "Forty");
		tensNumbers.put(5, "Fifty");
		tensNumbers.put(6, "Sixty");
		tensNumbers.put(7, "Seventy");
		tensNumbers.put(8, "Eighty");
		tensNumbers.put(9, "Ninety");
		tensNumbers.put(100, "Hundred");
		tensNumbers.put(1000, "Thousand");

		System.out.println("Enter the amount (from 1 to 99, 99, 999) "); 
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();

		if (num >= 100000) {
			int d = num / 100000;
			int a = (num / 1000) % 100;
			int b = (num / 100) % 10;
			int c = num % 100;

			if (numbers.containsKey(d)) {
				System.out.print(numbers.get(d) + " lakh ");
			}

			else {
				int x = d / 10;
				int y = d % 10;
				if (y != 00)
					System.out.print(tensNumbers.get(x) + " " + numbers.get(y) + " lakh ");
				else
					System.out.print(tensNumbers.get(x) + " lakh ");

			}

			if (a != 0)
				if (numbers.containsKey(a)) {
					System.out.print(numbers.get(a));
				}

				else {
					int x = a / 10;
					int y = a % 10;
					if (y != 00)
						System.out.print(tensNumbers.get(x) + " " + numbers.get(y) + " thousand ");
					else
						System.out.print(tensNumbers.get(x) + " thousand ");

				}

			if (b != 0) {
				System.out.print(numbers.get(b) + " hundred ");
			}

			if (numbers.containsKey(c)) {
				System.out.print(numbers.get(c));
			}

			else {
				int x = c / 10;
				int y = c % 10;
				if (y != 00)
					System.out.print(" and " + tensNumbers.get(x) + " " + numbers.get(y));

			}

		}

		else if (num < 100000 && num >= 1000) {
			int a = num / 1000;
			int b = (num / 100) % 10;
			int c = num % 100;

			if (numbers.containsKey(a)) {
				System.out.print(numbers.get(a) + " thousand ");
			}

			else {
				int x = a / 10;
				int y = a % 10;
				if (y != 00)
					System.out.print(tensNumbers.get(x) + " " + numbers.get(y) + " thousand ");
				else
					System.out.print(tensNumbers.get(x) + " thousand ");

			}

			if (b != 0) {
				System.out.print(numbers.get(b) + " hundred ");
			}

			if (numbers.containsKey(c)) {
				System.out.print(numbers.get(c));
			}

			else {
				int x = c / 10;
				int y = c % 10;
				if (y != 00)
					System.out.print(" and " + tensNumbers.get(x) + " " + numbers.get(y));

			}

		}
		else if (num < 1000 && num >= 100) {

			int b = (num / 100) % 10;
			int c = num % 100;
			System.out.print(numbers.get(b) + " hundred ");

			if (c != 0) {
				if (numbers.containsKey(c)) {
					System.out.print(numbers.get(c));
				} else {
					int x = c / 10;
					int y = c % 10;
					if (y != 00)
						System.out.print("and " + tensNumbers.get(x) + " " + numbers.get(y));
					else
						System.out.print(tensNumbers.get(x));

				}
			}
		} 
		else if (num < 100) {
			if (numbers.containsKey(num)) {
				System.out.print(numbers.get(num));
			} else {
				int x = num / 10;
				int y = num % 10;
				if (y != 00)
					System.out.print(tensNumbers.get(x) + " " + numbers.get(y));
				else
					System.out.print(tensNumbers.get(x));
			}
		}

		System.out.print(" only");

		sc.close();
	}

}
