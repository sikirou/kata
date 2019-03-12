package com.kata.fizzbuzz;

public class FizzBuzz {

    private static final String BUZZ_VALUE = "Buzz";
    private static final String FIZZ_VALUE = "Fizz";
    private static final int MODULO_NUNBER_ZERO = 0;
    private static final int DIVISER_NUMBER_THREE = 3;
    private static final int DIVISER_NUMBER_FIVE = 5;

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 0; i <= 100; i++) {
            System.out.println("Input value : " + i + " return value : " + fizzBuzz.evaluate(i));
        }
    }

    public String evaluate(int input) {
        String valueToReturn = "";
        if (isDivisibleBy(input, DIVISER_NUMBER_THREE)) {
            valueToReturn += FIZZ_VALUE;
        }
        if (isDivisibleBy(input, DIVISER_NUMBER_FIVE)) {
            valueToReturn += BUZZ_VALUE;
        }
        if (valueToReturn.isEmpty()) {
            valueToReturn = String.valueOf(input);
        }
        return valueToReturn;
    }

    /**
     * this the modulo operation
     *
     * @param number
     * @param diviser
     * @return true or false
     */
    private boolean isDivisibleBy(int number, int diviser) {
        return number % diviser == MODULO_NUNBER_ZERO;
    }
}
