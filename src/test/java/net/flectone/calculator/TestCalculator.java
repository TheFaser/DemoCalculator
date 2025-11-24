package net.flectone.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class TestCalculator {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd_PositiveNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testAdd_NegativeNumbers() {
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void testSubtract_PositiveResult() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void testSubtract_NegativeResult() {
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    void testMultiply_ByZero() {
        assertEquals(0, calculator.multiply(5, 0));
    }

    @Test
    void testMultiply_PositiveNumbers() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testDivide_NormalCase() {
        assertEquals(2.0, calculator.divide(6, 3));
    }

    @Test
    void testDivide_DivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @Test
    void testFactorial_OfZero() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void testFactorial_OfFive() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void testFactorial_NegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-1);
        });
        assertEquals("Factorial is not defined for negative numbers", exception.getMessage());
    }
}