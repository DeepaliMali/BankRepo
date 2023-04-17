package com.BikkadIT.BankApplication.controller;
import java.util.Scanner;
import com.BikkadIT.BankApplication.service.BankserviceImp;


public class Bankcontroller {
	
	public static void main(String[] args) {
		
		
		BankserviceImp bs = new BankserviceImp();
		
		boolean flag=true;
		while(true)
		{

		System.out.println("----------Welcome to SBI Bank Application---------");
		System.out.println("Enter 1 for Create Account ");
		System.out.println("Enter 2 for View Account ");
		System.out.println("Enter 3 for Withdraw money  ");
		System.out.println("Enter 4 for Deposit  money ");
		System.out.println("Enter 5 for Update Account ");
		System.out.println("Enter 6 for EXIT  ");
		
		System.out.println("Enter your Choice");
		
		Scanner sc=new Scanner(System.in);
		int ch = sc.nextInt();

		
		switch (ch) {

		case 1:
			bs.createAccount();
			break;
			
		case 2:
			
			bs.viewAccount();
			break;
			
		case 3:
			
			bs.withdraw();
			break;
			
		case 4:
			
			bs.deposit();
			break;
			
		case 5:
			bs.updateAccount();
			break;
			
		case 6: 
			 flag=false;
			break;
			
			default:
				System.out.println("Invalid Choice");

		}
		
	}
	
				
	}
}