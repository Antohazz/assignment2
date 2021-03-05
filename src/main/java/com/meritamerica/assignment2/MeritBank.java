package com.meritamerica.assignment2;

import java.util.Arrays;


public class MeritBank {
	
	public static long accountNumber = 1;
	public static AccountHolder[] accountHolders = new AccountHolder[0];
	public static CDOffering[] cdOfferings = new CDOffering[0];
	public static CDOffering offering;
	
	public static void addAccountHolder(AccountHolder accountHolder) {
		AccountHolder[] temp = new AccountHolder[accountHolders.length + 1];
				for (int i = 0; i < accountHolders.length; i++) {
					temp[i] = accountHolders[i];
				}
		accountHolders = temp;		
		accountHolders[accountHolders.length - 1] = accountHolder;
	}
	
	public static AccountHolder[] getAccountHolders() {
		return accountHolders;
	}
	
	public static CDOffering[] getCDOfferings() {
		return cdOfferings;
	}


	public static CDOffering getBestCDOffering(double depositAmount) {
		if (cdOfferings != null) {
		double val = 0.0;
		int j = 0;
		for (int i = 0; i < cdOfferings.length; i++) {
			if((double)futureValue(depositAmount, cdOfferings[i].getInterestRate(), cdOfferings[i].getTerm()) > val) {
				val = (double)futureValue(depositAmount, cdOfferings[i].getInterestRate(), cdOfferings[i].getTerm());
				j = i;
				
			}
		
		}
//		CDOffering offering = new CDOffering(cdOfferings[j].getTerm(), cdOfferings[j].getInterestRate());
//		System.out.println("Got here");
//		return offering;
		return cdOfferings[j];
		}else return null;
	}

	public static CDOffering getSecondBestCDOffering(double depositAmount) {
		if (cdOfferings != null) {
		double val = 0.0;
		int j = 0;
		int k = 0;
		for (int i = 0; i < cdOfferings.length; i++) {
			if((double)futureValue(depositAmount, cdOfferings[i].getInterestRate(), cdOfferings[i].getTerm()) > val) {
				val = (double)futureValue(depositAmount, cdOfferings[i].getInterestRate(), cdOfferings[i].getTerm());
				j = i;
				k = j;
			}
		
		}
		
		return cdOfferings[k];
		}else return null;
	}
	
	public static void clearCDOfferings() {
//		for (int i = 0; i < cdOfferings.length; i++) {
//			cdOfferings[i] = null;	
//		}
		cdOfferings = null;
	}
	
	public static void setCDOfferings(CDOffering[] offerings) {
		
		cdOfferings = offerings;
	}
	
	public static long getNextAccountNumber() {
		return accountNumber++;
	}
	
	public static double totalBalances() {
		double total = 0.0;
		for (int i = 0; i < accountHolders.length; i++) {
			total += accountHolders[i].getCombinedBalance();
			
		}
		
		return total;
	}
	
	public static double futureValue(double presentValue, double interestRate, int term) {
		double futureValue = presentValue * Math.pow(1 + interestRate, term);
		return futureValue;
	}



}



