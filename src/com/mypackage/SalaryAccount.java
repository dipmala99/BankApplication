package com.mypackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class SalaryAccount extends BankAccount {
    LocalDate lastTransactionDate;
    LocalDate currentTransactionDate;
    int min_balance = 5000;

    public SalaryAccount() {
        // TODO Auto-generated constructor stub
    }

    public SalaryAccount(int accNo, String name, double balance, String lastTransactionDate, String currentTransactionDate) {
        super(accNo, name, balance);
        this.lastTransactionDate = LocalDate.parse(lastTransactionDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.currentTransactionDate = LocalDate.parse(currentTransactionDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

    }

    public LocalDate getLastTransactionDate() {
        return lastTransactionDate;
    }

    public void setLastTransactionDate(LocalDate lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }

    public void setCurrentTransactionDate(LocalDate currentTransactionDate) {
        this.currentTransactionDate = currentTransactionDate;
    }

    public double getMinBal() {
        return min_balance;
    }

    public void setMinBal(int minBalance) {
        this.min_balance = minBalance;
    }

  
    public void withdraw(double amount) {
    	if (TransactionDateDifference()) {
    		if (this.balance - amount >= getMinBal()) {
    			this.balance -= amount;
    			
    			System.out.println("Withdrawal of " + amount + " successful.");
    		} else {
    			System.out.println("Insufficient Balance.");
    		}
    	} else {
    		System.out.println("Account inactive, please activate.");
    	}
    }

    public void deposit(double amount) {
        if (TransactionDateDifference()) {
            if (amount > 0) {
                this.balance += amount;
              
                System.out.println("Deposit of " + amount + " successful.");
            } else {
                System.out.println("Invalid deposit amount. Amount must be greater than 0.");
            }
        } else {
            System.out.println("Account inactive, please activate.");
        }
    }


  
    public void display() {
        super.display();
        System.out.println("Last Transaction Date: " + lastTransactionDate);
        System.out.println("Current Transaction Date: " + currentTransactionDate);
    }

    public boolean TransactionDateDifference() {
    	long monthsDifference = ChronoUnit.MONTHS.between(lastTransactionDate, currentTransactionDate);

    	if (monthsDifference > 2) {
    		return false;
    	} else {
    		return true;
    	}
    }

    public void calculateInterest() {
    	   
        double interestAmount = (balance * interest) / 100;
        balance += interestAmount;
        System.out.println("Calculated Interest:  " + interest + "%: " + interestAmount);
    }
}
