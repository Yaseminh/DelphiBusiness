package org.example;

import org.example.evaluation.IEvaluator;
import org.example.service.FizzBuzzEvaluator;
import org.example.service.FizzBuzzPrinter;

public class Main {
    public static void main(String[] args) {
        // Dependency Injection using interface
        IEvaluator evaluator = FizzBuzzEvaluator.getInstance();
        FizzBuzzPrinter printer = new FizzBuzzPrinter(evaluator);
        printer.print(1, 100);
    }
}
