package com.mypackage;

public class MainApp {
    public static void main(String[] args) {
        BankingMenu bankingMenu = new BankingMenu(); 
        bankingMenu.acceptData();
        bankingMenu.process();
    }
}