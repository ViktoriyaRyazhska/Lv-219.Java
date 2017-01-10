package com.softserve.lv219.homework;

import java.util.InputMismatchException;

public class Exercise108 implements Executable {
	@Override
	public void execute() {

		System.out.println("This program will find min value of 2^n which is bigger than inputed value");
		System.out.println("Enter number");

		try {
			int a = ScanerSingleton.getScanner().nextInt();
			if (a > 0) {
				double b = -9;
				double r = calcPower(a, b);
				System.out.println(Math.pow(2, r));
			} else
				System.out.println("Only numbers above zero are permitted");
		} catch (InputMismatchException e) {
			System.out.println("Only numbers are permitted, try again");
		}
	}

	double calcPower(int a, double b) {

		while (Math.pow(2, b) <= a) {
			b += 0.1;
		}
		return b;
	}
}
