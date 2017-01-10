package com.softserve.lv219.homework;

public class Exercise322 implements Executable {
	
	
	private static void findNumber()
	{
		int maxElement=1;
		long maxSum=0;
		long sum=0;
		for(int number=1; number<=10_000;number++)
		{	
			for(int j=1;j<=number/2;j++)
			{
				if(number %j==0)
				{
					sum+=j;
				}
			}
			
			if(sum> maxSum)
			{
				maxSum=sum;
				maxElement=number;
			}
			
			sum=0;
		}
		
		System.out.println("Number Is "+maxElement +" maxSum="+maxSum);
	}
	
	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		findNumber();

	}

	
	
}
