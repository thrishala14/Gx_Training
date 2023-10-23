package practiceAssignment;

import java.util.Scanner;

/**
 * 10. Write a program to find the reverse of a number. Store the reverse value
 * in a different variable. Display the reverse.
 */

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		Integer num = sc.nextInt();
		String number = num.toString();
		String reverseNum = "";
		
		for (int i = 0; i < number.length(); i++) {
			reverseNum = number.charAt(i) + reverseNum;
		}

		System.out.println("The reverse of " + number + " is " + reverseNum);
		sc.close();

	}

}
