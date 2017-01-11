package com.softserve.lv219.homework;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Exercise561 implements Executable {

	@Override
	public void execute() {
		List<Integer> con = new ArrayList<>();
		System.out.println("Enter number");
		try {
			int a = ScanerSingleton.getScanner().nextInt();
			if (a > 0) {
				for (int i = 1; i < a; a--) {
					if (a < 100) {
						int b = a * a;
						if (b % 10 == a)
							con.add(a);
						else if (b % 100 == a)
							con.add(a);
					}
				}
				for (Integer t : con)
					System.out.println(t);
			} else
				System.out.println("Only numbers above zero are permitted");
		} catch (InputMismatchException e) {
			System.out.println("Only numbers are permitted");
		}
	}
}
