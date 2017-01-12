package com.softserve.lv219.homework;

import java.util.ArrayList;
import java.util.List;

public class Exercise182 implements Executable
{
	private List<Integer> listOfIntegers = new ArrayList<>();
	public List<Integer> suitableNumbers = new ArrayList<>();
	private int numberOfIntegers = 0;
    private int sum = 0;
    private int quantity = 0;
	
    @Override
    public void execute()
    {
        System.out.println("Enter your natural number please.");
        numberOfIntegers = Integer.parseInt(ScanerSingleton.getScanner().nextLine());

        for (int i = 0; i < numberOfIntegers; i++)
        {
            System.out.println("Enter your integer #" + (i + 1)+ "");
            listOfIntegers.add(Integer.parseInt(ScanerSingleton.getScanner().nextLine()));
        }
        quantity = quantity(listOfIntegers);
        sum = sum(suitableNumbers);
        
        System.out.println("Quantity = "+ quantity+ "");
        System.out.println("Sum = "+ sum+ "");
    }
    
    public int quantity(List<Integer> listOfIntegers) {
    	
    	int quantity = 0;
    	for (int i = 0; i < listOfIntegers.size(); i++)
        {
            if (listOfIntegers.get(i) % 5 == 0 && listOfIntegers.get(i) % 7 != 0)
            {
                quantity++;
                suitableNumbers.add(listOfIntegers.get(i));
            }
        }
    	return quantity;
    }
    
    public int sum(List<Integer> listOfIntegers) {
    	int sum = 0;
    	for (int i : listOfIntegers) {
    		sum += i;
    	}
    	return sum;
    }
}
