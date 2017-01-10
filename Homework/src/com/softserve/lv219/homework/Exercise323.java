package com.softserve.lv219.homework;

public class Exercise323 implements Executable {

	@Override
	public void execute(){
		System.out.println("Enter n:");
		printRelativlyPrimes(ScanerSingleton.getScanner().nextInt());
	}
	public void printRelativlyPrimes(int n){
		for(int i=1;i<n;++i){
			if(BCD(n,i)==1){
				System.out.println(i);
			}
		}
	}
	public int BCD(int a,int b){
		return (b==0) ? a: BCD(b,a%b);
	}
	
}
