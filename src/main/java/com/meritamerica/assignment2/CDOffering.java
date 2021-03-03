package com.meritamerica.assignment2;

public class CDOffering {
	
	private int term;
	private double interestRate;
	public CDOffering[] cdOfferingArray = new CDOffering[0];
		
	public CDOffering() {
		
	}
	
	public CDOffering(int term, double interestRate) {
			
		CDOffering[] tempArr = new CDOffering [cdOfferingArray.length + 1];
		
		for (int i = 0; i < cdOfferingArray.length; i++) {
			tempArr[i] = cdOfferingArray[i];
		}
		cdOfferingArray = tempArr;
		int j = cdOfferingArray.length - 1;
		
		cdOfferingArray[j].term = term;
		cdOfferingArray[j].interestRate = interestRate;
			
		
	}
	
	protected int getTerm() {
		return term;
	}
	
	
	protected double getInterestRate() {
		return interestRate;
	}
	

	
	
}

