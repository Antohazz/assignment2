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
	private CheckingAccount[] checkArray = new CheckingAccount[1];
	private SavingsAccount[] saveArray = new SavingsAccount[1];
	private CDAccount[] cdArray = new CDAccount[1];
	private final int MAXV = 250000;

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


	
	
	protected CheckingAccount addCheckingAccount(double openingBalance) {
			
			CheckingAccount checkingAccount = new CheckingAccount(openingBalance);
			
			return addCheckingAccount(checkingAccount);
		 
	}

	protected CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		if (getCheckingBalance() + getSavingsBalance() + checkingAccount.getBalance() < MAXV) {
			
			for (int i = 0; i < checkArray.length; i++) {
				if (checkArray[i] == null) {
					checkArray[i] = checkingAccount;
					
					//Extending Array if full
					if(i == checkArray.length - 1) {
						CheckingAccount[] temp = new CheckingAccount[checkArray.length * 2];
						for (int j = 0; j < checkArray.length; j++) {
							temp[j] = checkArray[j];
						}
						checkArray = temp;		
					}
					
					break;
				}
			}
			return checkingAccount;
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
		double chBalance = 0.0;
		for (int i = 0; i < checkArray.length; i++) {
			if (checkArray[i] != null)
			chBalance += checkArray[i].getBalance();
			else break;
		}
		return chBalance;
	}

	
	
	
	
	
	
	protected SavingsAccount addSavingsAccount(double openingBalance) {
			
			SavingsAccount savingsAccount = new SavingsAccount(openingBalance);

			return addSavingsAccount(savingsAccount);
		 
			
	}

	protected SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		if (getCheckingBalance() + getSavingsBalance() + savingsAccount.getBalance() < MAXV) {
		
			for (int i = 0; i < saveArray.length; i++) {
				if (saveArray[i] == null) {
					saveArray[i] = savingsAccount;
					
					
					//Extending Array if full
					if(i == saveArray.length - 1) {
						SavingsAccount[] temp = new SavingsAccount[saveArray.length * 2];
						for (int j = 0; j < saveArray.length; j++) {
							temp[j] = saveArray[j];
						}
						saveArray = temp;		
					}
					
					
					break;
				}
			}
		
			return savingsAccount;
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
		double svBalance = 0.0;
		for (int i = 0; i < saveArray.length; i++) {
			if (saveArray[i] != null)
			svBalance += saveArray[i].getBalance();
			else break;
		}
		return svBalance;
	}

	
	
	
	
	protected CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		CDAccount cdAccount = new CDAccount(offering, openingBalance);
		return addCDAccount(cdAccount);
	}

	protected CDAccount addCDAccount(CDAccount cdAccount) {
		
		for (int i = 0; i < cdArray.length; i++) {
			if (cdArray[i] == null) {
				cdArray[i] = cdAccount;
				
				
				//Extending Array if full
				if(i == cdArray.length - 1) {
					CDAccount[] temp = new CDAccount[cdArray.length * 2];
					for (int j = 0; j < cdArray.length; j++) {
						temp[j] = cdArray[j];
					}
					cdArray = temp;		
				}
				
				
				break;
			}
		}
	
		return cdAccount;
	}

	protected CDAccount[] getCDAccounts() {
		return cdArray;
	}

	protected int getNumberOfCDAccounts() {
		return cdArray.length;
	}

	protected double getCDBalance() {
			double cdBalance = 0.0;
			for (int i = 0; i < cdArray.length; i++) {
				if (cdArray[i] != null)
				cdBalance += cdArray[i].getBalance();
				else break;
			}
			return cdBalance;
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
