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
	private CheckingAccount[] checkArray = new CheckingAccount[0];
	private SavingsAccount[] saveArray = new SavingsAccount[0];
	private CDAccount[] cdArray = new CDAccount[0];

	// Constructors

	public AccountHolder() {

	}

	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);

	}

	// Account GETTERS and SETTERS

	// First name setter & getter

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	protected String getFirstName() {
		return firstName;
	}

	// Middle name setter & getter

	protected void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	protected String getMiddleName() {
		return middleName;
	}

	// Last name setter & getter

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String getLastName() {
		return lastName;
	}

	// SSN setter & getter

	protected void setSSN(String ssn) {
		this.ssn = ssn;
	}

	protected String getSSN() {
		return ssn;
	}

	// Accounts getters

//	protected CheckingAccount getCheckingAccount() {
//		return checkingAccount; 
//	}
//		
//	protected SavingsAccount getSavingsAccount() {
//		return savingsAccount; 
//	}

	protected CheckingAccount addCheckingAccount(double openingBalance) {
		if (getCheckingBalance() + getSavingsBalance() + openingBalance < 250000) {
			
			CheckingAccount checkingAccount = new CheckingAccount(openingBalance);
			
			CheckingAccount[] temp = new CheckingAccount[checkArray.length + 1];
			for (int i = 0; i < checkArray.length; i++) {
				temp[i] = checkArray[i];
			}
			checkArray = temp;
			checkArray[checkArray.length - 1] = checkingAccount;

			return checkArray[checkArray.length - 1];
			
		} else
			return null;
	}

	protected CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		if (getCheckingBalance() + getSavingsBalance() < 250000) {
			
			CheckingAccount[] temp = new CheckingAccount[checkArray.length + 1];
			for (int i = 0; i < checkArray.length; i++) {
				temp[i] = checkArray[i];
			}
			checkArray = temp;
			checkArray[checkArray.length - 1] = checkingAccount;

			return checkArray[checkArray.length - 1];
		} else
			return null;
	}

	protected CheckingAccount[] getCheckingAccounts() {
		return checkArray;
	}

	protected int getNumberOfCheckingAccounts() {
		return checkArray.length;
	}

	protected double getCheckingBalance() {
		if(checkArray != null) {
		double chBalance = 0.0;
		for (int i = 0; i < checkArray.length; i++) {
			chBalance += checkArray[i].getBalance();
		}
		return chBalance;
		}else return 0;
	}

	protected SavingsAccount addSavingsAccount(double openingBalance) {
		if (getCheckingBalance() + getSavingsBalance() + openingBalance < 250000) {
			SavingsAccount savingsAccount = new SavingsAccount(openingBalance);
			SavingsAccount[] temp = new SavingsAccount[saveArray.length + 1];
			for (int i = 0; i < saveArray.length; i++) {
				temp[i] = saveArray[i];
			}
			saveArray = temp;
			saveArray[saveArray.length - 1] = savingsAccount;

			return saveArray[saveArray.length - 1];
		} else
			return null;
	}

	protected SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		if (getCheckingBalance() + getSavingsBalance() < 250000) {
			SavingsAccount[] temp = new SavingsAccount[saveArray.length + 1];
			for (int i = 0; i < saveArray.length; i++) {
				temp[i] = saveArray[i];
			}
			saveArray = temp;
			saveArray[saveArray.length - 1] = savingsAccount;

			return saveArray[saveArray.length - 1];
		} else
			return null;
	}

	protected SavingsAccount[] getSavingsAccounts() {
		return saveArray;
	}

	protected int getNumberOfSavingsAccounts() {
		return saveArray.length;
	}

	protected double getSavingsBalance() {
		if (saveArray != null) {
		double svBalance = 0.0;
		for (int i = 0; i < saveArray.length; i++) {
			svBalance += saveArray[i].getBalance();
		}
		return svBalance;
		}else return 0;
	}

	protected CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		CDAccount cdAccount = new CDAccount(offering, openingBalance);
		return cdAccount;
	}

	protected CDAccount addCDAccount(CDAccount cdAccount) {
		CDAccount[] temp = new CDAccount[cdArray.length + 1];
		for (int i = 0; i < cdArray.length; i++) {
			temp[i] = cdArray[i];
		}
		cdArray = temp;
		cdArray[cdArray.length - 1] = cdAccount;

		return cdArray[cdArray.length - 1];
	}

	protected CDAccount[] getCDAccounts() {
		return cdArray;
	}

	protected int getNumberOfCDAccounts() {
		return cdArray.length;
	}

	protected double getCDBalance() {
		if (cdArray != null) {
			double cdBalance = 0.0;
			for (int i = 0; i < cdArray.length; i++) {
				cdBalance += cdArray[i].getBalance();
			}
			return cdBalance;
		} else
			return 0;

	}

	protected double getCombinedBalance() {
		return getCDBalance() + getSavingsBalance() + getCheckingBalance();
	}

	// OUTPUT
	// Outputs account info
//	public String toString() {
//		String accountInfo = "Name: " + getFirstName() + " " + getMiddleName() + " " + getLastName() + "/n" +
//				"SSN: " + getSSN() + "/n" +
//				"Checking Account Balance: $" + getCheckingAccount().getBalance() + "/n"+
//				"Checking Account Interest Rate: " + getCheckingAccount().getInterestRate() +"/n"+
//				"Checking Account Balance in 3 years: $" + "/n" +
//				"Savings Account Balance: $" + getSavingsAccount().getBalance() + "/n" +
//				"Savings Account Interest Rate: " + getSavingsAccount().getInterestRate()+ "/n" +
//				"Savings Account Balance in 3 years: $";
//		return accountInfo;	
//		}

}
