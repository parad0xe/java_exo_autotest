package java_exo_test;

import java.lang.Math;

class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double soustract(double a, double b) {
        return a - b;
    }

    public static double div(double a, double b) {
        if(b == 0) {
            System.out.println("[DivisionZeroError]");
            return 0;
        }

        return a / b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public static double sqrt(double n) {
        return Math.sqrt(n);
    }

    public static double dispatch(double a, char op, double b) {
        switch (op) {
            case '+':
                return Calculator.add(a, b);

            case '-':
                return Calculator.soustract(a, b);

            case '/':
                return Calculator.div(a, b);

            case '*':
                return Calculator.mul(a, b);

            case '^':
                return Calculator.pow(a, b);

            case '(':
                return Calculator.sqrt(a);
        }

        return 0.;
    }
}