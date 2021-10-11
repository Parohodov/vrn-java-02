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

        if (inputNumber > -10 && inputNumber < 10) {
            return inputNumber;
        }

        int input = inputNumber;
        long reversedNumber = 0;

        // Eating a number from the end
        while (input != 0) {
            reversedNumber *= 10;
            reversedNumber += input % 10;
            input /= 10;
        }

        if (reversedNumber > Integer.MAX_VALUE) {
            throw new RuntimeException(input + " is greater than a maximum int value");
        } else if (reversedNumber < Integer.MIN_VALUE) {
            throw new RuntimeException(input + " is smaller than a minimum int value");
        }
        return (int) reversedNumber;

//        boolean numIsNegative = false;
//        int number = inputNumber;
//        if (number < 0) {
//            number = Math.abs(number);
//            numIsNegative = true;
//        }
//
//        StringBuilder sb = new StringBuilder(String.valueOf(number)).reverse();
//        if (numIsNegative) {
//            sb.insert(0, "-");
//        }
//
//        return Integer.valueOf(sb.toString());

    }
}