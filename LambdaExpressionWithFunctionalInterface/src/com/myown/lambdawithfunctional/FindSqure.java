package com.myown.lambdawithfunctional;

import com.myown.lambdawithfunctional.interfaces.Squre;

public class FindSqure {

	public static void main(String[] args) {
		Squre squre = (n) -> System.out.println("The square root of " + n + " is: " + n * n);
		squre.getSqure(5);
	}
}
