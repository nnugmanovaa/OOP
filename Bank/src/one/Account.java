package one;

public class Account {
	protected double balance;
	protected int accNumber;

	public Account(int a) {
		balance = 0.0;
		accNumber = a;
	}

	public void deposit(double sum) {
		balance += sum;
	}

	public boolean checkforwithDraw(double sum) {
		if (balance - sum < 0) {
			System.err.println("Insufficient funds");
			return false;
		} else
			return true;
	}

	public void withdraw(double sum) {
		if (checkforwithDraw(sum)) {
			System.out.println(accNumber + "are going to withdraw " + sum);
			balance -= sum;
			System.out.println("Current balance " + balance);
		}
	}

	public double getBalance() {
		return balance;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void transfer(double amount, Account other) {
		if (checkforwithDraw(amount)) {
			balance -= amount;
			other.balance += amount;
			System.out.println(accNumber + " current balance " + balance + "\n" + other.accNumber + " current balance "
					+ other.balance);
		}
	}

	public String toString() {
		return String.format("Account number %d, current balance %d", accNumber, balance);
	}

	public final void print() {
		System.out.println(String.format("Account number %d, current balance %.2f", accNumber, balance));
	}
}
