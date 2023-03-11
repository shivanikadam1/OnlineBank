package Bank;

import java.util.Scanner;

public class Bank {
	double balance;
	int previousTransaction;
	String customerName;
	int accno;
	String accType;
	
	

	public Bank()
	{
		
	}
	
	
	
	public Bank(double balance, int previousTransaction, String customerName, int accno, String customerId,
			String accType) {
		super();
		this.balance = balance;
		this.previousTransaction = previousTransaction;
		this.customerName = customerName;
		this.accno = accno;
		
		this.accType = accType;
		
	}
	


	void createAccount()
	{
		Scanner sc=new Scanner(System.in);
	
	  System.out.println("Enter the Name :");
	  customerName=sc.next();
	   System.out.println("Enter the Account Type : ");
	   accType=sc.next();
	   System.out.println("Enter the Account Number :");
	   accno=sc.nextInt();
	   System.out.println("Enter the Initial Balence :");
	   balance=sc.nextDouble();
	  System.out.println("Successfully Create Account....");
	}
	 void checkAccount() {
		
		 System.out.println("-----------------------------------------------------------------------------");
		System.out.printf("|%-10s|%-14s|%-10s|%-8s|%n","ACCOUNTNUMBER","CUSTOMERNAME","ACCOUNTTYPE","BALENCE");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.printf("|%-14s|%-14s|%-10s|%-8s|%n",accno,customerName,accType,balance);
		System.out.println("-------------------------------------------------------------------------------");
	 }
	void deposit() {
		int amount=0;
		Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter Your Account Number: ");
		int acc=scanner.nextInt();
		if(accno==acc)
		{
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter an amount to deposit ");
		System.out.println("-------------------------------------------------------");
		
		 amount = scanner.nextInt();
		
		  if(amount != 0) {
				balance = balance + amount;
				previousTransaction = amount;
		
		System.out.println("Successfully Deposit Your Amount...");
		}
		}
		else
		{
			System.out.println("Sorry!!..Your Account Is Not Found");
		}
		System.out.println(" ");
		
		
		}
	
	
	void withdraw() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Account Number: ");
		int acc1=scanner.nextInt();
		if(accno==acc1)
		{
			
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter an amount to withdraw ");
		System.out.println("-------------------------------------------------------");
		
		int amount2 = scanner.nextInt();
		
		 if(balance>amount2 && amount2 != 0 )
		{
			
		 balance = balance - amount2;
		previousTransaction = -amount2;
					
		
		System.out.println("Your Amount Successfully Withdraw");
		System.out.println("\n");
		}
		 else {
		 System.out.println("Your Balence is low...");
		 }
		 
		}
		else
		{
		System.out.println("Sorry!!..Your Account Is Not Found");
		}
		
		
	}
	void checkbalence()
	{
		System.out.println("-------------------------------------------------------");
		System.out.println(" Current Balance Is = "+balance);
		System.out.println("-------------------------------------------------------");
		System.out.println("");
	}
	
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		}
		else if(previousTransaction < 0) {
			System.out.println("Withdraw: " +Math.abs(previousTransaction));
		}
		
		else {
			System.out.println("No Transaction Occured");
		}
		
	}
	void exit() {
		System.out.println("Thank You for Using our Service.....!!");
		System.exit(0);
	}
	


}
