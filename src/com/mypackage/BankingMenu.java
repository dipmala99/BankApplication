package com.mypackage;
import java.util.Scanner;

public class BankingMenu {
	Scanner sc = new Scanner(System.in);
	BankAccount[] accounts;

	public BankingMenu() {
		System.out.print("Enter the number of accounts you want to create: ");
		int numAccounts = sc.nextInt();
		accounts = new BankAccount[numAccounts];
	}

	public void acceptData() {
		int choice = 0;

		for (int ctr = 0; ctr < accounts.length; ctr++) {
			System.out.println("Welcome to XYZ Bank!");
			System.out.println("Please select an account type to create:");
			System.out.println("1. Savings Account");
			System.out.println("2. Current Account");
			System.out.println("3. Loan Account");
			System.out.println("4. Salary Account");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			int accNo;
			String name;
			double balance;

			switch (choice) {
			case 1:
				// Savings account
				System.out.print("Enter Account Number: ");
				accNo = sc.nextInt();
				System.out.print("Enter Account name: ");
				name = sc.next();
				System.out.print("Enter balance: ");
				balance = sc.nextDouble();
				accounts[ctr] = new SavingsAccount(accNo, name, balance, 1000);
				break;

			case 2:
				// Current account
				System.out.print("Enter Account Number: ");
				accNo = sc.nextInt();
				System.out.print("Enter Account name: ");
				name = sc.next();
				System.out.print("Enter balance: ");
				balance = sc.nextDouble();
				accounts[ctr] = new CurrentAccount(accNo, name, balance, 5000);
				break;

			case 3:
				// Loan account
				System.out.print("Enter Account Number: ");
				accNo = sc.nextInt();
				System.out.print("Enter Account name: ");
				name = sc.next();
				System.out.print("Enter loan amount: ");
				balance = sc.nextDouble();
				double repaid = 0.0;
				accounts[ctr] = new LoanAccount(accNo, name, balance, repaid);
				break;

			case 4:
				// Salary Account
				System.out.print("Enter Account Number: ");
				accNo = sc.nextInt();
				System.out.print("Enter Account name: ");
				name = sc.next();
				System.out.print("Enter balance: ");
				balance = sc.nextDouble();
				sc.nextLine(); 
				System.out.print("Enter the current transaction date in the format of (yyyy-MM-dd): ");
				String cd = sc.nextLine();
//				LocalDate cd = LocalDate.now();
				System.out.print("Enter the last transaction date in the format of (yyyy-MM-dd): ");
				String ltd = sc.nextLine();
				accounts[ctr] = new SalaryAccount(accNo, name, balance, cd.toString(), ltd);
				break;

			default:
				System.out.println("Invalid choice. Please enter a valid option.");
				ctr--;
				break;
			}
		}
	}

	public void process() {
	    int choice = 0;

	    while (choice != 8) {
	        System.out.println("\nMain Menu:");
	        System.out.println("1. Deposit");
	        System.out.println("2. Withdraw");
	        System.out.println("3. Check Balance");
	        System.out.println("4. Display Account Details");
	        System.out.println("5. Calculate Interest");
	        System.out.println("6. End of the Day Report");
	        System.out.println("7. Close Account");
	        System.out.println("8. Exit");
	        System.out.print("Enter your choice: ");
	        choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                deposit();
	                break;
	            case 2:
	                withdraw();
	                break;
	            case 3:
	                checkBalance();
	                break;
	            case 4:
	                display();
	                break;
	            case 5:
	                calculateInterest();
	                break;
	            case 6:
	                endOfDayReport();
	                break;
	            case 7:
	                closeAccount();
	                break;
	            case 8:
	                System.out.println("Thank you for using XYZ Bank. Goodbye!");
	                break;
	            default:
	                System.out.println("Invalid choice. Please enter a valid option.");
	                break;
	        }
	    }
	}
	public void deposit()
	{
		System.out.print("Enter the Account Number: ");
		int id = sc.nextInt();

		for (int ctr = 0; ctr < accounts.length; ctr++) {
			if (accounts[ctr] != null && accounts[ctr].getAccNo() == id) {
				System.out.print("Enter the amount to deposit: ");
				double amt = sc.nextDouble();
				accounts[ctr].deposit(amt);
				return;
			}
		}

		System.out.println("Account not found with Number: " + id);
	}

	public void withdraw() 
	{
		System.out.print("Enter the Account ID: ");
		int id = sc.nextInt();

		for (int ctr = 0; ctr < accounts.length; ctr++) {
			if (accounts[ctr] != null && accounts[ctr].getAccNo() == id) {
				System.out.print("Enter the amount to withdraw: ");
				double amt = sc.nextDouble();
				accounts[ctr].withdraw(amt);
				return;
			}
		}

		System.out.println("Account not found with Number: " + id);
	}

	void checkBalance() 
	{
		System.out.print("Enter the Account Number: ");
		int acN = sc.nextInt();

		for (int ctr = 0; ctr < accounts.length; ctr++) {
			if (accounts[ctr] != null && accounts[ctr].getAccNo() == acN) {
				double balance = accounts[ctr].getBalance();
				System.out.println("Account Balance: " + balance);
				return;
			}
		}

		System.out.println("Account not found with Number: " + acN);
	}

	public void display() 
	{
		System.out.print("Enter the Account Number: ");
		int acN = sc.nextInt();

		for (int ctr = 0; ctr < accounts.length; ctr++) {
			if (accounts[ctr] != null && accounts[ctr].getAccNo() == acN) {
				accounts[ctr].display();
				return;
			}
		}

		System.out.println("Account not found with Number: " + acN);
	}

	public void calculateInterest() 
	{
		System.out.print("Enter the Account Number: ");
		int acN = sc.nextInt();

		for (int ctr = 0; ctr < accounts.length; ctr++) {
			if (accounts[ctr] != null && accounts[ctr].getAccNo() == acN) {
				accounts[ctr].calculateInterest();
				return;
			}
		}
	}

	public void endOfDayReport() 
	{
		System.out.println("\nEnd of the Day Report:");
		for (BankAccount account : accounts) {
			if (account != null) {
				account.display();
				System.out.println();
			}
		}
	}
	
	public void closeAccount() {
        System.out.print("Enter the Account Number to close: ");
        int acN = sc.nextInt();

        for (int ctr = 0; ctr < accounts.length; ctr++) {
            if (accounts[ctr] != null && accounts[ctr].getAccNo() == acN) {
                accounts[ctr] = null; 
                System.out.println("Account with Number " + acN + " has been closed.");
                return;
            }
        }

        System.out.println("Account not found with Number: " + acN);
    }
		
	


}
