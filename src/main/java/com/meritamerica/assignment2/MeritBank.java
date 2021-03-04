package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	
	private static long accountNumber = 0;
	private static AccountHolder[] accountHolders = new AccountHolder[0];
	private static CDOffering[] cdOfferings = new CDOffering[5];
	private static CDOffering offering;
	
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
		double val = 0.0;
		int j = 0;
		for (int i = 0; i < cdOfferings.length; i++) {
			if(futureValue(depositAmount, cdOfferings[i].getInterestRate(), cdOfferings[i].getTerm()) > val) {
				val = futureValue(depositAmount, cdOfferings[i].getInterestRate(), cdOfferings[i].getTerm());
				j = i;
			}
		
		}
		return cdOfferings[j];
	}

	public static CDOffering getSecondBestCDOffering(double depositAmount) {
		double val = 0.0;
		int j = 0;
		int k = 0;
		for (int i = 0; i < cdOfferings.length; i++) {
			if(futureValue(depositAmount, cdOfferings[i].getInterestRate(), cdOfferings[i].getTerm()) > val) {
				val = futureValue(depositAmount, cdOfferings[i].getInterestRate(), cdOfferings[i].getTerm());
				j = i;
				k = j;
			}
		
		}
		
		return cdOfferings[k];
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
		return accountNumber+1;
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



