package com.softserve.lv219.homework;

import java.util.ArrayList;

public class Exercise324 implements Executable{

    @Override
    public void execute() {
        System.out.println("This program will display all dividers of 'q' number which are coprime with the 'p' number");
        System.out.println("\nPlease, enter 'q' number");
        int q=0,p=0;
        try {
            q = Integer.parseInt(ScanerSingleton.getScanner().nextLine());
            System.out.println("\nPlease, enter 'p' number");
            p = Integer.parseInt(ScanerSingleton.getScanner().nextLine());

        } catch (NumberFormatException e) {
            System.out.println("Wrong Input Try again");
            execute();
        }

        ArrayList<Integer> dividersQ = new ArrayList<>();
        ArrayList <Integer> rez = new ArrayList<>();
        for (int i=2; i<q;i++){
            if(q%i==0)
                dividersQ.add(i);
        }
        for (int i=0; i<dividersQ.size();i++){
            if(GCD_Evklid(p,dividersQ.get(i))==1){
                rez.add(dividersQ.get(i));
            }
        }

        // System.out.println("\n"+dividersQ);
        if(rez.isEmpty())
            System.out.println("There no 'q' divides which are coprime with the 'p' number");
        else
            System.out.println("\n rez: "+rez);


    }
    public static int GCD_Evklid (int a, int b){
        int tmp;
        while (b !=0) {
            tmp = a%b;
            a = b;
            b = tmp;
        }
        return  a;
    }


}

