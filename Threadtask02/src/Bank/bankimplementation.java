package Bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bankimplementation extends Thread {

public synchronized	void withdraw(BankAccount b) throws InsufficientFundsException {
	    System.out.println("Enter Amount to withdraw or 'exit' to  exit");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		if(input.equalsIgnoreCase("exit")) {
	       System.exit(0);
		}
		int amount=0;
		try{
			amount=Integer.parseInt(input);
		}
		catch(InputMismatchException e) {
			e.getMessage();
		}
	   System.out.println("Attempting to withdraw Rs."+amount);
	   try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   System.out.println("Processing ...");
	   try {
		   Thread.sleep(1000);
	   if(b.getBalance()>amount) {
		   b.setBalance(b.getBalance()-amount);
		   System.out.println("The amount withdrawn Rs."+amount+ "Remaining balance Rs."+ b.getBalance());
	   }
	   else{
		   throw new InsufficientFundsException("Insufficient balance");
	   }
	   }catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
	   catch(Exception e) {
		   System.out.println(e.getMessage());
	   }
    }
}

