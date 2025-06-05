package com.myown.prediacte;

import java.util.function.Predicate;

public class PredicateEx2 {
	public static void main(String[] args) {
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
		// Example of Predicate Interface w.r.t joining two predicates using and() and
		// or() methods e.t.c
		
		int[] x = { 0, 5, 10, 15, 20, 25, 30 };
		Predicate<Integer> p1 = (i) -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;
		System.out.println("The Numbers Greater Than 10:");
		m1(p1, x);
		System.out.println("The Even Numbers Are:");
		m1(p2, x);
		System.out.println("The Numbers Not Greater Than 10:");
		m1(p1.negate(), x);
		System.out.println("The Numbers Greater Than 10 And Even Are:");
		m1(p1.and(p2), x);
		System.out.println("The Numbers Greater Than 10 OR Even:");
		m1(p1.or(p2), x);

	}

	public static void m1(Predicate<Integer> p, int[] x) {
		for (int x1 : x) {
			if (p.test(x1))
				System.out.println(x1);
		}
	}

}
