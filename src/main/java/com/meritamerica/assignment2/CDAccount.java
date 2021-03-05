package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount{
	
	public CDAccount(CDOffering offering, double balance) {
		super.offering = offering;
		super.balance = balance;
		super.accountNumber = MeritBank.getNextAccountNumber();
	}
	
	public int getTerm() {
		return offering.getTerm();
	}
	public double getInterestRate() {
		return offering.getInterestRate();
	}

	public Date getStartDate(){
		Date date = new Date();
		return date;
	}
	
	
	
}

