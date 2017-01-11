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

public class Exercise88b implements Executable {

    @Override
    
    public void execute() {

        int number = 123; // set a value of the number
        
        // print  information about number
        System.out.println("Reverse to " + number 
                + " is " + reverse(number));
    }

    
    /*
     * Returns the number in reverse order
     * 
     * @return the reversed number
     */
    private int reverse(int number) {

        int reverseNumber = 0;
        while (number > 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number = number / 10;
        }
        return reverseNumber;
    }

}
