package CH7;

public class AccountDemo {
	public static void main(String[] args) {
		Account account = new Account();
		System.out.println(account.getAccountName());
		System.out.println(account.getBalance());

		account = new Account("建设银行", 5000);
		System.out.println(account.getAccountName());
		System.out.println(account.getBalance());
	}

}
