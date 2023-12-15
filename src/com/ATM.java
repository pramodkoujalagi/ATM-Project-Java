package com;

public class ATM implements Bank{
	
	int balance = 10000;
	
	public void deposit(int amount) {
		System.out.println("Amount deposited successfully: "+amount);
		balance +=amount;
		checkBalance();
		
		
		
	}
	
	public void withdraw(int amount) {
		System.out.println("Amount withdrawn successfully: "+amount);
		balance -=amount;
		checkBalance();
		
	}
	
	public void checkBalance() {
		System.out.println("Available balance: "+balance);
	}

}
