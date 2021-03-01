package com.meritamerica.assignment2;


public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");
		
		
		/* Instantiates an account holder
		with a checking balance of $100 and a savings balance of $1000*/
		AccountHolder ah1 = new AccountHolder("John", "James", "Doe", "123-45-6789");
		
		
		ah1.addCheckingAccount(1000);
		
		//Outputs account info
		ah1.toString();
		
		//Deposits $500 into the checking account
		ah1.getCheckingAccount().deposit(500.0);
		
		//Withdraws $800 from the savings account
		ah1.getSavingsAccount().withdraw(800.0);
		
		//Displays the checking account toString() output
		ah1.getCheckingAccount().toString();
		
		//Displays the savings account toString() output
		ah1.getSavingsAccount().toString();
		
		
	}
}


//
//Add 5 CDOfferings to MeritBank
//Instantiate a new AccountHolder (ah1)
//Add a checking account with an opening balance of $1,000 as well as a savings account with an opening balance of $10,000 to ah1
//Add a checking account with an opening balance of $5,000 as well as a savings account with an opening balance of $50,000 to ah1
//Add a checking account with an opening balance of $50,000 as well as a savings account with an opening balance of $500,000 to ah1
//Add a checking account with an opening balance of $5,000 as well as a savings account with an opening balance of $50,000 to ah1
//Confirm last checking and savings accounts were not created
//Add the best CD offering as a CD account on ah1
//Add ah1 to Merit Bank’s list of account holders
//Instantiate a new AccountHolder (ah2)
//Add a checking account with an opening balance of $1,000 as well as a savings account with an opening balance of $10,000 to ah2
//Add the second best CD offering as a CD account on ah2
//Add ah2 to Merit Bank’s list of account holders
//Clear the CDs being offered by MeritBank
//Instantiate a new AccountHolder (ah3)
//Add the second best CD offering as a CD account on ah3
//Confirm a CD account was not created on ah3
//Add a checking account with an opening balance of $1,000 as well as a savings account with an opening balance of $10,000 to ah3
//Add ah3 to Merit Bank’s list of account holders
//Get the total balance of all accounts held by Merit Bank’s account holders
