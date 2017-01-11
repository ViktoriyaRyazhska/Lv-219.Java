package com.softserve.lv219.homework;


public class Exercise107 implements Executable {
	private static final int N = 4;
	@Override
	public void execute(){
		System.out.println("Enter your n - number.\n4^k < n.\nThis program will return - k.");
		try {
			int n = Integer.parseInt(ScanerSingleton.getScanner().nextLine());
			if(1 >= n) throw new Exception();
			System.out.println("k = "+findK(n));
		} catch (Exception e) {
			System.out.println("Your number have to be bigger than 1");
		}
		
	}

	public int findK(int n) {
		int k = 0;
		
		while(Math.pow(N, k) < n ) {
			k++;
		}
		return k-1;
	}
}
