package com.softserve.lv219.homework;

import java.util.ArrayList;
import java.util.List;

public class Exercise323_b implements Executable {

    @Override
    public void execute()
    {
        int naturalNumber = 0;
        List<Integer> allMutuallyPrimeNumbers = new ArrayList<>();
        System.out.println("Enter your natural number please");
        naturalNumber = Integer.parseInt(ScanerSingleton.getScanner().nextLine());
        List<Integer> allDividers = new ArrayList<Integer>();

        for (int i = 1; i <= naturalNumber / 2; i++)
        {
            if (naturalNumber % i == 0)
                allDividers.add(i);
        }

        if (allDividers.size() == 1) {
            System.out.println("All mutually prime numbers: ");
            for (int i = 2; i < naturalNumber; i++) {
                System.out.print(i + " ");
            }
            return;
        }

        for (int i = 2; i < naturalNumber; i++)
        {
            for (int j = 0; j < allDividers.size(); j++)
            {
                if (i % allDividers.get(j) == 0)
                    break;
                else if (j == allDividers.size() - 1)
                    allMutuallyPrimeNumbers.add(i);
            }
        }

        System.out.println("All mutually prime numbers: ");
        for (int i : allMutuallyPrimeNumbers)
        {
            System.out.print(i + " ");
        }
    }
}
