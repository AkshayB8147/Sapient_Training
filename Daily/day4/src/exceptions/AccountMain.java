package exceptions;

public class AccountMain {
	public static void main(String[] args) throws LowBalanceException  {
		Account acc1=new Account(500.0);
		try {
		acc1.deposit(1000.0);
		System.out.println(acc1.checkBalance());
		System.out.println(acc1.withdraw(1200.0));
		System.out.println(acc1.withdraw(500.0));
		System.out.println(acc1.deposit(1000));
		}
		catch(LowBalanceException le) {
			System.out.println(le.getMessage());
		}
	}

}
