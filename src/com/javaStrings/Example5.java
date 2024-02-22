package com.javaStrings;

public class Example5 {

	public static void main(String[] args) {
		
		String name = "Hello";

		System.out.println("==========immutable strings==========");
		System.out.println(name);
		
		name.concat(" World...!");
		
		System.out.println(name);
		
		System.out.println("==========mutable strings==========");
		
		StringBuffer buffer = new StringBuffer("Hello");
		
		System.out.println(buffer);
		
		buffer.append(" World..!");//new value added to existing string.
		
		System.out.println(buffer);

	}

}
