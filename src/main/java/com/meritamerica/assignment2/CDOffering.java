package com.meritamerica.assignment2;

public class CDOffering {
	
	private int term;
	private double interestRate;
	public CDOffering[] cdOfferingArray = new CDOffering[5];
		
	
	public CDOffering(int term, double interestRate) {
		
		int i = cdOfferingArray.length - 1;
		
		cdOfferingArray[i].term = term;
		cdOfferingArray[i].interestRate = interestRate;
			
		
	}
	
	protected int getTerm() {
		return term;
	}
	
	
	protected double getInterestRate() {
		return interestRate;
	}
	

	
	
}

