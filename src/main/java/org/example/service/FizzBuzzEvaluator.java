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
        if (number % 21 == 0) return "FizzBuss";
        if (number % 3 == 0) return "Fizz";
        if (number % 7 == 0) return "Buss";
        return Integer.toString(number);
    }
}

