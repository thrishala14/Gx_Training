package practiceAssignment;

import java.util.Scanner;


/**
 * 17. Write a program to accept a binary number and display it in the decimal form
 */



public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number");
		String binary = sc.nextLine();
		
	    int decimal = Integer.parseInt(binary, 2);
	    System.out.println(binary + " in binary = " + decimal + " in decimal.");
		sc.close();
	}
}
