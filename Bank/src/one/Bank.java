package one;

import java.util.Vector;

public class Bank {
	protected Vector<Account> accounts;

	{
		accounts = new Vector<Account>();
	}

	public void opening(Account acc) {
		accounts.add(acc);
	}

	public void closing(Account acc) {
		accounts.remove(acc);
	}

	public void update() {
		for (Account acc : accounts) {
			acc.deposit(100);
			acc.deposit(100);
			acc.deposit(100);

			if (acc instanceof SavingAccount) {
				SavingAccount sa = (SavingAccount) acc;
				sa.addInterest();
			}

			else if (acc instanceof CheckingAccount) {
				CheckingAccount ca = (CheckingAccount) acc;
				ca.deductFee();
			}
			acc.print();
		}
	}
}
