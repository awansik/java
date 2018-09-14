package Business;

public abstract class Account implements Balanceable, Withdrawable, Depositable {

	protected double balance;
	
	@Override
	public double getBalance() {
		return balance;
	}
	
	@Override
	public void setBalance(double amt) {
		balance = amt;
	}
	
	@Override
	public void deposit(double amt) {
		balance += amt;

	}

	@Override
	public void withdraw(double amt) {
		if (amt > balance)
			System.out.println("Amount exceeds balance");
		else 
			balance -= amt;
	}


	}


