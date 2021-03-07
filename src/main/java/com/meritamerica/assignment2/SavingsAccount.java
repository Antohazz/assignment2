package com.meritamerica.assignment2;

/* Savings account class.
 * Allows to access balance, do deposit/withdraw, calculate future value
 * and set interest rate. 
 */


public class SavingsAccount extends BankAccount{
	
	private final double INTEREST_RATE = 0.01; // Interest rate
//	private double balance;	// Current balance
	
	//Sets opening balance
	SavingsAccount(double openingBalance){
		super(openingBalance);
	}
	

	//Interest getter
	public double getInterestRate() {
		return INTEREST_RATE;
	}
	
//	
	
//	// Outputs account info
//	public String toString() {
//		String saveAccInfo = "Savings Account Balance: $" + getBalance() + "/n"+
//				"Savings Account Interest Rate: " + getInterestRate() + "/n"+
//				"Savings Account Balance in 3 years: $" + futureValue(3);
//		return saveAccInfo;
//	}
	
	
}
