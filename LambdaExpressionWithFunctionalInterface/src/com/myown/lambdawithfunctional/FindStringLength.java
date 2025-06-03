package com.myown.lambdawithfunctional;

import com.myown.lambdawithfunctional.interfaces.StringLength;

public class FindStringLength {
	public static void main(String[] args) {
		StringLength stringLength = (s) -> System.out.println(s.length());
		stringLength.length("Hello, World!!!!");
	}
}
