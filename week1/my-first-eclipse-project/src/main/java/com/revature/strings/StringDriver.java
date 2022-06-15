package com.revature.strings;

public class StringDriver {

	public static void main(String[] args) {
		String s = "Hello"; // literal
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		System.out.println("Is s==s1? " + (s == s1)); // true
		System.out.println("Is s==s2? " + (s == s2) ); // false
		System.out.println("Is s.equals(s2)? " + s.equals(s2)); // compares the value of the String and not the memory address
		
		s2.intern(); // memory address of "Hello" in the String pool
		
		s2 = s2.intern(); // assigning the mem address of "Hello" in SP to s2
		
		System.out.println("Is s==s2 after intern? " + (s == s2)); 
		
		System.out.println();
		
		/*
		 * Comparing objects in Java
		 * 		- == vs .equals()
		 * 			- == compares the value in the Stack, used for primitivces
		 * 				- reference value/memory address
		 * 		- .equals() (if implemented correctly) compares the value of objects as defined in the class
		 * 			- needs to be overriden based on the class' fields
		 */
		

		Object a = new Object();
		Object b = new Object();
		
		System.out.println("is a == b? " + (a == b));
		System.out.println("is a.equals(b)? " + a.equals(b)); // default implementation in object class is just "==", which is why we need to override in our classes
	
		/*
		 * String methods to look into
		 * 		- substring()
		 * 		- replace()
		 * 		- charAt()
		 */
		
		StringBuilder sb = new StringBuilder("Hello World!");
		
		sb.append("abc");
		
		sb.reverse();
		
		System.out.println(sb);
		
		String formerSb = sb.toString();
		
		StringBuffer sbuff = new StringBuffer();
		
	} 

}
