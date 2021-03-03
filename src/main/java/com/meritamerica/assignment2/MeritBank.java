package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	
	/*classvars*/
	protected static int accountNumberCounter = 0;
	private static AccountHolder[] AccountArray = new AccountHolder[0];
	private static CDOffering[] CDOfferingArray = new CDOffering[5];
	

	
	protected static void addAccountHolder(AccountHolder accountHolder) {
		
		AccountHolder[] tempArr = new AccountHolder[AccountArray.length + 1];
					
			for (int i = 0; i < AccountArray.length; i++) {
				tempArr[i] = AccountArray[i];
			}
			AccountArray = tempArr;
			
			AccountArray[AccountArray.length - 1] = accountHolder;
						
	}//addAccountHolder()

	
	
	
	public static AccountHolder[] getAccountHolders() {
		return AccountArray;
	}
	
	public static CDOffering[] getCDOfferings() {
		return CDOfferingArray;
	}
	
	public static void setCDOfferings(CDOffering[] offerings) {
		CDOfferingArray = offerings;
	}
	
	
	public static CDOffering getBestCDOffering(double depositAmount) {

	}
		
	
	public static CDOffering getSecondBestCDOffering(double depositAmount) {
		
	}

		
	public static void clearCDOfferings() {
		CDOfferingArray = null;
	}
	
	
	
	protected static double totalBalances() {
		double totalBalances = 0;
		
		for(int i = 0; i < AccountArray.length; i++) {
			totalBalances += AccountArray[i].getCombinedBalance();
		}
		return totalBalances;
	}
	
	
	protected static long getNextAccountNumber() {
		
		return accountNumberCounter + 1;
	}
	
			
	
	public static double futureValue(double presentValue, double interestRate, int term) {
		double futureValue = presentValue * Math.pow(1 + interestRate, term);
		return futureValue;
	}
	
	
	

}//class


//

