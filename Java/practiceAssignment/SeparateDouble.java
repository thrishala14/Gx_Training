package practiceAssignment;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 		4. 	Write a program to accept a double value. 
 * 			Separate the whole value from the fractional value and store them in two variables. 
 *			Display the same.
 */

public class SeparateDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the double number: ");
		try {
			double number = scanner.nextDouble();
			separateDouble(number);
		} catch (InputMismatchException e) {
			System.out.println("Please Enter Only Integers!!!!!");
		}

		scanner.close();
	}

	private static void separateDouble(double number) {
		// TODO Auto-generated method stub
		int wholeNumber = (int)number;
		float decimalNumber = (float) (number - wholeNumber);
		System.out.println("The whole value is " +wholeNumber+ " and the fractional value is " +decimalNumber);
		
	}

}
