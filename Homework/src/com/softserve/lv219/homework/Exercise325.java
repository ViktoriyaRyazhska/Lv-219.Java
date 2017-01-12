package com.softserve.lv219.homework;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * This class performs 325 task of the book
 * 
 * @author Yura Malyi
 * @version 1.0
 * @since January 2017
 */
public class Exercise325 implements Executable {

	public void execute() {

		System.out.println("This programme will find primal dividers of inputed number");
		System.out.println("Enter number");

		List<Integer> primalDividersArray = new ArrayList();
		int inputedValue = 0;
		try {
			inputedValue = Integer.parseInt(ScanerSingleton.getScanner().nextLine());
		} catch (Exception e) {
			System.out.println("Only numbers are permitted");
			execute();
		}
		boolean guard = check(inputedValue);
		if (guard) {
			defineValues(inputedValue, primalDividersArray);
		} else {
			System.out.println("Only numbers greate than zero are permitted");
			execute();
		}

		for (Integer arrayRunner : primalDividersArray) {
			System.out.println(arrayRunner);
		}
	}

	/*
	 * verifies allowability of value
	 * 
	 * @return true if value is greater than 0, otherwise - false
	 */
	public static boolean check(int value) {
		if (value > 0) {
			return true;
		}
		return false;
	}

	/*
	 * difines primal dividers of inputed value
	 * 
	 * @return List<Integer> with primal dividers
	 */
	public static List<Integer> defineValues(int value, List<Integer> container) {

		for (int counter = 2; counter < value; counter++) {
			if (value % counter == 0) {
				message();
				break;
			} else {
				container.add(1);
				container.add(value);
				break;
			}
		}
		return container;
	}

	static void message() {
		System.out.println("This number haven't any primal dividers");
	}

}
