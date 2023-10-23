package practiceAssignment;

import java.util.Scanner;

/**
 * 		1. 	Write a program to accept principal amount, rate of interest and time. 
 * 			Calculate simple interest and display the same.
 */

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the principal amount: ");
		int principalAmount = scanner.nextInt();
		System.out.print("Enter the rate of interest (in percentage) : ");
		float rateOfInterest = scanner.nextFloat();
		System.out.print("Enter the time (in years): ");
		int timeDuration = scanner.nextInt();
		
		int simpleInterest = 
				simpleInterestCalculator(principalAmount, rateOfInterest, timeDuration);
		
		System.out.println("The simple interest is " +simpleInterest);
		System.out.println("The total amount is  " +(simpleInterest+principalAmount));
		
		scanner.close();
		
	}

	private static int simpleInterestCalculator(int principalAmount, float rateOfInterest, int timeDuration) {
		// TODO Auto-generated method stub
		int simpleInterest = (int) ((principalAmount * rateOfInterest * timeDuration)/100);
		return simpleInterest;
	}

}
