package com.eduardo_arellano;
/*
 * Instructions:
 * Write a function that prints the numbers from 1 to 100.
 * However, for multiples of three print "Fizz" instead of the number and
 * for the multiples of five print "Buzz".
 * For numbers which are multiples of both three and five print "FizzBuzz".
 */

public class FizzBuzz {

    /**
     * Determines the appropriate FizzBuzz representation for a given number.
     *
     * @param number The number to evaluate.
     * @return "FizzBuzz" if the number is divisible by both 3 and 5,
     *         "Fizz" if divisible by 3,
     *         "Buzz" if divisible by 5,
     *         or the string representation of the number.
     */
    public String getFizzBuzzValue(int number) {
        if (number % 15 == 0) return "FizzBuzz"; // 15 is divisible by both 3 and 5
        if (number % 5 == 0) return "Buzz";
        if (number % 3 == 0) return "Fizz";
        // returns the string representation of the number
        return String.valueOf(number);
    }
    /**
     * Prints numbers from 1 to 100 with FizzBuzz substitutions.
     */
    public void printFizzBuzzSequence() {
        for (int currentNumber = 1; currentNumber <= 100; currentNumber++) {
            String fizzBuzzValue = getFizzBuzzValue(currentNumber);
            System.out.println(fizzBuzzValue);
        }
    }

    // Main method, to execute FizzBuzz.
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printFizzBuzzSequence();
    }
}



