package com.valik.project.calculator.model.impl;

import java.util.List;

public class CalculatorSimple extends AbstractSimpleCalculator {

    public CalculatorSimple(List<String> task) {
        super(task);
    }

    @Override
    public double getResult() {
        for (int i = 1; i <task.size() ; i++) {
            String operator = task.get(i);
            if (operator.matches(SIMPLE_OPERATORS)){
                double firstNumber;
                if (i == 2){
                    firstNumber = Double.parseDouble(task.get(i-1));
                }else {
                    firstNumber = passingResult;
                }
                double secondNumber = Double.parseDouble(task.get(i+1));
                switchBySimpleOperator(operator, firstNumber, secondNumber);
                i++;
            }
        }
        return passingResult;
    }
}
