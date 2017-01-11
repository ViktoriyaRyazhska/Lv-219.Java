package com.softserve.lv219.homework;


public class Exercise243a implements Executable{
	
	@Override
	public void execute() {
		System.out.println("Enter your number - n.\nThe program will find if we can present this number like n = x^2 + y^2");
		try {
			int n = Integer.parseInt(ScanerSingleton.getScanner().nextLine());
			if(1 >= n) throw new Exception();
			int arr[] = search(n);
			
			System.out.println(arr[0]+"^2 "+arr[1]+"^2");
		} catch (Exception e) {
			System.out.println("Your number have to be bigger than 0");
		}
		
	}
	
	public int [] search(int n){
		int arr[] = new int [2];
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if((i*i)+(j*j)==n)
				{
					arr[0] = i;
					arr[1] = j;
					break;
				}
			}
			
		}
		return arr;
	}

}
