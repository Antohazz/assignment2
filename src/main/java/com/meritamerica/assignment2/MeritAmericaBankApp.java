package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");
		
		
		new CDOffering(1,0.018);
    	new CDOffering(2,0.019);
    	new CDOffering(3,0.020);
    	new CDOffering(5,0.025);
    	new CDOffering(10,0.022);
		
		
		/* Instantiates an account holder
		with a checking balance of $100 and a savings balance of $1000*/
		AccountHolder ah1 = new AccountHolder("John", "James", "Doe", "123-45-6789");
		
		
		ah1.addCheckingAccount(1000);
		ah1.addSavingsAccount(10000);
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);
		ah1.addCheckingAccount(50000);
		ah1.addSavingsAccount(500000);
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount(50000);
		
		System.out.println(ah1.getNumberOfCheckingAccounts());
		System.out.println(ah1.getNumberOfSavingsAccounts());
		System.out.println(ah1.getCheckingBalance());
		System.out.println(ah1.getSavingsBalance());
		System.out.println(ah1.getCombinedBalance());
		
		//Add the best CD offering as a CD account on ah1
		MeritBank.getBestCDOffering(ah1.getCombinedBalance());
		
		//Add ah1 to Merit Bank’s list of account holders
		MeritBank.addAccountHolder(ah1);
		
		
		
		//Instantiate a new AccountHolder (ah2)
		AccountHolder ah2 = new AccountHolder("Major", "Major", "Major", "777-77-7777");
		
		//Add a checking account with an opening balance of $1,000 as well as a savings account with an opening balance of $10,000 to ah2
		ah1.addCheckingAccount(1000);
		ah1.addSavingsAccount(10000);
		
		//Add the second best CD offering as a CD account on ah2
		MeritBank.getSecondBestCDOffering(ah2.getCombinedBalance());
		
		//Add ah2 to Merit Bank’s list of account holders
		//Clear the CDs being offered by MeritBank
		//Instantiate a new AccountHolder (ah3)
		//Add the second best CD offering as a CD account on ah3
		//Confirm a CD account was not created on ah3
		//Add a checking account with an opening balance of $1,000 as well as a savings account with an opening balance of $10,000 to ah3
		//Add ah3 to Merit Bank’s list of account holders
		//Get the total balance of all accounts held by Merit Bank’s account holders
		
	}
}