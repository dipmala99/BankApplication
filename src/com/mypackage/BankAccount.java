package com.mypackage;

public abstract class BankAccount {
	int accNo;
	String name;
	double balance;
	double interest;
	TransactionDetail[] transactionHistory;
	int transactionCount;

	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.transactionHistory = new TransactionDetail[100];
		this.transactionCount = 0;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public void display() {
		System.out.println("Account Details:");
		System.out.println("Account Number: " + this.accNo);
		System.out.println("Account Holder Name: " + this.name);
		System.out.printf("Balance: ", this.balance);
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			addTransactionDetail("Deposit", amount);
			System.out.println("Deposit of " + amount + " successful.");
		} else {
			System.out.println("Invalid deposit amount. Amount must be greater than 0.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance -= amount;
			addTransactionDetail("Withdrawal", amount);
			System.out.println("Withdrawal of " + amount + " successful.");
		} else {
			System.out.println("Invalid withdrawal amount or insufficient balance.");
		}
	}

	public abstract void calculateInterest() ;



	void addTransactionDetail(String description, double amount) {
		if (transactionCount < transactionHistory.length) {
			transactionHistory[transactionCount] = new TransactionDetail(accNo, description, amount);
			transactionCount++;
		} else {
			System.out.println("Transaction history is full.");
		}
	}

	public TransactionDetail[] getTransactionHistory() {
		return transactionHistory;
	}
}
