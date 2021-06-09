package com.eazot.calculatorazot;

public class CalculatorImpl implements Calculator {
    @Override
    public int performBinaryOperator(int argOne, int argTwo, Operator operator) {
        return argOne + argTwo;
    }
}
