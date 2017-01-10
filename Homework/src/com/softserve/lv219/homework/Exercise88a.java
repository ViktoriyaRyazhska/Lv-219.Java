package com.softserve.lv219.homework;

public class Exercise88a implements Executable {
	@Override
	public void execute()
	{
		int number=6;
		System.out.println(pow(number,2)+" contains 3 "+containsDigit(pow(number,2),3));
		number=12;
		System.out.println(pow(number,2)+" contains 3 "+containsDigit(pow(number,2),3));
	}
	
	
	private static boolean containsDigit(int number, int digit)
	{
		while(number>0)
		{
			if(number %10 ==digit)
				return true;
			number=number/10;
		}
		
		return false;
	}
	
	
	private static int pow(int number, int power)
	{
		
		
	    for(int i=1;i<power;i++)
	    {
	    	number*=number;
	    }
	    
	    return number;
	}

}
