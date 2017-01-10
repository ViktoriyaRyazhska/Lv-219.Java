package com.softserve.lv219.homework;

import java.util.Scanner;

public class Exercise107 implements Executable {
	private static final int K = 4;
	private int result = 0;
	private int n = 0;
	@Override
	public void execute(){
		this.result = 0;
		Scanner sc = ScanerSingleton.getScanner();
		n = sc.nextInt();
		System.out.println(calcK(n));
		
	}

	private int calcK(int n)  {
		while (Math.pow(K, result) < n) {
			result++;
		}
		return result-1;
	}

}
