package com.junit.assignmentci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTests {

    Calculator calculator = new Calculator();
    @Test
    @DisplayName("Test for Addition of Two integers")
    void shouldReturnSumAfterAdditionTest() {
        int a = 5;
        int b = 10;
        int result = calculator.add(a, b);
        Assertions.assertEquals(15, result);
    }

    @Test
    @DisplayName("Test for Subtraction of Two integers")
    void shouldReturnNumberAfterSubtractionTest() {
        int a = 5;
        int b = 3;
        int result = calculator.subtract(a, b);
        Assertions.assertEquals(2, result);
    }

    @Test
    @DisplayName("Test for Multiplication of Two integers")
    void shouldReturnNumberAfterMultiplicationTest() {
        int a = 5;
        int b = 10;
        int result = calculator.multiply(a, b);
        Assertions.assertEquals(50, result);
    }

    @Test
    @DisplayName("Test for Division of Two integers")
    void shouldReturnResultAfterDivisionTest() {
        int a = 3;
        int b = 5;
        double result = calculator.divide(a, b);
        Assertions.assertEquals(.6, result);

    }

    @Test
    @DisplayName("Test for SquareRoot of an integer")
    void shouldReturnResultAfterSqrtTest() {
        int a = 4;
        double result = calculator.squareRootOf(a);
        Assertions.assertEquals(2, result);

    }

    @Test
    @DisplayName("Test for Calculating Area suing positive integer")
    void shouldReturnAreaTest() {
        int a = 7;
        double result = calculator.getArea(a);
        Assertions.assertEquals(153.94, result);
    }

    @Test
    @DisplayName("Test for Calculating area using negative integer")
    void shouldReturnNanForNegativeInput() {
        int a = -2;
        double result = calculator.getArea(a);
        Assertions.assertEquals(Double.NaN, result);

    }

    @Test
    @DisplayName("Test for Calculating Circumference using positive integer")
    void shouldReturnCircumferenceTest() {
        int a = 2;
        double result = calculator.getCircumference(a);
        Assertions.assertEquals(12.57, result);
    }

    @Test
    @DisplayName("Test for Calculating Circumference using negative integer")
    void shouldReturnNanForNegativeValue() {
        int a = -2;
        double result = calculator.getCircumference(a);
        Assertions.assertEquals(Double.NaN, result);

    }

    @Test
    void failingTest() {
        Assertions.assertEquals(2,3);
    }

}
