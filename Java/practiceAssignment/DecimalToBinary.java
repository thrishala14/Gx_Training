package practiceAssignment;

import java.util.Scanner;

/**
 * 16. Write a program to accept a decimal number. Display it in the binary form
 */

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		Float number = sc.nextFloat();
		
		
		Integer wholeNumber = (int) (number * Math.pow(2, 3));
		//System.out.println(wholeNumber);
		
		String result = "";
		
		do {
			int x =  wholeNumber% 2;
			result = x + result ;
			wholeNumber = wholeNumber/2;
			
		} while(wholeNumber !=0);
		
		Float res = (float) Integer.parseInt(result);
		
		System.out.println(res/Math.pow(10, 3));
		
		sc.close();
	}

}
