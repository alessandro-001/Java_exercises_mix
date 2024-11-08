package bank_account;

public class BankAccount {

	  private int balance = 0;
	  private int accountNumber = 0;
	  

	  public BankAccount(int accountNumber) {
		  this.accountNumber = accountNumber;
		  
	  }
	  
	  
	  public void deposit(int amount) {
		  balance += amount;
	  }
	  

	  public void withdraw(int amount) {
		  balance -= amount;
	  }

	  
	  public void displayBalance() {
		  System.out.println("The balance in the account " + accountNumber + " is " + balance);
	  }
	  
	  
	  public void displayDetails() {
		    
	  }
	  
}
