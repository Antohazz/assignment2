package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	
	/*classvars*/
	private static AccountHolder[] AccountArray = new AccountHolder[0];
	private static CDOffering[] CDOfferingArray = new CDOffering[5];
	

	protected static void addAccountHolder(AccountHolder accountHolder) {
		
		AccountHolder[] tempArr = new AccountHolder[AccountArray.length + 1];
		
			for (int i = 0; i < AccountArray.length; i++) {
				tempArr[i] = AccountArray[i];
			}
			AccountArray = tempArr;
						
	}//addAccountHolder()

	
	
	protected static AccountHolder[] getAccountHolders() {
		return AccountArray;
		
	}
	
	
	
	protected static CDOffering[] getCDOfferings() {
		
		return CDOfferingArray;
		
	}
	
	protected static void setCDOfferings(CDOffering[] offerings) {
		
		CDOfferingArray = offerings;
	}
	
	
	protected static void clearCDOfferings() {
		
		CDOfferingArray = new CDOffering[5];
	
	}
	
	

}//class






//
//static CDOffering getBestCDOffering(double depositAmount)
//static CDOffering getSecondBestCDOffering(double depositAmount)
//static void clearCDOfferings()

//static long getNextAccountNumber()
//static double totalBalances()
//static double futureValue(double presentValue, double interestRate, int term)
