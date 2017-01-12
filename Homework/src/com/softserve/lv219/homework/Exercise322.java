package com.softserve.lv219.homework;

public class Exercise322 implements Executable {
	
	
	public int findMaxIndex(int range)
	{
		int maxElement=1;
		long maxSum=0;
		long sum=0;
		for(int number=1; number<=range;number++)
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
		
		return maxElement;
	}
	
	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	    System.out.println("16:"+ findMaxIndex(16));
	    System.out.println("20:"+findMaxIndex(20));

	}

	
	
}
