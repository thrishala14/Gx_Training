package thrishalaBank;

//rajkumar@galaxe.com

class Client {
	
	public static void main(String[] args) throws Exception {
		
		Account account = new Account(1001, 20000);
		
		account.depositMoney(5000);
		account.depositMoney(6000, 2110010);
		account.depositMoney(7000, 2110011, "Dollar");
		
		account.withdraw(2000);
		account.transferMoney(2001, 10000);
		account.viewTransactionHistory(2);
		
		System.out.println();
		
		SalaryAccount salaryAccount = new SalaryAccount(5001, 10000);
		salaryAccount.balance();
		
		salaryAccount.depositMoney(10000);
		//salaryAccount.withdraw(3000);
		salaryAccount.viewTransactionHistory(3);
		
		
		System.out.println("\nCurrent account\n");
		CurrentAccount currentAccount = new CurrentAccount(6001, 20000);
		currentAccount.withdraw(10000);
		currentAccount.depositMoney(10000);

		currentAccount.depositMoney(8000, 2110012);
		currentAccount.depositMoney(9000, 2110013, "Yen");
		currentAccount.transferMoney(2002, 10500);
		
		AccountInterface salary = new SalaryAccount(0, 0);
		salary.depositMoney(2000);
		
		System.out.println("\nsavings account\n");
		
		AccountAbstract savingAccount = new SavingsAccount();
		savingAccount.depositMoney(2000);
		savingAccount.withdraw(5000);
		
		
	}
	
}
