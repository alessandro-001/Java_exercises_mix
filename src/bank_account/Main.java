package bank_account;

class Main {
	  public static void main(String[] args) {
	    System.out.println("Bank Accounts: ");
	    
	    
	    BankAccount account1 = new BankAccount(1);
	    BankAccount account2 = new BankAccount(2);
	    BankAccount account3 = new BankAccount(3);

	    account1.deposit(1000);
	    account1.withdraw(50);

	    account2.deposit(2000);
	    account2.withdraw(900);
	    
	    account3.deposit(250);
	    account3.withdraw(15);

	    
	    account1.displayBalance();
	    account2.displayBalance();
	    account3.displayBalance();
	    
	  }
}
