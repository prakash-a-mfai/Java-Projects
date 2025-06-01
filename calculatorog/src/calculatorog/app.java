package calculatorog;

import java.util.Scanner;

public class app {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    calculator cal=new Calculatorimplementation();
    int choice =0;
    while(true) {
    	System.out.println("1.Addition/n2.subtraction/n3.multiplication/n4.division/n5.exit");
    	System.out.println("Enter data opertion");
    	try {
    	try {
    		choice=sc.nextInt();
    	}catch(Exception e) {
    		System.out.println("not a num	ber");
    	}
    	if(choice<=5 || choice >5) {
    		switch(choice) {
    		case 1:
    			int add=cal.add();
    			System.out.println(add);
    			break;
    		
    		case 2:
    			int sub=cal.sub();
    			System.out.println(sub);
    			break;
    		
    		case 3:
    			int mul=cal.mul();
    			System.out.println(mul);
    			break;
    			
    		case 4:
    			float div=cal.div();
    			System.out.println(div);
    			break;
    			
    		case 5:
    			System.out.println("Thank u");
    			sc.close();
    			System.exit(0);
    		default:
    			throw new IllegalArgumentException("invalid case use proper operation");
    			
    	}
    }
    	}
    	catch(Exception e){
    		System.out.println(e);
    	}
   }
}
}
