package com.meritamerica.assignment2;

import java.util.Arrays;

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
	private CDAccount cdAccount;
//	private int NumberOfCheckingAccounts;
//	private int NumberOfSavingsAccounts;
	private CheckingAccount[] checkingAccountArray = new CheckingAccount[0];
	private SavingsAccount[] savingsAccountArray = new SavingsAccount[0];
	private CDAccount[] cdAccountArray = new CDAccount[0];

	
	
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
	
	
	//Accounts getters
	
	protected CheckingAccount getCheckingAccount() {
		return checkingAccount; 
	}
		
	protected SavingsAccount getSavingsAccount() {
		return savingsAccount; 
	}

	
	//ACCOUNTS creation and access
	
	//CHECKING
	
	protected CheckingAccount addCheckingAccount(double openingBalance) {
		
		this.checkingAccount = new CheckingAccount(openingBalance);
		
		CheckingAccount[] tempArr = new CheckingAccount [checkingAccountArray.length + 1];
		
		for (int i = 0; i < checkingAccountArray.length; i++) {
			tempArr[i] = checkingAccountArray[i];
		}
		checkingAccountArray = tempArr;
		
		return checkingAccount;
	}
	
	protected CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
		
		
		CheckingAccount[] tempArr = new CheckingAccount [checkingAccountArray.length + 1];
		
		for (int i = 0; i < checkingAccountArray.length; i++) {
			tempArr[i] = checkingAccountArray[i];
		}
		checkingAccountArray = tempArr;
		
		
		
		return checkingAccount;
	}
	
	protected CheckingAccount[] getCheckingAccounts() {
		return checkingAccountArray;
	}

	protected int getNumberOfCheckingAccounts() {
	
		return checkingAccountArray.length;
		
	}
	
	protected double getCheckingBalance() {
		return this.getCheckingBalance();
	}

	
	
	//SAVINGS
	
	protected SavingsAccount addSavingsAccount(double openingBalance) {
		this.savingsAccount = new SavingsAccount(openingBalance);
		
		SavingsAccount[] tempArr = new SavingsAccount [savingsAccountArray.length + 1];
		
		for (int i = 0; i < savingsAccountArray.length; i++) {
			tempArr[i] = savingsAccountArray[i];
		}
		savingsAccountArray = tempArr;
		
		return savingsAccount;
	}
	
	protected SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
		
		SavingsAccount[] tempArr = new SavingsAccount [savingsAccountArray.length + 1];
		
		for (int i = 0; i < savingsAccountArray.length; i++) {
			tempArr[i] = savingsAccountArray[i];
		}
		savingsAccountArray = tempArr;
		
		return savingsAccount;
	}
	
	
	protected SavingsAccount[] getSavingsAccounts() {
		return savingsAccountArray;
	}
	
	protected int getNumberOfSavingsAccounts() {
		
		return savingsAccountArray.length;
		
	}
	
	protected double getSavingsBalance() {
		return this.getSavingsBalance();
	}

	
	//CDAccount
	
	protected CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		this.cdAccount = new CDAccount(offering, openingBalance);
		
		CDAccount[] tempArr = new CDAccount [cdAccountArray.length + 1];
		
		for (int i = 0; i < cdAccountArray.length; i++) {
			tempArr[i] = cdAccountArray[i];
		}
		cdAccountArray = tempArr;
		
		return cdAccount;
	}

	protected CDAccount addCDAccount(CDAccount cdAccount) {
		this.cdAccount = cdAccount;
		
		CDAccount[] tempArr = new CDAccount [cdAccountArray.length + 1];
		
		for (int i = 0; i < cdAccountArray.length; i++) {
			tempArr[i] = cdAccountArray[i];
		}
		cdAccountArray = tempArr;
		
		return cdAccount;
	}
	
	
	protected CDAccount[] getCDAccounts() {
		return cdAccountArray;
	}

	protected int getNumberOfCDAccounts() {
		
		return cdAccountArray.length;
		
	}
	
	protected double getCDBalance() {
		return this.getCDBalance();
	}

	
	
	
	//Combined balance
	protected double getCombinedBalance() {
		double combinedCheckingBalance = 0;
		for (int i = 0 ; i < getNumberOfCheckingAccounts(); i++) {
			combinedCheckingBalance += this.checkingAccountArray[i].getBalance();
		}
		double combinedSavingsBalance = 0;
		for (int i = 0 ; i < getNumberOfSavingsAccounts(); i++) {
			combinedSavingsBalance += this.savingsAccountArray[i].getBalance();
		}
		
		double combinedBalance = combinedCheckingBalance + combinedSavingsBalance;
		
		return combinedBalance;
	}

	// OUTPUT
	// Outputs account info
	public String toString() {
		String accountInfo = "Name: " + getFirstName() + " " + getMiddleName() + " " + getLastName() + "/n" +
				"SSN: " + getSSN() + "/n" +
				"Checking Account Balance: $" + getCheckingAccount().getBalance() + "/n"+
				"Checking Account Interest Rate: " + getCheckingAccount().getInterestRate() +"/n"+
				"Checking Account Balance in 3 years: $" + "/n" +
				"Savings Account Balance: $" + getSavingsAccount().getBalance() + "/n" +
				"Savings Account Interest Rate: " + getSavingsAccount().getInterestRate()+ "/n" +
				"Savings Account Balance in 3 years: $";
		return accountInfo;	
		}
	
}//class







