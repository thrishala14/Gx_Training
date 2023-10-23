package practiceAssignment;

import java.util.Scanner;

/**
 * 1. 	Provided that you have a given number of small rice bags (1 kilo each) and
 * 		big rice bags (5 kilos each), write a method that returns true if it is
 * 		possible to make a package with goal kilos of rice.
 * 
 * 2. Provided that you have a given number of small rice bags (1 kilo each) and
 * big rice bags (5 kilos each), write a method that returns the minimum number
 * of small bags necessary to package goal kilos of rice. Return -1 if it is not
 * possible to package the required rice amount with the bags provided.
 */

public class RiceBags {

	public static void main(String[] args) {
		
		System.out.println("Enter Kilograms of rice");
		Scanner sc = new Scanner(System.in);
		int weight = sc.nextInt();

		
		System.out.println("Enter no of 5 kg bags");
		int big = sc.nextInt();

		System.out.println("Enter no of kg bags");
		int small = sc.nextInt();

		int minSmallBag = bagsOfRice(weight, big, small);
		if (minSmallBag != -1) {
			System.out.println("Minimum small bags required is " + minSmallBag);
		} else {
			System.out.println("Not possible to make package");
		}
		sc.close();
	}

	private static int bagsOfRice(int weight, int big, int small) {

		final int FIVE_KG_RICE = 5;
		final int ONE_KG_RICE = 1;

		if (weight <= big * FIVE_KG_RICE) {
			if (weight % FIVE_KG_RICE <= (small * ONE_KG_RICE)) {
				return weight % FIVE_KG_RICE;
			} else
				return -1;
		} 
		else{
			if ((small * ONE_KG_RICE) >= weight-(big*FIVE_KG_RICE)) {
				return weight - (big*FIVE_KG_RICE);
			} else
				return -1;
		}

	}
}
