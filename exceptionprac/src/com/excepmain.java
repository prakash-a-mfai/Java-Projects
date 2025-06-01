package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excepmain {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
//		try {
//int n=sc.nextInt();
//System.out.println(n);
//		}
//		catch(InputMismatchException e) {
//			System.out.println(e.getMessage());
//		}
		try {
			n=sc.nextInt();

		    if(n>2000) {
		    	throw new InvalidPassword("password should less than 2000");
		    }
		}
		    catch(InvalidPassword e) {
		    	System.out.println(n);
		    	System.out.println(e.getMessage());	
		    }
		    catch(InputMismatchException e) {
		    System.out.println(e.getMessage());
		    }
		}
		
		
		
	}

