package com.meritamerica.assignment2;

/* Checking account class.
 * Allows to access balance, do deposit/withdraw, calculate future value
 * and set interest rate. 
 */

public class CheckingAccount extends BankAccount{
	
	private final double INTEREST_RATE = 0.0001;
//	private double balance;
	
	//Sets opening balance
	CheckingAccount(double openingBalance){
		super(openingBalance);
	}
	
//	//Balance getter
//	public double getBalance() {
//		return balance;
//	}
	
	//Interest getter
	public double getInterestRate() {
		return INTEREST_RATE;
	}
	
//	//Withdraw method. Overdraft not allowed.
//	public boolean withdraw(double amount) {
//		if (amount > 0 && amount <= balance) {
//			balance -=amount;
//			return true;
//		}else {
//			System.out.println("Incorrect amount or exceeding balance.");
//			return false;
//			}
//		
//	}
//	
//	//Deposit method. Not allowed 0 & negative deposit.
//	public boolean deposit(double amount) {
//		if(amount > 0) {
//			balance +=amount;
//			return true;
//		}else {
//			System.out.println("Can't be zero or negative.");
//			return false;
//		}
//		
//	}
//	
	
//	// Outputs account info
//	public String toString() {
//		String checkAccInfo = "Checking Account Balance: $" + getBalance() + "/n"+
//				"Checking Account Interest Rate: " + INTEREST_RATE + "/n"+
//				"Checking Account Balance in 3 years: $" + futureValue(3);
//		return checkAccInfo;
//	}
	
	
}


