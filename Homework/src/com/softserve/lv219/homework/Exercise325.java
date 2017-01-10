package com.softserve.lv219.homework;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Exercise325 implements Executable {
	
	@Override
	public void execute() {

		System.out.println("This method will find primal dividers of inputed number");
		System.out.println("Enter number");
		List<Integer> con = new ArrayList();

		try {
			int a = ScanerSingleton.getScanner().nextInt();
			if (a > 0) {

				for (int i = 2; i < a; i++) {
					if (a % i == 0) {
						System.out.println("This number haven't any primal dividers");
						break;
					} else {
						con.add(1);
						con.add(a);
						break;
					}
				}

			} else
				System.out.println("Only numbers above zero are permitted");

			for (Integer t : con)
				System.out.println(t);
		} catch (InputMismatchException e) {
			System.out.println("Only numbers are permitted");
		}

	}
}
