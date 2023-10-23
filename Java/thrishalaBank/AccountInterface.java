package thrishalaBank;

import java.util.List;

interface AccountInterface {
	
	public double depositMoney(double amount);
	
	public double withdraw (double amount);
	
	public List<Float> viewTransactionHistory(int noOfTransaction);
	
	public double transferMoney(long srcAccount, long tranferredAccount, double amount);

}
