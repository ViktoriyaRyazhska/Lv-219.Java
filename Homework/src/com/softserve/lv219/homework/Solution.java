package com.softserve.lv219.homework;
import java.util.Map;
import java.util.Scanner;



public class Solution {

	public static void main(String[] args) {
		Menu<Executable> menu = new Menu<>();
		menu.mainMenu();
		Map<String, Executable> mainMenu = menu.getMenu();
		Scanner sc = ScanerSingleton.getScanner();

		String choice = null;
		while (true) {
			try {
				System.out.print("\n\tAvailable choices:\n[ ");

				for (String string : mainMenu.keySet()) {
					System.out.print(string + " ");
				}
				System.out.println("]\n");
				choice = sc.nextLine().toLowerCase();
				mainMenu.get(choice).execute();

			} catch (Exception e) {

				System.out.println("Wrong input, try again");
			}
		}
	}

}