package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount{
	
	public CDAccount(CDOffering offering, double balance) {
		this.offering = offering;
		this.balance = balance;
	}
	
	int getTerm() {
		return offering.getTerm();
	}
	
	public Date getStartDate(){
		Date date = new Date();
		return date;
	}
	
	
}

