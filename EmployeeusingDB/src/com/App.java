package com;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.Entity.Dept;
import com.Entity.Employee;
import com.storage.Storage;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int deptid = 0;
		String depname = "";
		int empid = 0;
		String empname = "";
		
		System.out.println("Enter no.of departments");
		int nofdepts=sc.nextInt();
		for(int i=0;i<nofdepts;i++) {
			try {
		 System.out.println("Enter dept id:");
		 deptid=sc.nextInt();
		 System.out.println("enter dept name");
		 depname=sc.next();
			}catch(InputMismatchException e) {
				System.out.println(e.getMessage());
			}
		  Storage.departments.add(new Dept(deptid,depname));
		}
		
		System.out.println("Enter no.of employees");
		int nofemp=sc.nextInt();
		for(int i=0;i<nofemp;i++) {
			try {
		 System.out.println("Enter emp id:");
		 empid=sc.nextInt();
		 System.out.println("Enter emp name");
		 empname=sc.next();
		 System.out.println("Enter dept");
		 empname=sc.next();
			}catch(InputMismatchException e) {
				System.out.println(e.getMessage());
			}
		  Storage.employees.add(new Employee(empid,empname));
		}
		sc.close();
        System.out.println(Storage.departments);
        System.out.println(Storage.employees);
        
	}

}
