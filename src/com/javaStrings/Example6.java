package com.javaStrings;

public class Example6 {

	public static void main(String[] args) {
		
		//1. using 'new' keyword
		String object1 = new String("Hello");
		String object2 = new String("Hello");
		String object3 = new String("Hi");
		
		System.out.println(object1 == object2);
		System.out.println(object1 == object3);
		
		//2. literal way
		
		String object4 = "Hello";
		String object5 = "Hello";
		String object6 = "Hi";
		
		System.out.println(object4 == object5);
		System.out.println(object4 == object6);
		

	}

}
