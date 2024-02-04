package com.example.Homework211;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plusTest() {
        int result = calculatorService.plus(5, 5);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void minusTest() {
        int result = calculatorService.minus(5, 5);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void multiplyTest() {
        int result = calculatorService.multiply(5, 5);
        Assertions.assertEquals(25, result);
    }

    @Test
    public void divideTest() {
        int result = calculatorService.divide(5, 5);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void divideByZeroTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(5, 0);
        });
    }
}