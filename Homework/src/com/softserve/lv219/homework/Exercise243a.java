package com.softserve.lv219.homework;

import java.util.Scanner;

public class Exercise243a implements Executable{

	@Override
	public void execute() {
		int n;
		System.out.println("Enter your number");
		Scanner sc = ScanerSingleton.getScanner();
		n = sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if((i*i)+(j*j)==n)
				{
					System.out.println("X and y found" + " x="+i+" y="+j);
					return;
				}
			}
			
		}
		System.out.println("X and y not found");
		
		
		
		
		
	}

}
