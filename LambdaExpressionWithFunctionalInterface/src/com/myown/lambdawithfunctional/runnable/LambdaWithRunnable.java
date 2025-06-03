package com.myown.lambdawithfunctional.runnable;

public class LambdaWithRunnable {
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello from a lambda expression From Runnable!");
			}
		};

		Thread t = new Thread(r);
		t.start();
		for (int j = 0; j < 10; j++) {
			System.out.println("Hello from a lambda expression from Main!");
		}
	}
}
