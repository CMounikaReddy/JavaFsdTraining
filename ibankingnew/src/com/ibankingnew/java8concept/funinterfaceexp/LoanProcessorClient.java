package com.ibankingnew.java8concept.funinterfaceexp;

public class LoanProcessorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loan loan = new GoldLoanImpl();
		loan.createloan();
		
		Loan loanlamb = () -> {
			
			//find Highest Loan Amount With CustName
			System.out.println("MC12345");
			return "MC12345";
		};
		
		loanlamb.createloan();
		
		Loan loanlamb1 = () -> {
			
			//find Highest Loan Amount With CustName And Gender
			System.out.println("CM12345");
			return "CM12345";
		};
		
		loanlamb1.createloan();
		
		
		LoanCalculatorImpl loanCalImpl = new LoanCalculatorImpl();
		
		loanCalImpl.findHighestLoanAmountWithCustName(loanlamb);
		
		loanCalImpl.findHighestLoanAmountWithCustNameAndGender(loanlamb1);
		
	}
	
	

}
