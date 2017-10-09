package problem.three;

class CheckingAccount extends Account{
	private int interestRate = 5;

	public CheckingAccount(int accNumber) {
		super(accNumber);
	}
	
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		deposit((getBalance() * (interestRate + 100))/100);
	}
	
	public String toString() {
		return String.format("%s My interest rate: %d", super.toString(), interestRate);
	}
}
