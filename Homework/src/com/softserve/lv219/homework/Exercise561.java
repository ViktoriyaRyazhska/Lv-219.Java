package com.softserve.lv219.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class performs 561 task of the book
 * 
 * @author Yura Malyi
 * @version 1.0
 * @since January 2017
 */
public class Exercise561 implements Executable {

	@Override
	public void execute() {

		System.out.println("Enter number");
		int inputedValue=0;
		try {
			inputedValue = Integer.parseInt(ScanerSingleton.getScanner().nextLine());
		} catch (Exception e) {
				System.out.println("Only numbers are permitted");
				execute();
			}
			boolean guard = checkValue(inputedValue);
			if (guard) {
				List<Integer> finalArray = new ArrayList<>();
				finalArray = method(inputedValue, finalArray);
				for (Integer arrayRunner : finalArray) {
					System.out.println(arrayRunner);
				}
			} else {
				System.out.println("Only numbers greater than zero are permitted");
				execute();
			}
	}
/*
 * verifies allowability of value
 * @return true if value is greater than 0,
 * otherwise - false
 * */
	static boolean checkValue(int value) {
		if (value > 0) {
			return true;
		} else {
			return false;
		}
	}
/*
 * add to the ArrayList values which in square gives
 * similar digits
 * @return ArrayList what include proper numbers
 * */
	static List<Integer> method(int inputedValue, List<Integer> container) {
		
			for (int counter = 1; counter < inputedValue; inputedValue--) {
				if (inputedValue <= 100) {
					int ivSquare = inputedValue * inputedValue;
					if (ivSquare % 10 == inputedValue) {
						container.add(inputedValue);
					} else if (ivSquare % 100 == inputedValue) {
						container.add(inputedValue);
					}
				}
			}
		if(container.isEmpty()){
			container.add(0);
		}
		return container;
		}
	}

