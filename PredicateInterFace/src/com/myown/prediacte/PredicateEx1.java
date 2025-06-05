package com.myown.prediacte;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateEx1 {
	public static void main(String[] args) {
		/**
		 * 1.A predicate is a function with a single argument and returns boolean value.
		 * 2. Predicate interface present in Java.util.function package. 3.It’s a
		 * functional interface and it contains only one method i.e., test() 4. The
		 * test() method takes one argument and returns boolean value. 5. Predicate
		 * interface is used to evaluate a condition on the given argument.
		 **/

		// Example of Predicate interface in Java #1 w.r.t Integer
		Predicate<Integer> predicate = (i) -> i > 10;
		System.out.println(predicate.test(15)); // true
		System.out.println(predicate.test(5)); // False

		// Example of Predicate interface in Java #2 w.r.t String
		Predicate<String> stringTest = (i) -> i.length() > 5;
		System.out.println(stringTest.test("asdfg")); // true
		System.out.println(stringTest.test("Rajveer")); // False

		// Example of Predicate interface in Java #2 w.r.t collection
		Predicate<Collection> collectionPredicate = (c) -> c.isEmpty();
		ArrayList<String> empty = new ArrayList<>();
		System.out.println(collectionPredicate.test(empty)); // true
		ArrayList<String> al = new ArrayList<>();
		al.add("Java");
		al.add("Python");
		System.out.println(collectionPredicate.test(al)); // false

	}
}
