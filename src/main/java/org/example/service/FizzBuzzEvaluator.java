package org.example.service;

import org.example.evaluation.IEvaluator;

public class FizzBuzzEvaluator implements IEvaluator {
    // Singleton instance
    private static FizzBuzzEvaluator instance;

    // Private constructor
    private FizzBuzzEvaluator() {}

    // Public method to get the single instance
    public static FizzBuzzEvaluator getInstance() {
        if (instance == null) {
            instance = new FizzBuzzEvaluator();
        }
        return instance;
    }

    // Interface method implementation
    @Override
    public String evaluate(int number) {
        if (number % 15 == 0) return "FizzBuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        return Integer.toString(number);
    }
}

