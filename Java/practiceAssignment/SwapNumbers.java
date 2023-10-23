package practiceAssignment;

import java.util.Scanner;

/**
 * 		2. 	Write a program to accept two numbers. 
 * 			Display the two numbers. 
 * 			Swap the two numbers and display them again.
 */


public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int firstNumber = scanner.nextInt();
		System.out.print("Enter the second number : ");
		int secondNumber = scanner.nextInt();
		
		System.out.println();	
		System.out.println("BEFORE SWAPPING");		
		System.out.println("The first number is " + firstNumber + " and the second number is " + secondNumber );
		
		
		Integer[] swappedNumbers = swap(firstNumber, secondNumber);
		
		System.out.println();	
		System.out.println("AFTER SWAPPING");	
		System.out.println("The first number is " + swappedNumbers[0] + " and the second number is " + swappedNumbers[1]);
		
		scanner.close();
		
	}

	private static Integer[] swap(int firstNumber, int secondNumber) {
		// TODO Auto-generated method stub
		return new Integer[] {secondNumber, firstNumber};
	}

}
