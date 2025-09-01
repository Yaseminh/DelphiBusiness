package org.example.service;

import org.example.evaluation.IEvaluator;

public class FizzBuzzPrinter {
    private final IEvaluator evaluator;
    private boolean suppressFizzBuzz = false;

    public FizzBuzzPrinter(IEvaluator evaluator) {
        this.evaluator = evaluator;
    }

    // Enable/disable suppression of only FizzBuss
    public void setSuppressFizzBuzz(boolean suppress) {
        this.suppressFizzBuzz = suppress;
    }

    public void print(int start, int end) {
        for (int i = start; i <= end; i++) {
            String result = evaluator.evaluate(i);

            if (suppressFizzBuzz && "FizzBuss".equals(result)) {
                // Instead of printing "FizzBuss", print the number
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }
}
