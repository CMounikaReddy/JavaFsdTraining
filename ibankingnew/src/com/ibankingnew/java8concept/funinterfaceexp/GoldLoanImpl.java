package com.ibankingnew.java8concept.funinterfaceexp;

import java.util.Random;

public class GoldLoanImpl implements Loan{

	@Override
	public String createloan() {
		
		Random rd = new Random();
		int loanid = rd.nextInt();
		System.out.println("LoanId is...." +loanid);
		return String.valueOf(loanid);
	}

}
