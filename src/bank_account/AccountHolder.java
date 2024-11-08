package bank_account;

public class AccountHolder{

	  private String name = "";
	  private String address = "";
	  private int telephoneNumber = 0;

	  public AccountHolder(String name,String address,int telephoneNumber){
	    this.name = name;
	    this.address = address;
	    this.telephoneNumber = telephoneNumber;
	  }


	  public void displayDetails(){
	    System.out.println("Account holder details");
	    System.out.println("Name: " + name);
	    System.out.println("Address: " + address);
	    System.out.println("Telephone number: " + telephoneNumber);
	  }
}
