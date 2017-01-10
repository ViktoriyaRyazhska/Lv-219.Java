package com.softserve.lv219.homework;
import java.util.*;
public class Exercise559 {

	public void execute(){
		int n=ScanerSingleton.getScanner().nextInt();
		printMersieneNumbers(n);
	}
	void printMersieneNumbers(int n){
		List<Integer> simples=new ArrayList<Integer>();
		for(int i=1;i<n;++i){
			if(isSimple(i)){
				simples.add(i);
			}
		}
		for(int x : simples){
			int k=(int)Math.pow(2, x)-1;
			if(k>n){
				return;
			}
			if(isSimple(k)){
				System.out.println(k);
			}
		}
	}
	boolean isSimple(int n){
		for(int i=2;i<n/2;++i){
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
