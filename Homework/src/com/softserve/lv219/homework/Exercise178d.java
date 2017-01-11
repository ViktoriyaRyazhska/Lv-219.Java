/**
 * com.softserve.lv219.homework is a group of classes for exercises solving.
 */
package com.softserve.lv219.homework;

/**
 * @author Nazar.
 */

public class Exercise178d implements Executable {

	@Override
	public void execute() {
		
		int amount = 0;

		System.out.println("\nEnter number of members for sequence:");
		int[] array = new int[Integer.parseInt(ScanerSingleton.getScanner().nextLine())];

		array[0] = 0;

		System.out.println("\nEnter " + (array.length - 1) + " members for sequence:");

		for (int i = 1; i < array.length; i++) {			
			System.out.print("Index ¹ " + i + ": ");
			array[i] = Integer.parseInt(ScanerSingleton.getScanner().nextLine());			
		}

		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] < calc(array[i - 1], array[i + 1])) {
				amount++;
			}
		}
		
		System.out.println("Sequence of numbers:");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\nAmount: " + amount);
	}
	
	public static int calc(int a, int b) {
		return ((a + b) / 2);
	}
	
}
