package com.junit.assignment5;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BookTest {

	private double price;
	private double discount;
	private double expectedResult;
	private Book book;
	
	public BookTest(double price, double discount, double expectedResult) {
		super();
		this.price = price;
		this.discount = discount;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void setUp() {
		book = new Book();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Double[][] {{100d,50d,50d},{80d,20d,64d}});
		
	}
	
	@Test
	public void BookTest() {
		assertEquals(expectedResult, book.discountedPrice(price, discount),0.2);
	}
}
