package com.javaStrings.Tasks;

public class Example1 {

	public static void main(String[] args) {
		
		/**
		 * 	Write a java program to print the length of the given string.
		 * 	Note: we should not use any predefined methods to get the String length.
		 */
		
		String str = "Welcome to Strings";
		
		char values[] = str.toCharArray();
		
		//System.out.println(str.length());
		
		int strLength = 0;
		
		for(char value: values)
		{
			strLength++;
		}

		System.out.println(strLength);
		
	}

}
