package com.softserve.lv219.homework;

public class Exercise178e implements Executable {
	
	@Override
	public void execute() {
		
		int amount = 0;
	
		System.out.println("\nEnter number of members for sequence:");
		int [] array = new int[Integer.parseInt(ScanerSingleton.getScanner().nextLine())];
	
		array[0] = 0;
			
		System.out.println("\nEnter " + (array.length - 1) + " members for sequence:");
		for(int i = 1; i < array.length; i++) {
			System.out.print("Index ¹ " + i + ": ");
			array[i] = Integer.parseInt(ScanerSingleton.getScanner().nextLine());
		}
	
		for(int i = 1; i < array.length; i++) {
			if(array[i] < toPower(2, array.length) || array[i] < mul(array.length - 1, array.length)) {
				amount++;
			}
		}
		
		System.out.println("Sequence of numbers:");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\nAmount: " + amount);
	}
	
	public static double toPower(int a, int b) {
		return Math.pow(a, b);		
	}
	
	public static int mul(int a, int b) {
		return (a * b);		
	}
	
}
