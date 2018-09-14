package Business;

public class SavingsAccount extends Account {
	private double monthlyInterestRate;
	private double monthlyInterestPayment;
	
	//user can't establish an account without a balance,
	// so we need a balance in the constructor
	//also, we have a business rule that states monthlyInterestRate
	//is 1%. We will not set monthlyInterestPayment until 
	//end of month, or when we print results in the app
	public SavingsAccount(double balance) {
		setBalance(balance);
		this.monthlyInterestRate = 0.1;
	}

	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestPayment() {
		return monthlyInterestPayment;
	}

	public void setMonthlyInterestPayment(double monthlyInterestPayment) {
		this.monthlyInterestPayment = monthlyInterestPayment;
	}
	
	public void applyInterestPayment() {
		//determine what the monthly interest payment is 
		double mip = balance * monthlyInterestRate;
		
		//set monthlyInterestPayment
		setMonthlyInterestPayment(mip);
		
		//add mip to balance 
		balance += mip;
	}

}
