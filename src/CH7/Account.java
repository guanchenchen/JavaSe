package CH7;

public class Account {
	private String accountName;
	private double balance;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String accountName, double balance) {
		super();
		this.accountName = accountName;
		this.balance = balance;
	}

	public String getAccountName() {
		return accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double money) {
		balance += money;
	}

	public double withdraw(double money) {
		balance -= money;
		return money;
	}
}
