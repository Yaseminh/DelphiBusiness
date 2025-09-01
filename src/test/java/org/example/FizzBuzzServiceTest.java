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
        assertEquals("Buss", fizzBuzzEvaluator.evaluate(7));
        assertEquals("Buss", fizzBuzzEvaluator.evaluate(14));
    }

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuss", fizzBuzzEvaluator.evaluate(21));
        assertEquals("FizzBuss", fizzBuzzEvaluator.evaluate(42));
    }

    @Test
    void testNumber() {
        assertEquals("1", fizzBuzzEvaluator.evaluate(1));
        assertEquals("2", fizzBuzzEvaluator.evaluate(2));
    }
}
