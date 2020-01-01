package one;

public class SavingAccount extends Account {
	private double interestrate;

	public SavingAccount(int account, double interestrate) {
		super(account);
		this.interestrate = interestrate;
	}

	public void addInterest() {
		balance += balance * interestrate;
	}
}
