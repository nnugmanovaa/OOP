package Task2;

public class Account {
	protected double balance; // The current balance
	protected int accNumber; // The account number

	public Account(int a) {
		balance = 0.0;
		accNumber = a;
	}

	public void deposit(double sum) {
		balance += sum;

	}

	public void withdraw(double sum) { // переделать с return value - VOID
		if (balance >= sum)
			balance -= sum;
		else
			System.out.println("Insufficient funds");
	}

	public boolean canTransfer(double sum) {
		if (balance - sum < 0)
			return false;
		else {
			balance -= sum;
			return true;
		}
	}

	public double getBalance() {
		return balance;
	}

	public double getAccountNumber() {
		return accNumber;
	}

	public void transfer(double amount, Account other) { // переделать с return value - VOID
		if (!(canTransfer(amount)))
			System.out.println("Transaction is not available");
		else {
			other.receive(amount);
		}

	}

	public void receive(double amount) {
		balance += amount;
	}

	public String toString() {
		return this.accNumber + " ";
	}

	public final void print() {
		// Don't override this,override the
		// toString method
		System.out.println(toString());
	}
}
