package com.javaStrings;

public class Example4 {

	public static void main(String[] args) {

		final int value = 400; 
		
		System.out.println(value);
		
		System.out.println("-----------------change the value--------------------");
		
		/**
		 * The final local variable value cannot be assigned. 
		 * It must be blank and not using a compound assignment
		 */
		//value = 500;
		
		System.out.println(value);
		
		
		

	}

}
