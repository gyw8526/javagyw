package pra2;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args){
		CheckingAccount account1 = new CheckingAccount(100.00,100.00,0.1,0.07);
		CheckingAccount account2 = new CheckingAccount(100.00,100.00,0.1,0.07);
		/*
		Account account1 = new Account(100.00);
		Account account2 = new Account(100.00);
		 */
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());
		
		Scanner Input = new Scanner(System.in);
		double depositAmount;
		
		System.out.print("Enter deposit amount for account1:");
		depositAmount = Input.nextDouble();
		System.out.printf("subtracting %.2f from account1 balance\n",depositAmount);
		account1.credit(depositAmount);
		
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());
		
		System.out.printf("Enter withdrawal amount for account2:");
		depositAmount = Input.nextDouble();
		System.out.printf("subtracting %.2f from account2 balance\n", depositAmount);
		account2.debit(depositAmount);
		
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());
		
		account1.nextMonth(0.01, 0.07,account1.getBalance());
	    account2.nextMonth(0.01, 0.07,account2.getBalance());
	      
	    System.out.println("next month!");
	      
	    System.out.printf("account1 balance: %.2f\n", account1.getBalance());
	    System.out.printf("account2 balance: %.2f\n", account2.getBalance()); 
		
	}
}
