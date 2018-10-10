package com.junit.assignment3;

import java.util.Random;

public class AccountDetails {
	
	int i=0;
	
	String acctNumber;
	
	String acctName;
	
	float amount;

	public AccountDetails(String acctNumber, String acctName, float amount) {
		super();
		this.acctNumber = acctNumber;
		this.acctName = acctName;
		this.amount = amount;
	}
	
	public String Deposit(float depositAmt) {
		i++;
		
		this.amount = this.amount + depositAmt;
		
		return "Amount successfully deposited!";
	}
	
	public String Withdraw(float withdrawAmount) {
		
		if(withdrawAmount > this.amount) {
			return "Error!";
		}
		else
		{
			i++;
			this.amount = this.amount - withdrawAmount;
			return "Remaining Balance: " + String.valueOf(this.amount);
		}
	}
	
	public String creditCard() {
		if(this.i>0)
		{
			Random rand = new Random();
			int  n = rand.nextInt(500000) + 1000;
			return String.valueOf(n);
		}
		return null;
	}
}
