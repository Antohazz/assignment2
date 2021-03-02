package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount{
	
	
	
	//Sets opening balance
	CDAccount(CDOffering offering, double openingBalance){
		this.offering = offering;
		this.balance = openingBalance;
		
	}
	
	int getTerm() {
		
	}
	
	
	
	// Outputs account info
	public String toString() {
		String checkAccInfo = "CDAccount Account Balance: $" + getBalance() + "/n"+
				"CDAccount Account Interest Rate: " + getInterestRate() + "/n"+
				"CDAccount Account Balance in 3 years: $" + futureValue(3);
		return checkAccInfo;
	}
	
	
}//class




//double getBalance()
//double getInterestRate()

//java.util.Date getStartDate()
//long getAccountNumber()
//double futureValue()
