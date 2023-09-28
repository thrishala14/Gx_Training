package javaDemo;

import java.util.Scanner;

public class GetInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = s.nextInt();
		System.out.println();
		System.out.print("Enter second number: ");
		int num2 = s.nextInt();
		System.out.println();
		int result = num1 + num2;
		System.out.print("The sum is : "+ result);
		
		
		String a = s.nextLine();
		System.out.println(a);
		
		int b = s.nextInt();
		System.out.println(b);
		
		float c = s.nextFloat();
		System.out.println(c);

		int d = s.nextInt();
		System.out.println(d);
		
		s.close();
	}
}
