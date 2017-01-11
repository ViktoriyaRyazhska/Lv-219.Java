/*
 * This software is the confidential and proprietary information 
 * of Softserve
 */

package com.softserve.lv219.homework;

/*
 * This class performs 88a task 
 * of the book
 * 
 * @version 1.0 January 2017
 * @author Roman Karpliak
 * 
 */

public class Exercise88a implements Executable {

    @Override
    public void execute() {
        int number = 6;  // set a value of the number 
        
        // print  information about number
        System.out.println(pow(number, 2) + " contai 3 " 
                + containsDigit(pow(number, 2), 3));
        
        number = 12;
        System.out.println(pow(number, 2) + " contains 3 "
                + containsDigit(pow(number, 2), 3));
    }
    
    
    /*
     * Check if the number contains
     * specified digit
     * @return true if number contains the specified digit
     */
    public boolean containsDigit(int number, final int digit) {
        while (number > 0) {
            if (number % 10 == digit) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }

    
    /*
     * Returns the value of the first argument raised to the power of the
     * second argument.
     * 
     * @param   number  the base
     * @param   power   the exponent
     */
    public int pow(int number, final int power) {

        for (int i = 1; i < power; i++) {
            number *= number;
        }
        return number;
    }

}
