package com.softserve.lv219.homework;


public class Exercise560_b implements Executable{
    @Override
    public void execute() {
        int leftBorder = 200;
        int rightBorder = 300;

        for (int firstNumber = leftBorder; firstNumber <= rightBorder; firstNumber++) {
            int sumOfDividorsOfFirstNumber = 0;
            for (int dividor = 1; dividor < firstNumber; dividor++) {
                if (firstNumber % dividor == 0) {
                    sumOfDividorsOfFirstNumber += dividor;
                }
            }
            int secondNumber = sumOfDividorsOfFirstNumber;
            int sumOfDividorsOfSecondNumber = 0;
            for (int dividor = 1; dividor < sumOfDividorsOfFirstNumber; dividor++) {
                if (sumOfDividorsOfFirstNumber % dividor == 0) {
                    sumOfDividorsOfSecondNumber += dividor;
                }
            }

            if ((firstNumber == sumOfDividorsOfSecondNumber) &&
                    (firstNumber != secondNumber) && (firstNumber < secondNumber))
                System.out.println(firstNumber + " " + secondNumber);
        }
    }
}
