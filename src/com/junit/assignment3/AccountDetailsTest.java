package com.junit.assignment3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AccountDetailsTest {
	
	
	@Test
	public void depositTest() {
		AccountDetails acct = new AccountDetails("1234", "Abinit", 5000L);
		String response = acct.Deposit(1000);
		
		assertEquals("Amount successfully deposited!", response);
		assertTrue(acct.amount == 6000L);
	}
	
	@Test
	public void withDrawTest() {
		AccountDetails acct = new AccountDetails("1234", "Abinit", 5000L);
		String response = acct.Withdraw(2000);
		
		assertEquals("Remaining Balance: 3000.0", response);
		assertTrue(acct.amount == 3000L);
	}
	
	@Test
	public void creditCardTest() {
		AccountDetails acct = new AccountDetails("1234", "Abinit", 5000L);
		String response = acct.creditCard();
		
		assertEquals(null, response);
		
		acct.Withdraw(2000);
		response = acct.creditCard();
		System.out.println(response);
		assertEquals(6,response.length());
		
		
		
	}

}
