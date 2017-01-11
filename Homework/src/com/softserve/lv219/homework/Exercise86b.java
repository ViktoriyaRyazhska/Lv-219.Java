package com.softserve.lv219.homework;

public class Exercise86b implements Executable {

	/*
	 * This class performs 86b task of the book
	 * 
	 * @version 1.0 January 2017
	 * 
	 * @author Yurii Rozhak
	 * 
	 */
	@Override
	public void execute() {
		System.out.println("This program will calculate summ of all digits in your number");
		System.out.println("\nPlease, enter your number");
		try {
			Integer number = Integer.parseInt(ScanerSingleton.getScanner().nextLine());
			System.out.print("sum of digits = ");
			System.out.println(getSumOfDigits(number));
		} catch (NumberFormatException e) {
			System.out.println("Wrong Input Try again");
			execute();
		}

	}

	/*
	 * Calculate sum of all digits in number.
	 * 
	 * @return sum of digits in number.
	 */
	public int getSumOfDigits(int number) {
		int nuberExperimental = number;
		int sumOfDigits = 0;
		boolean end = false;
		while (!end) {
			sumOfDigits += nuberExperimental % 10;
			nuberExperimental /= 10;
			if (nuberExperimental == 0) {
				end = true;
			}
		}
		return sumOfDigits;

	}

}
