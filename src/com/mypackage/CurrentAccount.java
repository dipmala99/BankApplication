package com.mypackage;

public class CurrentAccount extends BankAccount {
    int overdraftLimit;

    public CurrentAccount(int accNo, String name, double balance, int overdraftLimit) {
        super(accNo, name, balance);
        this.overdraftLimit = 5000;
        super.interest = 2;
    }

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = 5000;
    }

   
    public void deposit(double amount) {
        super.deposit(amount);

    }


    public void withdraw(double amount) {
        if (getBalance() - amount > getOverdraftLimit()) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient Balance...");
        }
    }


   
    public void display() {
        super.display();
    }

  
    public void calculateInterest() {
   
        double interestAmount = (balance * interest) / 100;
        balance += interestAmount;
        System.out.println("Calculated Interest:  " + interest + "%: " + interestAmount);
    }
}

