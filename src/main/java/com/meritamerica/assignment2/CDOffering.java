package com.meritamerica.assignment2;

public class CDOffering{

	private double interestRate;
	private int term;
	private int balance;

	public CDOffering(int term, double interestRate) {
		this.term = term;
		this.interestRate = interestRate;
		this.balance = 0;
	}
	
	
	public int getTerm() {
		return term;
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	
}


