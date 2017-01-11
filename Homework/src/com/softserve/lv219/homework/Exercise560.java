package com.softserve.lv219.homework;

import java.util.ArrayList;

public class Exercise560 implements Executable {
    public int div(int number){
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += (number % i) == 0 ? i : 0;
        }
        return sum;
    }
    @Override
    public void execute() {
        System.out.println("This program will display all pairs of amicable numbers in diapason from 200 to 300 ");
        int a=200;
        int b=300;
        int[] array = new int[b];
        ArrayList<Integer> rez=new ArrayList<>();
        for (int i = a; i < b; i++){
            int div = div(i);
            if (div < b && array[div] == i){
                rez.add(div);
                rez.add(i);
            }
            array[i] = div;
        }
        System.out.println("Result: ");
        for(int i=0;i<rez.size();i++){
            System.out.println(rez.get(i)+" and "+rez.get(i+1) );
            i++;
        }
    }
}

