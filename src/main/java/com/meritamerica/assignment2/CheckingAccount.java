package com.meritamerica.assignment2;

/* Checking account class.
 * Allows to access balance, do deposit/withdraw, calculate future value
 * and set interest rate. 
 */


public class CheckingAccount extends BankAccount{

	private double interestRate = 0.0001; // Interest rate
	private double balance = 0.0;			  // Current balance
	
	
	//Sets opening balance
	CheckingAccount(double openingBalance){
		this.balance = openingBalance;
	}
	
	//Balance getter
	protected double getBalance() {
		return balance;
	}
	
	//Interest getter
	protected double getInterestRate() {
		return interestRate;
	}
	
	
	
	// Outputs account info
	public String toString() {
		String checkAccInfo = "Checking Account Balance: $" + getBalance() + "/n"+
				"Checking Account Interest Rate: " + getInterestRate() + "/n"+
				"Checking Account Balance in 3 years: $" + futureValue(3);
		return checkAccInfo;
	}
	
	
}//class


