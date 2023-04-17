
package com.BikkadIT.BankApplication.service;
import java.util.Scanner;
import com.BikkadIT.BankApplication.model.Account;

public class BankserviceImp implements Bankservice{
	
	Account acc=new Account();
	Scanner sc=new Scanner(System.in);
	int withdr;
	
	public void createAccount()
	{
		
		System.out.println("Enter your Details to create Account");
		
		System.out.println("Enter Account Number");
		 int acc_no = sc.nextInt();
		acc.setAcc_no(acc_no);
		
		System.out.println("Enter Name");
		String acc_name=sc.next();
		acc.setAcc_name(acc_name);
		
		System.out.println("Enter Address");
		String address=sc.next();
		acc.setAddress(address);
		
		System.out.println("Enter PAN number");
		int pan_no=sc.nextInt();
		acc.setPan_no(pan_no);
		
		System.out.println("Enter Amount to Deposit");
		int amount=sc.nextInt();
		acc.setAmount(amount);
		
		System.out.println("Account Created Sucessfully");
		
		
		}

	@Override
	public void viewAccount() {
		
		System.out.println("Account Details Showed by Using Tostring Method");
		System.out.println(acc);
		
		System.out.println("Account Details By Using Getter");
		System.out.println(acc.acc_no);
		System.out.println(acc.acc_name);
		System.out.println(acc.address);
		System.out.println(acc.pan_no);
		System.out.println(acc.amount);
		
		
	}

	@Override
	public void withdraw() {
		
		System.out.println("Enter Account Number:");
		int useracc=sc.nextInt();
		
		if(useracc==acc.acc_no)
		{
			System.out.println("Enter the Amount to withdraw");
			int amt=sc.nextInt();
			
					if(amt<=acc.getAmount())
					{
						double remainbal=acc.getAmount()-amt;
						acc.setAmount(remainbal);
						System.out.println("Available Balance is:"+remainbal);
					}
					else
					{
						System.out.println("Insufficient Fund");
					}
		}
			
		else
		{
			System.out.println("Invalid Accouunt Number");
		}
	}
	@Override
	public void deposit() {
		
		System.out.println("Enter the Account Number:");
		int useracc=sc.nextInt();
		if(acc.getAcc_no()==useracc)
		{
			System.out.println("Enter the amount to Deposit");
			double dep_amt=sc.nextInt();
			double de_amount=acc.getAmount()+dep_amt;
			System.out.println("Amount Deposited Sucessfully");
			System.out.println("Current Balancs is:"+de_amount);
		}
		else
		{
			System.out.println("Invalid Account Number");
		}
		
}

	@Override
	public void updateAccount() {
		
			boolean flag=true;
			
			while(flag) 
			{
				System.out.println("Press 1 to Update Name");
				System.out.println("Press 2 to Update Address'");
				System.out.println("press 3 to Update Pan_no");
				System.out.println("press 4 For main menu");
				
				System.out.println("Enter your Choice");
				int ch=sc.nextInt();
				
				switch(ch)
				{
				case 1:
						System.out.println("Enter new Name to Update");
						String new_name=sc.next();
						
						acc.setAcc_name(new_name);
						
						System.out.println("Name Updated Successfully");
						System.out.println("Your new Upadated name is:"+acc.getAcc_name());
						
					
					break;
					
				case 2:
						System.out.println("Enter new address to update");
						String new_add=sc.next();
						
						acc.setAddress(new_add);
						
						System.out.println("Address Updated Successfully");
						System.out.println("Your Updated Addtess is:"+acc.getAddress());
					
					break;
				
				case 3:
						System.out.println("ENter new Pan number to update");
						int new_pan=sc.nextInt();
						
						acc.setPan_no(new_pan);
						
						System.out.println("PAN number updated Successfully");
						System.out.println("Your updated PAN number is:"+acc.getPan_no());
					
					
					break;
					
				case 4:
					flag=false;
					break;
				case 5:
					default:
						System.out.println("Invalid Account Number");
					
					
				
				}
				
			
			
			
			
			}
			
		
	}

	

	

}
