package com.junit.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArraySortTest {

	@Test
	public void arraySortingTest() {
		ArraySort arraySort = new ArraySort();
		Integer[] arr = {23,56,12,45,23,10,667,345,998,26,75};
		
		Integer[] res;
		
		res= arraySort.sortArray(arr, 'A');
		assertEquals(10, res[0].intValue());
		
		res= arraySort.sortArray(arr, 'd');
		assertEquals(998, res[0].intValue());
	}
}
