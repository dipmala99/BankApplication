package com.mypackage;

public class SavingsAccount extends BankAccount {
	double  minBalance = 10000;

	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}
	public SavingsAccount(int accNo, String name, double balance,double minBalance)
	{
		super(accNo,name,balance);
		this.minBalance = minBalance;
		super.interest=2;

	}
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = 10000;
	}

	public void withdraw(double withdrawAmt)
	{


		if((this.getBalance()-withdrawAmt)>=getMinBalance()) 
		{
			this.setBalance(balance-withdrawAmt);
			System.out.println("After withdraw"+balance);
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	public void deposite(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			System.out.println("Deposit of " + amount + " successful.");
		} else {
			System.out.println("Invalid deposit amount. Amount must be greater than 0.");
		}
	}


	public void calculateInterest() {
	    double calculatedInterest = (this.balance * this.interest) / 100;
	    this.balance += calculatedInterest;
	    System.out.println("Calculated Interest: " + calculatedInterest);
	}
	public void display()
	{
		super.display();
	}

}
