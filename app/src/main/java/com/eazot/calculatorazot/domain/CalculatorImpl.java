package com.eazot.calculatorazot.domain;

public class CalculatorImpl implements Calculator {

    @Override
    public int performBinaryOperator(int val1, int val2, Operator operator) {

        switch (operator) {
            case ADD:
                val1 = val1 + val2;
                break;
            case SUBTRACTION:
                val1 = val1 - val2;
                break;
            case MULTIPLICATION:
                val1 = val1 * val2;
                break;
            case DIVISION:
                val1 = val1 / val2;
                break;
            case EXTRA:
                val1 = (-1) * val1;
                break;
            case MODULUS:
                val1 = val1 % val2;
                break;
            case EQU:
                break;

        }
        return val1;
    }
}