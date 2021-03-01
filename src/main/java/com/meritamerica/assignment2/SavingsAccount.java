package com.meritamerica.assignment2;

/* Savings account class.
 * Allows to access balance, do deposit/withdraw, calculate future value
 * and set interest rate. 
 */



public class SavingsAccount extends BankAccount{


	
	//Sets opening balance
	SavingsAccount(double openingBalance){
		this.balance = openingBalance;
	}


	// Outputs account info
	public String toString() {
		String saveAccInfo = "Savings Account Balance: $" + getBalance() + "/n"+
				"Savings Account Interest Rate: " + getInterestRate() + "/n"+
				"Savings Account Balance in 3 years: $" + futureValue(3);
		return saveAccInfo;
	}
	
	
}//class