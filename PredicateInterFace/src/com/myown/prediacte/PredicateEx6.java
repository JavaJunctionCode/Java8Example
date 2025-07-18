package com.myown.prediacte;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx6 {
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
		ArrayList<Employee> list = new ArrayList<Employee>();
		populate(list);
		Predicate<Employee> p1 = emp -> emp.designation.equals("Manager");
		System.out.println("Managers Information:");
		display(p1, list);
		Predicate<Employee> p2 = emp -> emp.city.equals("Bangalore");
		System.out.println("Bangalore Employees Information:");
		display(p2, list);
		Predicate<Employee> p3 = emp -> emp.salary < 20000;
		System.out.println("Employees whose slaray <20000 To Give Increment:");
		display(p3, list);
		System.out.println("All Managers from Bangalore city for Pink Slip:");
		display(p1.and(p2), list);
		System.out.println("Employees Information who are either Managers or salary <20000");
		display(p1.or(p3), list);
		System.out.println("All Employees Information who are not managers:");
		display(p1.negate(), list);
		
		
		Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Rajveer", "CEO", 30000, "Hyderabad"));
		Employee e1 = new Employee("Rajveer", "CEO", 30000, "Hyderabad");
		Employee e2 = new Employee("Sunny", "Manager", 20000, "Hyderabad");
		System.out.println("Is Equal " + isCEO.test(e1));// true
		System.out.println(isCEO.test(e2));// false
	}

	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Rajveer", "CEO", 30000, "Hyderabad"));
		list.add(new Employee("Sunny", "Manager", 20000, "Hyderabad"));
		list.add(new Employee("Mallika", "Manager", 20000, "Bangalore"));
		list.add(new Employee("Kareena", "Lead", 15000, "Hyderabad"));
		list.add(new Employee("Katrina", "Lead", 15000, "Bangalore"));
		list.add(new Employee("Anushka", "Developer", 10000, "Hyderabad"));
		list.add(new Employee("Kanushka", "Developer", 10000, "Hyderabad"));
		list.add(new Employee("Sowmya", "Developer", 10000, "Bangalore"));
		list.add(new Employee("Ramya", "Developer", 10000, "Bangalore"));
	}

	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for (Employee e : list) {
			if (p.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("**************************************************");
	}
}