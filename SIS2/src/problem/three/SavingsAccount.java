package problem.three;

public class SavingsAccount extends Account{
	private int counter;
	private final double TRANSACTION_FEE = 2;
	
	public SavingsAccount(int accNumber) {
		super(accNumber);
	}
	
	public void deductFee() {
		counter++;
		if(counter >= TRANSACTION_FEE)
			withdraw(0.02);
	}
	
//	public void transfer(double amount, Account other) {
//		super.transfer(amount, other);
//		deductFee();
//	} 

	public String toString() {
		String form = counter == 1 ? "transaction" : "transactions";
		return String.format("%s I have made %d %s.", super.toString(), counter, form);
	}
}
