package com.valik.project.calculator.model.impl;

import java.util.List;

/**
 * Created by Torus on 05.02.2017.
 */
public class CalculatorSimpleWithMemory extends AbstractSimpleCalculator {
    private Memory memory;

    public CalculatorSimpleWithMemory(List<String> task) {
        super(task);
        memory = new Memory();
    }


    @Override
    public double getResult() {
        for (int i = 1; i <task.size() ; i++) {
            String operator = task.get(i);
            if (operator.matches(Memory.MEMORY_OPERATORS)){
                    passingResult = memory.switchMemory(memory, operator, passingResult);
            }
            if (operator.matches(SIMPLE_OPERATORS)){
                double firstNumber;
                if (i ==1){
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
