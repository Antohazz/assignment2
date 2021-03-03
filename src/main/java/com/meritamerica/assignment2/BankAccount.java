package com.meritamerica.assignment2;

public class BankAccount {
	
	private double interestRate;
	private long accountNumber;
	private double balance;
	
	public BankAccount() {
		
	}
	
	public BankAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public BankAccount(long accountNumber, double balance, double interestRate) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -=amount;
			return true;
		}else {
			System.out.println("Incorrect amount or exceeding balance.");
			return false;
			}
	}
	
	public boolean deposit (double amount) {
		if(amount > 0) {
			balance +=amount;
			return true;
		}else {
			System.out.println("Can't be zero or negative.");
			return false;
		}
	}
	
	public double futureValue(int years) {
		double futureBalance = balance * Math.pow(1 + getInterestRate(), years);
		return futureBalance;
	}

	
	
}//class







