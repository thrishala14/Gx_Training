package thrishalaBank;

public class CurrentAccount extends Account{

	public CurrentAccount(long accountNumber, double balance) {
		super(accountNumber, balance);
		
	}
	
	public void withdraw(double amount) throws Exception{
		super.withdraw(amount);
		System.out.println("Withdrawed rs." +amount+"\t\t" + "current account class" );
	}
	
}
