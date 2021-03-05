package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");
		
		
    	CDOffering[] CDOfferings = new CDOffering[5];
    	
    	CDOfferings[0] = new CDOffering(1,0.018);
    	CDOfferings[1] = new CDOffering(2,0.019);
    	CDOfferings[2] = new CDOffering(3,0.02);
    	CDOfferings[3] = new CDOffering(5,0.025);
    	CDOfferings[4] = new CDOffering(10,0.022);
    	
    	MeritBank.setCDOfferings(CDOfferings);
		
    	System.out.println("CD offerings");
        for (int i  = 0; i < CDOfferings.length; i++) {
        	System.out.println(CDOfferings[i].getInterestRate());
        	System.out.println(CDOfferings[i].getTerm());
        }
    	
		/* Instantiates an account holder
		with a checking balance of $100 and a savings balance of $1000*/
		AccountHolder ah1 = new AccountHolder("John", "James", "Doe", "123-45-6789");
		

			
		//Add the best CD offering as a CD account on ah1
		MeritBank.getBestCDOffering(ah1.getCombinedBalance());
		
		//Add ah1 to Merit Bank’s list of account holders
		MeritBank.addAccountHolder(ah1);
		
		
		System.out.println("Account 1");
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
		
		System.out.println(ah1.getCheckingAccounts()[2].getAccountNumber());
		
		
		//Instantiate a new AccountHolder (ah2)
		AccountHolder ah2 = new AccountHolder("Major", "Major", "Major", "777-77-7777");
		
		//Add a checking account with an opening balance of $1,000 as well as a savings account with an opening balance of $10,000 to ah2
		ah2.addCheckingAccount(1000);
		ah2.addSavingsAccount(10000);
		

		//Add the second best CD offering as a CD account on ah2
		MeritBank.getSecondBestCDOffering(ah2.getCombinedBalance());
		
		//Add ah2 to Merit Bank’s list of account holders
		MeritBank.addAccountHolder(ah2);
		
		//Clear the CDs being offered by MeritBank
		MeritBank.clearCDOfferings();
		
		
		System.out.println("Account 2");
		System.out.println(ah2.getNumberOfCheckingAccounts());
		System.out.println(ah2.getNumberOfSavingsAccounts());
		System.out.println(ah2.getCheckingBalance());
		System.out.println(ah2.getSavingsBalance());
		System.out.println(ah2.getCombinedBalance());
		
		
		
		
		//Instantiate a new AccountHolder (ah3)
		AccountHolder ah3 = new AccountHolder("Dick", "Herbert", "Herring", "555-55-5555");
		
		//Add the second best CD offering as a CD account on ah3
		MeritBank.getSecondBestCDOffering(ah2.getCombinedBalance());
		
		//Confirm a CD account was not created on ah3
		ah3.getCDAccounts();
		
		//Add a checking account with an opening balance of $1,000 as well as a savings account with an opening balance of $10,000 to ah3
		ah3.addCheckingAccount(1000);
		ah3.addSavingsAccount(10000);
		
		//Add ah3 to Merit Bank’s list of account holders
		MeritBank.addAccountHolder(ah3);
		
		System.out.println("Account 3");
		System.out.println(ah3.getNumberOfCheckingAccounts());
		System.out.println(ah3.getNumberOfSavingsAccounts());
		System.out.println(ah3.getCheckingBalance());
		System.out.println(ah3.getSavingsBalance());
		System.out.println(ah3.getCombinedBalance());
		
		
		//Get the total balance of all accounts held by Merit Bank’s account holders
		MeritBank.totalBalances();
		System.out.println("Total assets");
		System.out.println(MeritBank.totalBalances());
	}
}