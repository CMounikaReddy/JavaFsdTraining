package com.ibankingnew.java8concept.funinterfaceexp;

@FunctionalInterface
public interface Loan {
	String createloan();
	
	default int generateLoanId() {
		int loanid=06;
		System.out.println("Myloanisdone");
		return loanid;
	}

}
