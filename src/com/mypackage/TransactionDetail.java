package com.mypackage;
class TransactionDetail {
    int accountNumber;
     String description;
     double amount;

    public TransactionDetail(int accountNumber, String description, double amount) {
        this.accountNumber = accountNumber;
        this.description = description;
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

  
    public String toString() {
        return "Account Number: " + accountNumber +
               ", Description: " + description +
               ", Amount: $" + amount;
    }
}