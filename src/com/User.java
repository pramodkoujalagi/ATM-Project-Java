package com;
import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Bank b = new ATM();
		
		System.out.println("\nWelcome to Pramod Koujalagi's Bank!");
		System.out.println("********************");
		Scanner in = new Scanner(System.in);
		System.out.println("\nPlease Enter PIN: ");
		int pin = in.nextInt();
		
		if(pin==1508) {
			while(true) {
				System.out.println("\nEnter choice: \n1. Deposit\n2. Withdraw\n3. Balance Enquiry\n4. Exit");
				int choice = in.nextInt();
				switch(choice) {
				
				case 1: 
					System.out.println("Enter amount to be deposited: ");
					b.deposit(in.nextInt());
					break;
				
				case 2:
					System.out.println("Enter amount to be withdrawn: ");
					b.withdraw(in.nextInt());
					break;
				
				case 3:
					b.checkBalance();
					break;
					
				case 4:
					System.exit(0);
					
				default:
					System.out.println("Invalid choice!");
					break;
				}
			}
		
		}
		else
		System.out.println("\nIncorrect PIN");

			
		in.close();
		
	}

}
