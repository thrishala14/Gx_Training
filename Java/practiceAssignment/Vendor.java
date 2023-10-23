package practiceAssignment;

import java.util.Scanner;

/**
 * 8. 	A vendor offers software services to a client. Each resource is billed at some dollar rate per hour. 
 * 		The total cost of the project for the client is therefore, the total number of hours contributed by 
 * 		all the vendor resources * the dollar rate / hour. There are however some variants. 
 * 	a. The vendor might have purchased hardware/infrastructure or software licenses needed for the project. 
 * 	b. The vendor might have utilized external consultants for the project. 
 * 	c. The client looks at the vendor as a one stop solution and hence external resources employed by the
 * 		 vendor need to be paid by the vendor. 
 * 	d. It might however be possible that the vendor’s hardware and software purchases are borne by the client. 
 * 		In this case, the client pays the vendor 30% of the hardware/infrastructure costs. In case of software
 * 		licenses, the client pays the vendor 50% of the cost, if they are commonly available and used, 
 * 		or 100% if the software is infrequently used or is proprietary client technology. 
 * 	e. The external consultants employed by the vendor will come at a dollar rate per hour. 
 * 	f. Accept the suitable inputs and display the profits / loss realized by the vendor. 
 */


public class Vendor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dollarPerHour = 20;
		System.out.println("Dollar / Hour : $" + dollarPerHour);
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Hours: ");
		int noOfHours = sc.nextInt();

		int totalBill = 0;

		int totalBillX = dollarPerHour * noOfHours;

		System.out.print("Any hardware/infrastructure costs??? (1/0): ");

		if (sc.nextInt() == 1) {
			System.out.print("Enter cost: ");
			int hardwareCost = sc.nextInt();
			System.out.print("Is it commonly available??? (1/0)");
			int a = sc.nextInt();
			if (a == 1) {
				totalBill += hardwareCost * 0.5;
			}
			if (a == 0) {
				totalBill += hardwareCost;
			}
		}

		System.out.print("Any licenses requires??? (1/0): ");
		if (sc.nextInt() == 1) {
			System.out.print("Enter cost");
			int licenseCost = sc.nextInt();
			System.out.print("Is client bearing the cost??? (1/0) : ");
			if (sc.nextInt() == 1) {
				totalBill += licenseCost * 0.3;
			} else {
				totalBill += licenseCost;
			}

		}

		System.out.print("Any external vendors??? (1/0): ");
		if (sc.nextInt() == 1) {
			System.out.print("Enter dollars rate per hour for external vendor: ");
			int extCost = sc.nextInt();
			System.out.print("Enter no of hours: ");
			int extHours = sc.nextInt();
			int totalExternalCost = extCost * extHours;
			totalBill += totalExternalCost;

		}

		sc.close();
		int profitLoss = totalBillX - totalBill;
		System.out.println("The total payable bill is $" + totalBillX);
		System.out.println("External expenditures: $" + totalBill);

		if (profitLoss >= 0) {
			System.out.println("The profit is $" + profitLoss);
		} else {
			System.out.println("The loss is $" + profitLoss);
		}
		
	}
		
}

