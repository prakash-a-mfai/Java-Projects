package Bank;

public class bankapp {
public static void main(String[] args) {
	BankAccount b=new BankAccount("prakash",9874203,10000);

	bankimplementation credit=new bankimplementation();
	
	while(true) {
	try {
		credit.withdraw(b);
	} catch (InsufficientFundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
  }
}
//}
