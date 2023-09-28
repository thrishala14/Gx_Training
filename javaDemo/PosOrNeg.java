package javaDemo;

import java.util.Scanner;

public class PosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number");
			float a = s.nextFloat();
			if(a >=0) {
				System.out.println("Number is positive");
			}
			else {
				System.out.println("Number is negative");
			}
			System.out.println();
			s.close();
		}
	}

}
