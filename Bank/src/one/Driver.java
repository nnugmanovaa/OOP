package one;

public class Driver {

	public static void main(String[] args) {
		Bank b = new Bank();
		/*
		 * b.opening(new CheckingAccount(1)); b.opening(new SavingAccount(2, 0.05));
		 * b.opening(new CheckingAccount(3));
		 */

		b.opening(new SavingAccount(1, 0.2));
		b.opening(new SavingAccount(2, 0.1));
		b.opening(new CheckingAccount(3));
		b.opening(new SavingAccount(4, 0.4));
		b.opening(new CheckingAccount(5));

		b.update();
	}

}
