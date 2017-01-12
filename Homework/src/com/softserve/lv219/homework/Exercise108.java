
package com.softserve.lv219.homework;


import java.util.InputMismatchException;
/**
 * This class performs 108 task of the book
 * 
 * @author Yura Malyi
 *@version 1.0
 *@since January 2017
 */
public class Exercise108 implements Executable {
	
	@Override
	public void execute() {

		System.out.println("This programme will find min value of 2^n which is bigger than inputed value");
		System.out.println("Enter number");
		
		int inputedValue=0;
		
		try {
			inputedValue =Integer.parseInt( ScanerSingleton.getScanner().nextLine());
		} catch (Exception e) {
			System.out.println("Only numbers are permitted, try again");
			execute();
		}
			if (guard(inputedValue)) {
				double defaultPower = -9;
				double finalPower = calcPower(inputedValue, defaultPower);
				System.out.println(Math.pow(2, finalPower));
			} else {
				System.out.println("Only numbers above zero are permitted");
				execute();
			}
		
	}
	
	 /*
	  *  verifies allowability of value
      *  @return true if value is greater than 0,
      *  otherwise - false
      *  */
	public static boolean guard(int value){
		if(value>0) {
		return true;
		}
		return false;
	}
	
/*
 * 
 @return min power in which 2 is greater than inputedValue
 */
	public double calcPower(int inputedValue, double powerCounter) {

		while (Math.pow(2, powerCounter) <= inputedValue) {
			powerCounter += 0.1;
		}
		return powerCounter;
	}
}
