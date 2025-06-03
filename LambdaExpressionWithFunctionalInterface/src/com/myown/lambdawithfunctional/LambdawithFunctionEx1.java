package com.myown.lambdawithfunctional;

import com.myown.lambdawithfunctional.interfaces.FunctionalInterfaceEX1;

public class LambdawithFunctionEx1 {

	public static void main(String[] args) {
		// Using a lambda expression to implement the functional interface
		FunctionalInterfaceEX1 functionalInterface = () -> System.out.println("Hello");

		// Calling the method of the functional interface
		functionalInterface.doSomething();
	}
}
