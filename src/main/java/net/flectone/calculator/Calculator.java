package net.flectone.calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        return (double) a / b;
    }


    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("10 - 4 = " + calculator.subtract(10, 4));
        System.out.println("5 * 6 = " + calculator.multiply(5, 6));
        System.out.println("15 / 3 = " + calculator.divide(15, 3));
        System.out.println("Factorial 5 = " + calculator.factorial(5));

        try {
            calculator.divide(5, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }
}