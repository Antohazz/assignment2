package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount{
	private CDOffering offering;
	private int term = 0;
	private Date startDate;
	private double balance;
	
	//Sets opening balance
	CDAccount(CDOffering offering, double openingBalance){
		this.offering = offering;
		this.balance = openingBalance;
		this.startDate = getStartDate();
		
	}
	
	protected Date getStartDate() {
	
		Date date = new java.util.Date();
		
		return date;
	}
	
	
	protected int getTerm() {
		return term;
	}
	
	protected double futureValue() {
		double futureBalance = balance * Math.pow(1 + getInterestRate(), getTerm());
		return futureBalance;
	}
	
	
	// Outputs account info
	public String toString() {
		String checkAccInfo = "CDAccount Account Balance: $" + getBalance() + "/n"+
				"CDAccount Account Interest Rate: " + getInterestRate() + "/n"+
				"CDAccount Account Balance in 3 years: $" + futureValue(3);
		return checkAccInfo;
	}
	
	
}//class





