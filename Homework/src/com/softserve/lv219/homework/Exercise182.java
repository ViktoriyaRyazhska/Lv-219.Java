package com.softserve.lv219.homework;

import java.util.ArrayList;
import java.util.List;

public class Exercise182 implements Executable
{
    @Override
    public void execute()
    {
        int numberOfIntegers = 0;
        int sum = 0;
        int quantity = 0;
        List<Integer> listOfIntegers = new ArrayList<>();

        System.out.println("Enter your natural number please.");
        numberOfIntegers = Integer.parseInt(ScanerSingleton.getScanner().nextLine());

        for (int i = 0; i < numberOfIntegers; i++)
        {
            System.out.println("Enter your integer #"+(i+1)+"");
            listOfIntegers.add(Integer.parseInt(ScanerSingleton.getScanner().nextLine()));
        }
        for (int i = 0; i < listOfIntegers.size(); i++)
        {
            if (listOfIntegers.get(i) % 5 == 0 && listOfIntegers.get(i) % 7 != 0)
            {
                quantity++;
                sum += listOfIntegers.get(i);
            }
        }
        System.out.println("Quantity = "+quantity+"");
        System.out.println("Sum = "+sum+"");
    }
}
