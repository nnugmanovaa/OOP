package one;

public class CheckingAccount extends Account {

	public static final int FREE_TRANSACTIONS = 2;
	public static final double FEE_FOR_TRANSACTIONS = 0.02;

	protected int counter;

	public CheckingAccount(int account) {
		super(account);
		counter = 0;
	}

	public void deductFee() {
		if (counter > FREE_TRANSACTIONS) {
			balance -= (counter - FREE_TRANSACTIONS) * FEE_FOR_TRANSACTIONS;
			counter = FREE_TRANSACTIONS;
		}
		System.out.println(String.format("Account Number: %d, Balance: %f, Counter: %d", accNumber, balance, counter));
	}

	@Override
	public void deposit(double sum) {
		balance += sum;
		counter++;
	}

	@Override
	public void withdraw(double sum) {
		if (checkforwithDraw(sum)) {
			super.withdraw(sum);
			counter++;
		}
	}

	@Override
	public void transfer(double amount, Account other) {
		if (checkforwithDraw(amount)) {
			super.transfer(amount, other);
			counter++;
		}
	}

}
