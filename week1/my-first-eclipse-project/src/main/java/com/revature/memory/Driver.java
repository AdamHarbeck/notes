package com.revature.memory;

public class Driver {

	public int myNumber;
	
	public static void main(String[] args) {
		int x = 5;
		
		// by default, myNumber is assigned a value of 0;
		Driver d = new Driver();
		
		d.myNumber = 5;
		
//		d.method1(x);
		
//		x = d.method2(x);
		
		// Value of X?
//		System.out.println(x);
		d.method3(d);
		
		System.out.println(d.myNumber);
	}

	public void method1(int y) {
		y = y + 5;
	}
	
	public int method2(int x) {
		return x = x + 5;
	}
	
	public void method3(Driver d) {
		d.myNumber = d.myNumber + 5;
	}
}
