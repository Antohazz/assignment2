package com.meritamerica.assignment2;

import java.util.Arrays;

import com.meritamerica.assignment1.CheckingAccount;
import com.meritamerica.assignment1.SavingsAccount;

/* AccountHolder class for MeritAmericaBankApp.
 * Allows to create new account account.
 * Provides getter and setter methods to access account's properties.
 */


public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;

	
	//Constructors
	
	public AccountHolder() {

	}
	
	public AccountHolder (String firstName, String middleName, String lastName, String ssn) {

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		
	}
		
	
	//AccountHolder primary GETTERS and SETTERS
	
	//First name setter & getter
	
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	protected String getFirstName() {
		return firstName; 
	}
	
	
	//Middle name setter & getter
	
	protected void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	protected String getMiddleName() {
		return middleName; 
	}
	
	
	//Last name setter & getter
	
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String getLastName() {
		return lastName; 
	}
	
	//SSN setter & getter
	
	protected void setSSN(String ssn) {
		this.ssn = ssn;
	}

	protected String getSSN() {
		return ssn; 
	}
	

	//ACCOUNTS creation and access
	
	//CHECKING
	
	private CheckingAccount addCheckingAccount(double openingBalance) {
		
	}
	
	private CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		
	}
	
	protected CheckingAccount[] getCheckingAccounts() {
		
	}
	protected int getNumberOfCheckingAccounts() {
		
	}
	protected double getCheckingBalance() {
		
	}

	
}//class





//SavingsAccount addSavingsAccount(double openingBalance)
//SavingsAccount addSavingsAccount(SavingsAccount savingsAccount)
//SavingsAccount[] getSavingsAccounts()
//int getNumberOfSavingsAccounts()
//double getSavingsBalance()

//CDAccount addCDAccount(CDOffering offering, double openingBalance)
//CDAccount addCDAccount(CDAccount cdAccount)
//CDAccount[] getCDAccounts()
//int getNumberOfCDAccounts()
//double getCDBalance()
//double getCombinedBalance()
