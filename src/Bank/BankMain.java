package Bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		String s;
		Scanner sc = new Scanner(System.in);
		int option;
		System.out.println("=================================================");
		System.out.println("Online Banking System");
		System.out.println("=================================================");
	
		System.out.println("1 : Create New Account");
		System.out.println("2 : Display Account Details");
		System.out.println("3 : Deposit");
		System.out.println("4 : Withdraw");
		System.out.println("5 : Check Balence");
		System.out.println("6 : Check Your Previous Transaction");
		System.out.println("7 : Exit The System");
		
		do {
			System.out.println("=================================================================");
			System.out.println("Enter Your Choice");
			
			option = sc.nextInt();			
			
			
			switch (option) {
			
			case 1:
				System.out.println("==============================================================");
				b.createAccount();
				System.out.println("\n");
				break;
			case 2:
				System.out.println("===============================================================");
				b.checkAccount();
				System.out.println("\n");
				break;
				
			case 3:
				System.out.println("===============================================================");
				b.deposit();
				System.out.println("\n");
				break;
				
			case  4:
	
				b.withdraw();
				System.out.println("\n");
				break;
			case 5:
				System.out.println("=============================================================");
				b.checkbalence();
				break;
			case  6:
				System.out.println("-------------------------------------------------------");
				b.getPreviousTransaction();
				System.out.println("-------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 7:
				b.exit();
				break;

			
			}	
			 System.out.println("Do you want to continue");
	    	   s=sc.next();

		}
		while(s.equals("yes"));
		

	}

}
