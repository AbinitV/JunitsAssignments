package com.junit.assignment1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class WordCountTest {
	
	WordCount wordCount = null;
	@Before
	public void setUp() {
		wordCount = new WordCount();
	}
	@Test
	public void wordTest1(){
		int count = wordCount.countWords("I am Abinit!!");
		assertEquals(3,count);
		
		count = wordCount.countWords("   ");
		assertEquals(0,count);
		
		boolean exc = false;
		try {
			count = wordCount.countWords(null);
		}
		catch(NullPointerException e) {
			exc = true;
		}
		assertTrue(exc);
	}

}
