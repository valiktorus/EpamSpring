package com.valik.project.calculator.model.impl;

import com.valik.project.calculator.model.SimpleCalculator;

import java.util.List;

public abstract class AbstractSimpleCalculator implements SimpleCalculator {
    public List<String> task;
    protected double passingResult = 0;

    public AbstractSimpleCalculator(List<String> task) {
        this.task = task;
    }

    @Override
    public double plus(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public double minus(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    protected void switchBySimpleOperator(String operator, double firstNumber, double secondNumber){
        switch (operator){
            case PLUS:
                passingResult = plus(firstNumber, secondNumber);
                break;
            case MINUS:
                passingResult = minus(firstNumber, secondNumber);
                break;
            case MULTIPLY:
                passingResult = multiply(firstNumber, secondNumber);
                break;
            case DIVIDE:
                passingResult = divide(firstNumber, secondNumber);
                break;
        }
    }

    protected double getFirstNumber(List<String> task, int index) {
        return index == 2 ? Double.parseDouble(task.get(index - 1)) : passingResult;
    }
}
