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
            if (operator.matches(MEMORY_OPERATORS)){
                switch (operator){
                    case MEMORY_CLEAR:
                        memory.clearMemory();
                        break;
                    case MEMORY_READ:
                        passingResult = memory.getMemoryElement();
                        break;
                    case MEMORY_SAVE:
                        memory.setMemoryElement(passingResult);
                        break;
                    case INCREASE_MEMORY:
                        memory.increaseMemory(passingResult);
                        break;
                    case REDUCE_MEMORY:
                        memory.reduceMemory(passingResult);
                        break;
                }
                i++;
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
