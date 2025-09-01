package org.example;

import org.example.evaluation.IEvaluator;
import org.example.service.FizzBuzzEvaluator;
import org.example.service.FizzBuzzPrinter;

public class Main {
    public static void main(String[] args) {
        IEvaluator evaluator = FizzBuzzEvaluator.getInstance();
        FizzBuzzPrinter printer = new FizzBuzzPrinter(evaluator);

        System.out.println("Normal mode:");
        printer.print(1, 100);

        System.out.println("\nSuppression mode (FizzBuzz suppressed):");
        printer.setSuppressFizzBuzz(true);
        printer.print(1, 100);
    }
}
