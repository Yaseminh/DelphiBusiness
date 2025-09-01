package org.example.service;


import org.example.evaluation.IEvaluator;

public class FizzBuzzPrinter {
    private final IEvaluator evaluator;

    public FizzBuzzPrinter(IEvaluator evaluator) {
        this.evaluator = evaluator;
    }

    public void print(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(evaluator.evaluate(i));
        }
    }
}
