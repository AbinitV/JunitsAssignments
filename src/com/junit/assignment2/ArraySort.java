package com.junit.assignment2;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {
	
	public  Integer[] sortArray(Integer[] arr, char ch) {
			if(ch == 'A' || ch == 'a')
			{
				Arrays.sort(arr);
			}
			else {
				Comparator<Integer> c = (a, b) -> b-a;
				Arrays.sort(arr, c);
			}
			return arr;
		}
	}
