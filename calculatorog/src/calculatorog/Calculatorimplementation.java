package calculatorog;

import java.util.Scanner;

public class Calculatorimplementation implements calculator {

	Scanner sc=new Scanner(System.in);
	@Override
	public int add() {
		System.out.println("Enter the total calculations need to done");
		int count=sc.nextInt();
		int sum=sc.nextInt();
		int tempsol=0;
		for(int i=2;i<=count;i++) {
			try {
				String str=sc.next();
				if(str.equals("exit")) {
					System.out.println("Program end");
					break;
				}
				tempsol=Integer.parseInt(str);
				sum=sum+tempsol;
			}
			catch(Exception e) {
				System.out.println("not a number");
				sc.next();
				i--;
			}
		}
		return sum;
	}

	@Override
	public int mul() {
		System.out.println("Enter the total calculations need to done");
        int count=sc.nextInt();
        int mul=sc.nextInt();
        int tempsol=0;
        for(int i=2;i<=count;i++) {
        	try {
        		String input=sc.next();
        		if(input.equalsIgnoreCase("exit")) {
        			System.out.println("program is terminates");
        			break;
        		}
        	
        		tempsol=Integer.parseInt(input);
        		mul=mul*tempsol;
        	}
        	catch(Exception e) {
    			System.out.println("not a number");
    			i--;
    		}
        }
        return mul;
	}

	@Override
	public int sub() {
		System.out.println("Enter the total calculations need to done");
		int count=sc.nextInt();
		int sub=sc.nextInt();
		int tempsol=0;
		for(int i=2;i<=count;i++) {
			try {
				String input=sc.next();
				if(input.equals("exit")) {
					System.out.println("program end");
				}
				tempsol=Integer.parseInt(input);
				sub=sub-tempsol;
			}
			catch(Exception e) {
				System.out.println("not a number");
				i--;
			}
		}
		return sub;
	}

	@Override
	public float div() {
		System.out.println("Enter the total calculations need to done");
		int count=sc.nextInt();
		float div=sc.nextInt();
		int tempsol=0;
		for(int i=2;i<=count;i++) {
			try {
				String input=sc.next();
				if(input.equals("exit")) {
					System.out.println("program end");
				}
				else if(Integer.parseInt(input)==0) {
                    throw new ArithmeticException("cannot be divided by zero");
				}
				tempsol=Integer.parseInt(input);
				div=div/tempsol;
			}
			catch(Exception e) {
				System.out.println("not a number");
				i--;
			}
		}
		return div;
	}

}
