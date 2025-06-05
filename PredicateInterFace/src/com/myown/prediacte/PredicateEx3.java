package com.myown.prediacte;

import java.util.function.Predicate;

public class PredicateEx3 {
	/**
	 * 1.A predicate is a function with a single argument and returns boolean value.
	 * 2. Predicate interface present in Java.util.function package. 3.It’s a
	 * functional interface and it contains only one method i.e., test() 4. The
	 * test() method takes one argument and returns boolean value. 5. Predicate
	 * interface is used to evaluate a condition on the given argument.
	 * 
	 * 
	 * In Predicate interface, we can use the following static methods: Equals(T
	 * targetRef), isEqual(T targetRef)
	 * 
	 * 
	 **/

	public static void main(String[] args) {
//		ArrayList<Employee> list= new ArrayList<Employee>(); 
		Predicate<String> stringTest = Predicate.isEqual("Hello World!"); // static method")
		System.out.println(stringTest.test("Hello World!")); // true
		System.out.println(stringTest.test("Hello Worlds!")); // true

	}
}
