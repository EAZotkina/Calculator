package com.eazot.calculatorazot;

import com.eazot.calculatorazot.domain.Calculator;
import com.eazot.calculatorazot.domain.Operator;

public class CalculatePresenter {
    
    private CalculatorView view;

    private final Calculator calculator;

    private int argumentOne = 0;

    private int argumentTwo = 0;

    private boolean isFirstArgument = true;

    private Operator operator = null;

    public CalculatePresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;

        publishArgument();
    }
    public void keyOnePressed() {
        computeArg(1);
        publishArgument();
    }

    public void keyTwoPressed() {
        computeArg(2);
        publishArgument();
    }

    public void keyTreePressed() {
        computeArg(3);
        publishArgument();
    }

    public void keyFourPressed() {
        computeArg(4);
        publishArgument();
    }

    public void keyFivePressed() {
        computeArg(5);
        publishArgument();
    }

    public void keySixPressed() {
        computeArg(6);
        publishArgument();
    }

    public void keySevenPressed() {
        computeArg(7);
        publishArgument();
    }

    public void keyEightPressed() {
        computeArg(8);
        publishArgument();
    }

    public void keyNinePressed() {
        computeArg(9);
        publishArgument();
    }

    public void keyZeroPressed() {
        computeArg(0);
        publishArgument();
    }

    public void keyEqualPressed() {
        isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;
        }
        operator = Operator.EQU;
    }

    public void keyMultiPressed() {
        isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;
        }
        operator = Operator.MULTIPLICATION;
    }

    public void keyDividePressed() {
        isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;
        }
        operator = Operator.DIVISION;
    }

    public void keyAddPressed() {
        isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;
        }
        operator = Operator.ADD;
    }

    public void keySubPressed() {
        isFirstArgument = false;

        if (operator != null) {

            int result = calculator.performBinaryOperator(argumentOne, argumentTwo, operator);

            view.showResult(String.valueOf(result));

            argumentOne = result;
            argumentTwo = 0;
        }
        operator = Operator.SUBTRACTION;
    }

    public void keyClearPressed() {
        isFirstArgument = false;

        if (operator != null) {

            int result = 0;

            view.showResult("");

            argumentOne = 0;
            argumentTwo = 0;
        }
    }

    public void keyDotPressed() {
    }

    public void keyPara1Pressed() {
    }

    public void keyPara2Pressed() {
    }

    private void publishArgument() {

        if (isFirstArgument) {
            view.showResult(String.valueOf(argumentOne));
        } else {
            view.showResult(String.valueOf(argumentTwo));
        }
    }

    private void computeArg(int addition) {
        if (isFirstArgument) {
            argumentOne = argumentOne * 10 + addition;
        } else {
            argumentTwo = argumentTwo * 10 + addition;
        }

    }

}
