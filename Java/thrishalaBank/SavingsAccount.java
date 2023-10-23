package thrishalaBank;

public class SavingsAccount extends AccountAbstract {

	@Override
	public double depositMoney(double amount) {
		System.out.println("deposit money method in " +this.getClass());
		return 0;
	}

	@Override
	public double withdraw(double amount) {
		System.out.println("withdraw method in " + this.getClass());
		return 0;
	}

}
