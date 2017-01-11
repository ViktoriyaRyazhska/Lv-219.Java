package com.softserve.lv219.homework;

import java.util.ArrayList;

/*
 * This class performs 88a task 
 * of the book
 * 
 * @version 1.0 January 2017
 * @author YuriiRozhak
 * 
 */
public class Exercise330 implements Executable {

	@Override
	public void execute() {
		System.out.println("This program will find all perfect numbers less than yours");
		System.out.println("\nPlease, enter your number");
		try {
			Integer number = Integer.parseInt(ScanerSingleton.getScanner().nextLine());
			ArrayList<Integer> perfectNumbers = getAllPerfectNumbers(number);
			if (perfectNumbers.isEmpty())
				System.out.println("No perfect Numbers less than " + number);
			else {
				System.out.println("Perfect numbers:");
				for (Integer integer : perfectNumbers) {
					System.out.println(" " + integer.intValue());
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("Wrong Input Try again");
			// e.printStackTrace();
			execute();
		}
	}

	/*
	 * 
	 * @return ArrayList of all perfect numbers less than argument
	 */
	public ArrayList<Integer> getAllPerfectNumbers(int number) {
		ArrayList<Integer> perfectNumbers = new ArrayList<>();
		if (number > 6)
			perfectNumbers.add(6);
		for (int i = 10; i < number; i += 9) {
			if (checkIfPerfect(i)) {
				perfectNumbers.add(i);
			}
		}
		return perfectNumbers;

	}

	/*
	 * Check if the number is perfect.
	 * 
	 * @return true if number is perfect and false if it's not.
	 */
	public boolean checkIfPerfect(int number) {

		if (number > 6 && number % 9 == 1) {
			if (getSummOfAllDivisors(number) == number) {
				return true;
			}
		} else if (number == 6) {
			return true;
		}
		return false;

	}

	/*
	 * gets all divisors and calculate their sum
	 * 
	 * @return sum of all divisors of number.
	 */
	public int getSummOfAllDivisors(int number) {
		int sum = 0;
		ArrayList<Integer> divisors = new ArrayList<>();
		for (int i = 1; i < number; i++) {
			if (number % i == 0)
				divisors.add(i);
		}
		for (Integer integer : divisors) {
			sum += integer;
		}
		return sum;
	}
}
