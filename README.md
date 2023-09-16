# BankApplication

The Bank Application is a Java-based program designed to simplify banking operations, offering various account types and user-friendly transaction management.

## Table of Contents

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Features](#features)
- [Usage](#usage)
-  [Class Diagram](#class-diagram)

## Overview

The Bank Application is a Java-based program designed to facilitate basic banking operations. It offers a straightforward and user-friendly interface for account management and transactions. With different types of accounts available, users can easily create and manage their accounts, make deposits and withdrawals, apply for loans, and view their transaction history. The Bank Application serves as a practical tool for individuals to manage their finances conveniently.

## Project Structure

This repository contains the following Java classes:

- `BankAccount.java`: This class defines the fundamental attributes and methods common to all bank accounts, providing a blueprint for other account types.

- `BankingMenu.java`: This class serves as the user interface for interacting with the bank application. It presents a menu system that allows users to access various features and functionalities.

- `CurrentAccount.java`: Represents a current (checking) account. This class inherits from `BankAccount.java` and includes account-specific functionalities.

- `LoanAccount.java`: Represents a loan account, handling loan-related operations such as application and approval. It also inherits from `BankAccount.java`.

- `MainApp.java`: This class contains the main entry point for the application. It initializes the application and launches the user interface.

- `SalaryAccount.java`: Represents a salary account, designed to manage regular salary deposits and withdrawals.

- `SavingsAccount.java`: Represents a savings account, providing features for savings and interest calculation.

- `TransactionDetail.java`: This class defines the structure for storing transaction details, including information such as date, type of transaction, and amount.

The well-organized project structure ensures modularity and separation of concerns, making it easier to maintain and extend the Bank Application. Each class plays a specific role in the overall functionality of the application, contributing to its efficiency and ease of use.

## Features

The Bank Application offers a range of key features to manage your finances effectively:

1. **Account Creation**: Users can easily create various types of accounts, including current, savings, and salary accounts.

2. **Deposits and Withdrawals**: Perform deposit and withdrawal transactions smoothly, ensuring easy access to funds.

3. **Loan Application**: Apply for loans directly through the application and track the status of loan requests.

4. **Transaction History**: View a detailed transaction history for each account, including transaction type, date, and amount.

5. **User-Friendly Interface**: The user interface (provided by `BankingMenu.java`) is designed for simplicity and ease of use, making banking operations accessible to all users.

6. **Modular Design**: The project structure is organized into separate classes for different account types, promoting modularity and scalability.

## Usage

Getting started with the Bank Application is straightforward:

1. **Prerequisites**:
   - Ensure you have Java installed on your system.
   - Clone this repository to your local machine.

2. **Installation**:
   - Compile the Java classes using your preferred Java compiler.
   - Run the `MainApp.java` class to start the application.

3. **Creating an Account**:
   - Choose the account type you want to create (e.g., savings, current, or salary).
   - Follow the on-screen prompts to provide the necessary details.

4. **Performing Transactions**:
   - Once an account is created, you can make deposits and withdrawals by selecting the respective options from the menu.
   - Transactions are recorded in the transaction history.

5. **Applying for a Loan**:
   - Select the loan option from the menu to apply for a loan.
   - Follow the prompts to provide loan details and await approval.

6. **Viewing Transaction History**:
   - Access your account's transaction history to review past transactions.

7. **Exiting the Application**:
   - Use the menu to exit the application when you're done.

The Bank Application's intuitive menu-driven interface ensures that users can easily navigate and perform essential banking operations. Enjoy managing your finances conveniently with this simple yet effective application.

You can expand upon these sections with more detailed instructions and examples as needed to provide users with a comprehensive guide on using your Bank Application.

## Class Diagram

+---------------------+
|     BankAccount    |
+---------------------+
| - accNo: int        |
| - name: String      |
| - balance: double   |
| - interest: double |
| - transactionHistory: TransactionDetail[] |
| - transactionCount: int |
+---------------------+
| + getAccNo(): int |
| + setAccNo(int): void |
| + getName(): String |
| + setName(String): void |
| + getBalance(): double |
| + setBalance(double): void |
| + getInterest(): double |
| + setInterest(double): void |
| + display(): void |
| + deposit(double): void |
| + withdraw(double): void |
| + calculateInterest(): void |
| - addTransactionDetail(String, double): void |
| + getTransactionHistory(): TransactionDetail[] |
+---------------------+

        /\
        |
        |
        |
        |
        |
        |
        |
        v

+-----------------------+
|  CurrentAccount       |
+-----------------------+
| - overdraftLimit: int |
+-----------------------+
| + getOverdraftLimit(): int |
| + setOverdraftLimit(int): void |
| + deposit(double): void |
| + withdraw(double): void |
| + display(): void |
| + calculateInterest(): void |
+-----------------------+

        /\
        |
        |
        |
        |
        |
        |
        |
        v

+-----------------------+
|  LoanAccount          |
+-----------------------+
| - repaid: double      |
+-----------------------+
| + getRepaid(): double |
| + setRepaid(double): void |
| + calculateInterest(): void |
| + deposit(double): void |
| + display(): void |
+-----------------------+

        /\
        |
        |
        |
        |
        |
        |
        |
        v

+-----------------------+
|  SalaryAccount         |
+-----------------------+
| - lastTransactionDate: LocalDate |
| - currentTransactionDate: LocalDate |
| - min_balance: int     |
+-----------------------+
| + getLastTransactionDate(): LocalDate |
| + setLastTransactionDate(LocalDate): void |
| + setCurrentTransactionDate(LocalDate): void |
| + getMinBal(): int    |
| + setMinBal(int): void |
| + withdraw(double): void |
| + deposit(double): void |
| + display(): void    |
| + TransactionDateDifference(): boolean |
| + calculateInterest(): void |
+-----------------------+

        /\
        |
        |
        |
        |
        |
        |
        |
        v

+-----------------------+
|  SavingsAccount       |
+-----------------------+
| - minBalance: double |
+-----------------------+
| + getMinBalance(): double |
| + setMinBalance(double): void |
| + withdraw(double): void |
| + deposit(double): void |
| + calculateInterest(): void |
| + display(): void |
+-----------------------+

+-----------------------+
|  TransactionDetail    |
+-----------------------+
| - accountNumber: int  |
| - description: String|
| - amount: double     |
+-----------------------+
| + getAccountNumber(): int |
| + getDescription(): String |
| + getAmount(): double |
| + toString(): String |
+-----------------------+

