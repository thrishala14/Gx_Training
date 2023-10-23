package practiceAssignment;

import java.util.Scanner;

/**
 * 7. Write a program to accept name, empId, basic, special allowances, percentage of bonus 
 * 		and monthly tax saving investments. The gross monthly salary is basic + special allowances. 
 * 		Compute the annual salary. The gross annual salary also includes the bonus. 
 * 		Compute the annual net salary, by deducting taxes as suggested. 
 * 			a. Income up to 2.5 lakhs – exempted 
 * 			b. Income from 2.5 lakhs to 5 lakhs – 5% 
 * 			c. Income from 5 lakhs to 10 lakhs – 20% 
 * 			d. Income from 10 lakhs onwards – 30%.
 * 		However, if there is any tax saving investment, then there is further exemption of up to 1.5 lakhs annually. 
 * 		This would mean that by having tax saving investments of about 1.5 lakhs, an income of 4 lakhs is non-taxable. 
 * 		Display the annual gross, annual net and tax payable. 
 */


public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Employee ID: ");
		int empId = sc.nextInt();
		
		System.out.println("Basic: ");
		Float basic = sc.nextFloat();
		
		System.out.println("Special Allowance: ");
		Float allowance = sc.nextFloat();
		
		System.out.println("Percentage of Bonus: ");
		Float bonusPercentage = sc.nextFloat();
		
		System.out.println("Monthly Tax: ");
		Float monthlyTax = sc.nextFloat();
		
		
		System.out.println("\n-------------SALARY REPORT-----------\n");
		System.out.println("NAME: " +name+ ", EMPLOYEE ID: " +empId);
		System.out.println("The gross monthly salary is "+ (basic + allowance));
		float grossAnnualSalary = (basic + allowance)*12 + (basic + allowance)*12*bonusPercentage/100;
		System.out.println("The gross annual salary is " +grossAnnualSalary);
		
		float tax;
		
		if(monthlyTax*12>150000) {
			grossAnnualSalary = grossAnnualSalary - 400000;
		}
		
		if(grossAnnualSalary<250000) {
			tax = 0;
		}
		else if(grossAnnualSalary>=250000 && grossAnnualSalary<500000) {
			tax = (float) (0.05 * grossAnnualSalary);
		}
		else if(grossAnnualSalary>=500000 && grossAnnualSalary<1000000) {
			tax = (float) (0.2 * grossAnnualSalary);
		}
		else {
			tax = (float) (0.3 * grossAnnualSalary);
		}
		
		float netSalary; 
		if(monthlyTax*12>150000) {
			netSalary = grossAnnualSalary - tax + 400000;
		}
		else
			netSalary = grossAnnualSalary - tax;
		
		
		System.out.println("The tax payable is  " +tax+ " and the net annual salary is " +netSalary);
		
		sc.close();
	}

}
