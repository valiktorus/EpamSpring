package com.valik.project.calculator.model.impl;

import com.valik.project.calculator.model.EngineerCalculator;
import java.util.List;

public abstract class AbstractEngineerCalculator extends AbstractSimpleCalculator implements EngineerCalculator{
    public AbstractEngineerCalculator(List<String> task) {
        super(task);
    }

    @Override
    public double cosine(double number) {
        return Math.cos(number);
    }

    @Override
    public double exponent(double number) {
        return Math.exp(number);
    }

    @Override
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }

    protected void switchByEngineerOperator(String operator, double number){
        switch (operator) {
            case COSINE:
                passingResult = cosine(number);
                break;
            case EXPONENT:
                passingResult = exponent(number);
                break;
            case SQUARE_ROOT:
                passingResult = squareRoot(number);
                break;
        }
    }
}
