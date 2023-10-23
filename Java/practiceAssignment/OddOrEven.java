package practiceAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 3. Write a program to accept a number and display whether it is an even or
 * odd number
 */

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		try {
			int number = scanner.nextInt();
			oddEven(number);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Only Integers!!!!!");
		}

		scanner.close();
	}

	private static void oddEven(int number) {
		// TODO Auto-generated method stub
		if (number % 2 == 0) {
			System.out.println("The number " + number + " is EVEN");
		} else {
			System.out.println("The number " + number + " is ODD");
		}

	}

}
