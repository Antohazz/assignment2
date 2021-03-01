package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount{

	private final double INTEREST_RATE = 0.0001; // Interest rate
	private double balance = 0.0;			  // Current balance
	
	
	//Balance getter
	protected double getBalance() {
		return balance;
	}
	
	//Interest getter
	protected double getInterestRate() {
		return INTEREST_RATE;
	}
	
	
}