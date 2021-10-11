package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) throws RuntimeException {
        //Task implementation
//        boolean isNegative = false;
//        if (inputNumber < 0) {
//            isNegative = true;
//        }

        int input = inputNumber;
        long reversedNumber = 0;
        while (inputNumber != 0) {
            reversedNumber *= 10;
            reversedNumber += inputNumber % 10;
            inputNumber /= 10;
        }
        if (reversedNumber > Integer.MAX_VALUE) {
            throw new RuntimeException(input + " is greater than a maximum int value");
        } else if (reversedNumber < Integer.MIN_VALUE) {
            throw new RuntimeException(input    + " is smaller than a minimum int value");
        }
        return (int) reversedNumber;
    }
}
