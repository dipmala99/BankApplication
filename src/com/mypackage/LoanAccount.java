package com.mypackage;

public class LoanAccount extends BankAccount {
    double repaid;

    public LoanAccount(int accNo, String name, double balance, double repaid) {
        super(accNo, name, -balance); 
        this.repaid = repaid;
        super.interest = 2; 
    }

    public double getRepaid() {
        return repaid;
    }

    public void setRepaid(double repaid) {
        this.repaid = repaid;
    }

    public void calculateInterest() {
        double interestAmount = getBalance() * interest; // 
        deposit(interestAmount); 
    }

    public void deposit(double repaid) {
        System.out.println("Enter the amount to repay the loan: ");
        if (balance + repaid > 0) {
            System.out.println("The loan is cleared. available balance now in the account is " + (balance + repaid));
        } else {
            balance += repaid;
            System.out.println("Repayment successful. Your new account balance is: " + balance);
        }
    }
    public void display() {
        super.display();
        System.out.println("Repaid loan amount " +repaid);
        System.out.println("Balance need to repaid " +balance);
        
    }

}