package thrishalaBank;

import java.util.List;

/**
 * Method over loading: same class, method name should be same, parameter should be different
 * Method over riding: class should be in-a relationship (inheritance), method and parameter name should be same, 
 * 						return type doesn't matter, 
 * 		1. Access modifier: cannot be maximized (super class protected, subclass public)
 * 		2. Exception Handling: cannot down size exception
 */

public class SalaryAccount implements AccountInterface{
	
	public SalaryAccount(long accountNumber, double balance) {
	}

	public void balance() {
		System.out.println("Salary Account method with Rs. 0 balance\n");
	}

	public double transferMoney(long srcAccount, long tranferredAccount, double amount) {
		return amount;
	}

	@Override
	public double depositMoney(double amount) {
		System.out.println(this.getClass().getName() + " deposited money");
		return 0;
	}

	@Override
	public double withdraw(double amount) {
		return 0;
	}

	@Override
	public List<Float> viewTransactionHistory(int noOfTransaction) {
		return null;
	}
	
}