package com.meritamerica.assignment2;

/* Savings account class.
 * Allows to access balance, do deposit/withdraw, calculate future value
 * and set interest rate. 
 */


public class SavingsAccount extends BankAccount{
	
	private final double INTEREST_RATE = 0.01; // Interest rate
	private double balance = 0.0;	// Current balance
	
	//Sets opening balance
	SavingsAccount(double openingBalance){
		this.balance = openingBalance;
	}
	
	//Balance getter
	protected double getBalance() {
		return balance;
	}
	
	//Interest getter
	protected double getInterestRate() {
		return INTEREST_RATE;
	}
	
	//Withdraw method. Overdraft not allowed.
	protected boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -=amount;
			return true;
		}else {
			System.out.println("Incorrect amount or exceeding balance.");
			return false;
		}
		
	}
	
	//Deposit method. Not allowed 0 & negative deposit.
	protected boolean deposit(double amount) {
		if(amount > 0) {
			balance +=amount;
			return true;
		}else {
			System.out.println("Can't be zero or negative.");
			return false;
		}
		
	}
	
	// Outputs the future value of the account balance based on the interest/years.
	protected double futureValue(int years) {
		double futureBalance = balance * Math.pow(1 + getInterestRate(), years);
		return futureBalance;
	}
	
	
	// Outputs account info
	public String toString() {
		String saveAccInfo = "Savings Account Balance: $" + balance + "/n"+
				"Savings Account Interest Rate: " + getInterestRate() + "/n"+
				"Savings Account Balance in 3 years: $" + futureValue(3);
		return saveAccInfo;
	}
	
	
}
