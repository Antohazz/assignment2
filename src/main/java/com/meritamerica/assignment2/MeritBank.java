package com.meritamerica.assignment2;

import java.util.Arrays;


public class MeritBank {
	
	public static long accountNumber = 1;
	public static AccountHolder[] accountHolders = new AccountHolder[1];
	public static CDOffering[] cdOfferings = new CDOffering[0];
	public static CDOffering offering;
	
	public static void addAccountHolder(AccountHolder accountHolder) {

		
		for (int i = 0; i < accountHolders.length; i++) {
			if (accountHolders[i] == null) {
				accountHolders[i] = accountHolder;
				
				//Extending Array if full
				if(i == accountHolders.length - 1) {
					AccountHolder[] temp = new AccountHolder[accountHolders.length * 2];
					for (int j = 0; j < accountHolders.length; j++) {
						temp[j] = accountHolders[j];
					}
					accountHolders = temp;		
				}
								
				break;
			}
		}

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
			if (accountHolders[i] != null)
			total += accountHolders[i].getCombinedBalance();
			else break;
		}
		
		return total;
	}
	
	public static double futureValue(double presentValue, double interestRate, int term) {
		double futureValue = presentValue * Math.pow(1 + interestRate, term);
		return futureValue;
	}



}



