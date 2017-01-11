package com.softserve.lv219.homework;
public class Exercise87_1 implements Executable  {

    @Override
    public void execute() {
        System.out.println("This program will calculate sum of the last 'm' digits of the 'n' number ");
        System.out.println("\nPlease, enter 'n' number");
        try {
            Integer n = Integer.parseInt(ScanerSingleton.getScanner().nextLine());
            System.out.println("\nPlease, enter 'm' number");
            Integer m = Integer.parseInt(ScanerSingleton.getScanner().nextLine());
            if((n<0)||(m<0)) throw new Exception();
            System.out.println("The sum of "+m+" last digits of the "+n+ " number"+" = "+countSum(n,m));

        } catch (NumberFormatException e) {
            System.out.println("Wrong Input Try again");
            execute();
        }
        catch (ArithmeticException im){
            System.out.println("Wrong Input, the 'n' number has less then 'm' digits. Try again\n");
            execute();
        }
        catch (Exception e) {
            System.out.println("Wrong Input, 'n' and/or 'm' can not be less then '0'. Try again");
            execute();
        }

    }

    public int countSum(int n, int m) {
        int sum = 0;
        char[] ar = ("" + n).toCharArray();
        if (ar.length < m) {
            throw  new ArithmeticException();
        }
        for (int i = 1; m + 1 > i; i++) {
            sum += Character.getNumericValue(ar[ar.length - i]);
        }
        return sum;


    }

}
