package exceptions;

public class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double checkBalance() {
		return this.balance;
	}

	public double deposit(double amount) {
		this.balance = this.balance + amount;
		return this.balance;
	}
	
	public double withdraw(double amount) throws LowBalanceException{
		try {
			if(this.balance<0 || this.balance<amount) {
				throw new LowBalanceException("Low Balance "+this.balance);
			} 
			else {
				this.balance=this.balance-amount;	
			}
		} catch(LowBalanceException lb) {
			System.out.println("Balance is not Sufficient");
			throw lb;
		}
		return amount;
	}

}
