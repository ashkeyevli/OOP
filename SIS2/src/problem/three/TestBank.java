package problem.three;

class TestBank {

	public static void main(String[] args) {
		Bank bank = new Bank();
		SavingsAccount savingsAccount = new SavingsAccount(1);
		CheckingAccount checkingAccount = new CheckingAccount(2);
		Account account = new Account(3);
		
		bank.openAccount(savingsAccount);
		bank.openAccount(checkingAccount);
		bank.openAccount(account);
		
		bank.closeAccount(savingsAccount);
		
		bank.update(500);
		
		System.out.println(bank.toString());
		
		account.transfer(40, checkingAccount);
		
		System.out.println(bank.toString());
	}

}
