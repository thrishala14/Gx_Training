package practiceAssignment;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 	14.	Write a program to find the factorial of a given number.
 *  	0! is always 1. 
 *  	Factorial of a negative number is not possible. 
 */


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		BigInteger factorialResult = factorial(number);
		BigInteger negativeFactorial = new BigInteger("-1");
		
		if(factorialResult.equals(negativeFactorial)) {
			System.out.println("Please enter positive integer");
		}
		else
		{
			System.out.println("The factorial is " +factorialResult);
		}
		sc.close();
	}

	private static BigInteger factorial(int number) {
		// TODO Auto-generated method stub
		
		if(number>=0) {
			if(number==0) {
				return new BigInteger("1");
			}
			else {
				BigInteger factorial = new BigInteger("1");
				for(int i = 1; i<=number; i++) {
					BigInteger bi = BigInteger.valueOf(i);
					factorial = factorial.multiply(bi);
				}
				return factorial;
			}
		}
		else
			return new BigInteger("-1");
	}
}


