package thrishalaBank;

class Account{

	long accountNumber;
	double balance;
	
	public Account(long accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void transferMoney(int tranferredAccountNumber, double amount){
		System.out.println("transfer rs. " +amount+ " to " +tranferredAccountNumber );
	}
	
	public void depositMoney(double amount){
		System.out.println("deposited rs." +amount );
	}
	
	public void depositMoney(double amount, long accountNo) {
		System.out.println("deposited rs." +amount + " account: " +accountNo);
	}
	
	public void depositMoney(double amount, long accountNo, String currency) {
		System.out.println("deposited " +amount + " account:  " +accountNo + " and currency is " +currency);;
	}
	
	public void withdraw (double amount) throws Exception {
		System.out.println("Withdrawed rs." +amount+ "\t\t"+ "account class" );
	}
	
	public void viewTransactionHistory(int noOfTransaction){
		System.out.println("view last " +noOfTransaction + " transactions");
	}
	
}
