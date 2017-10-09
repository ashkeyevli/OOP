package problem.three;

class Account {
	private double balance;
	private int accNumber;
	
	public Account(int accNumber) {
		balance = 0;
		this.accNumber = accNumber;
	}
	
	public void deposit(double sum) {
		balance += sum;
	}
	
	public void withdraw(double sum) {
		balance -= sum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return accNumber;
	}
	
	public void transfer(double amount, Account other) {
		balance -= amount;
		other.deposit(amount);
	}
	
	public String toString() {
		return String.format("My current balance: %f. My acc number: %d.", balance, accNumber);
	}
	
	public final void print() {
		System.out.println(toString());
	}
	
	public boolean equals(Object o) {
		  if ((o == null) || !(o instanceof Account)) return false;
		  
		  return ((Account) o).getAccountNumber() == accNumber;
	}
}
 