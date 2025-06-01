package Bank;

public class BankAccount  {
  private String Accountholder;
  private int Accountnumber;
  private double balance;
  
  public BankAccount(String name,int no,double bal) {
	  this.Accountholder=name;
	  this.Accountnumber=no;
	  this.balance=bal;
  }

public String getAccountholder() {
	return Accountholder;
}

public void setAccountholder(String accountholder) {
	Accountholder = accountholder;
}

public int getAccountnumber() {
	return Accountnumber;
}

public void setAccountnumber(int accountnumber) {
	Accountnumber = accountnumber;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}
}
