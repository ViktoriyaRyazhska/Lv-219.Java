package com.softserve.lv219.homework;

import java.util.Scanner;




public class ScanerSingleton {
	
	private static Scanner instance = null;
	
	private ScanerSingleton(){
		
	}
	
	public static Scanner getScanner() {
		
		if(instance ==null){
			instance = new Scanner(System.in);
		}
		
		return instance;
	}
}
