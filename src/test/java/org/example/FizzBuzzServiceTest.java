package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.example.service.FizzBuzzEvaluator;

public class FizzBuzzServiceTest {

    static FizzBuzzEvaluator fizzBuzzEvaluator;

    @BeforeAll
    static void setup() {
        // Get singleton instance of the inner class
        fizzBuzzEvaluator = FizzBuzzEvaluator.getInstance();
    }

    @Test
    void testFizz() {
        assertEquals("Fizz", fizzBuzzEvaluator.evaluate(3));
        assertEquals("Fizz", fizzBuzzEvaluator.evaluate(6));
    }

    @Test
    void testBuzz() {
        assertEquals("Buzz", fizzBuzzEvaluator.evaluate(5));
        assertEquals("Buzz", fizzBuzzEvaluator.evaluate(10));
    }

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzzEvaluator.evaluate(15));
        assertEquals("FizzBuzz", fizzBuzzEvaluator.evaluate(30));
    }

    @Test
    void testNumber() {
        assertEquals("1", fizzBuzzEvaluator.evaluate(1));
        assertEquals("2", fizzBuzzEvaluator.evaluate(2));
    }
}
