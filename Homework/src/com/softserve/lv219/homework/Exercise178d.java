package com.softserve.lv219.homework;

import java.util.Random;

public class Exercise178d implements Executable {
	
	@Override
	public void execute() {
		int [] mas = new int[99];
		int k = 0;
		int n, gn;
		mas[0] = 0;
		Random generator = new Random();
	
		n = generator.nextInt(10)+1;
	
		for(int i = 1; i < n; i++) {
			gn = generator.nextInt(5);
			mas[i] = mas[0] + gn;
		}
	
		for(int i = 1; i < n; i++) {
			if(mas[i] < (((mas[i-1]) + (mas[i+1]))/2)) {
				k++;
			}
		}
		System.out.println("Array of numbers:");
		for(int i = 0; i < n; i++)
			System.out.print(mas[i] + " ");
		System.out.println("\nAmount: " + k);
	}
}
