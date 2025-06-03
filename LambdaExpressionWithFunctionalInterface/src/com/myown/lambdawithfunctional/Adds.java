package com.myown.lambdawithfunctional;

import com.myown.lambdawithfunctional.interfaces.Add;

public class Adds {

	public static void main(String[] args) {
		// Using a lambda expression to implement the Add interface
		Add addOperation = (a, b) -> System.out.println("Sum: " + (a + b));

		// Calling the add method with two integers
		addOperation.add(5, 10);
		addOperation.add(125, 10);
		addOperation.add(123455, 10);
	}
}
