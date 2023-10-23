package thrishalaBank;

import java.util.List;

abstract class AccountAbstract implements AccountInterface{
	
	public abstract double depositMoney(double amount);
	
	public abstract double withdraw (double amount);
	
	@Override
	public List<Float> viewTransactionHistory(int noOfTransaction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double transferMoney(long srcAccount, long tranferredAccount, double amount) {
		// TODO Auto-generated method stub
		return 0;
	}


}

