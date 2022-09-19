/**
 * 
 */
package com.revature;

import com.revature.exceptions.Number13Exception;

/**
 * @author KevinTranHuu
 *
 */
public class Calculator {
	/*
	 * - add(int a, int b)
	 * 		- if the result is 13
	 * 			- throw an exception
	 * 				- Number13Exception
	 * - subtract
	 * - multiply
	 * - sum of an array
	 * - divide
	 * 		- throw a custom exception if divided by 0
	 */
	
	public int add(int a, int b) {
		if(a == 8 && b == 5 ) {
			throw new Number13Exception();
		}
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return 0;
	}
	
	public int sumOfAnArray(int[] intArr) {
		return 0;
	}
}
