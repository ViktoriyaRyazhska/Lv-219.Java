package com.softserve.lv219.homework;

public class Exercise86a implements Executable {

	/*
	 * This class performs 86a task of the book
	 * 
	 * @version 1.0 January 2017
	 * 
	 * @author Yurii Rozhak
	 * 
	 */
	@Override
	public void execute() {
		System.out.println("This program will calculate number of digits in your number");
		System.out.println("\nPlease, enter your number");
		try {
			Integer number = Integer.parseInt(ScanerSingleton.getScanner().nextLine());
			System.out.print("Number of digits = ");
			System.out.println(getNumbersCount(number));
		} catch (NumberFormatException e) {
			System.out.println("Wrong Input Try again");
			execute();
		}

	}

	/*
	 * Calculate digits in number.
	 * 
	 * @return amount of digits in number.
	 */
	public int getNumbersCount(int number) {
		int nuberExperimental = number;
		int numberOfDigits = 0;
		boolean end = false;
		while (!end) {
			numberOfDigits++;
			nuberExperimental /= 10;
			if (nuberExperimental == 0) {
				end = true;
			}
		}
		return numberOfDigits;

	}

}
