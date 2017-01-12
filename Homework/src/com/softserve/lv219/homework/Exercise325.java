package com.softserve.lv219.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class performs 325 task of the book
 * @author Yura Malyi
 * @version 1.0
 * @since January 2017
 */
public class Exercise325 implements Executable {

	@Override
	public void execute() {

		int inputedValue = 0;
		List<Integer> dividersContainer;
		System.out.print("Enter a positive number: ");
		
		try {
			inputedValue = Integer.parseInt((ScanerSingleton.getScanner().nextLine()));
		} catch (Exception e) {
			System.out.println("Only numbers are permitted");
			execute();
		}
		if (inputedValue > 0) {
			dividersContainer = new ArrayList<>();
			primalArray(inputedValue, dividersContainer);
			for (Integer arrayRunner : dividersContainer) {
				System.out.println(arrayRunner);
			}
		} else {
			System.out.println("Only numbers above zero are permitted");
			execute();
		}
	}

	public static List<Integer> primalArray(int value, List<Integer> con) {
		int count;
		for (int i = 2; i <= value; i++) {
			count = 0;
			while (value % i == 0) {
				value /= i;
				count++;
			}
			if (count == 0)
				continue;
			con.add(i);
		}
		return con;
	}
}