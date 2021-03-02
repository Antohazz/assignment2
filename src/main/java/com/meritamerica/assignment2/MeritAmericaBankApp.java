package com.meritamerica.assignment2;


public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");
		
		
    	CDOffering of1 = new CDOffering(1,1.8/100);
    	CDOffering of2 = new CDOffering(2,1.9/100);
    	CDOffering of3 = new CDOffering(3,2.0/100);
    	CDOffering of4 = new CDOffering(5,2.5/100);
    	CDOffering of5 = new CDOffering(10,2.2/100);
		
		
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
	}
}




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
