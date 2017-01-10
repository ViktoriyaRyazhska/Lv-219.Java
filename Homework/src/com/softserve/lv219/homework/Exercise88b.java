package com.softserve.lv219.homework;

public class Exercise88b  implements Executable{

	
	private static int reverse(int number)
	{
		int reverseNumber=0;
		while(number >0)
		{
			reverseNumber= reverseNumber*10 +number %10;
			number=number/10;
		}
		
		return reverseNumber;
	}
	
	@Override
	public void execute() {
		
		int number=123;
		System.out.println("Reverse to");
		System.out.println("Reverse to "+number +" is "+reverse(number));
	}
	
	

	

}
