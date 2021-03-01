package com.meritamerica.assignment2;

/* Checking account class.
 * Allows to access balance, do deposit/withdraw, calculate future value
 * and set interest rate. 
 */


public class CheckingAccount extends BankAccount{

	
	//Sets opening balance
	CheckingAccount(double openingBalance){
		this.balance = openingBalance;
	}
	
	
	
	
	// Outputs account info
	public String toString() {
		String checkAccInfo = "Checking Account Balance: $" + getBalance() + "/n"+
				"Checking Account Interest Rate: " + getInterestRate() + "/n"+
				"Checking Account Balance in 3 years: $" + futureValue(3);
		return checkAccInfo;
	}
	
	
}//class


