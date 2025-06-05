package com.myown.prediacte;

import java.util.function.Predicate;

public class PredicateEx7 {
	/**
	 * 1.A predicate is a function with a single argument and returns boolean value.
	 * 2. Predicate interface present in Java.util.function package. 3.It’s a
	 * functional interface and it contains only one method i.e., test() 4. The
	 * test() method takes one argument and returns boolean value. 5. Predicate
	 * interface is used to evaluate a condition on the given argument.
	 * 
	 * 
	 * In Predicate interface, we can use the following default methods: negate()
	 * and(Predicate<? super T> other) or(Predicate<? super T> other)
	 * 
	 * 
	 **/
	
	public static void main(String[] args) {
	// Example of Predicate Interface w.r.t Name starts witk k
		String[] names={"Sunny","Kajal","Mallika","Katrina","Kareena"};
		
		Predicate<String> predicate = (s)-> s.charAt(0) == 'K' ;
		
		System.out.println("Names starting with K are:");
		for (String name : names) {
			if (predicate.test(name)) {
				System.out.println(name);
			}
		}
}
}