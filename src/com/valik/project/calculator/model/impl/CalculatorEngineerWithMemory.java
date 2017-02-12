package com.valik.project.calculator.model.impl;

import java.util.List;

/**
 * Created by Torus on 05.02.2017.
 */
public class CalculatorEngineerWithMemory extends CalculatorEngineer{
    private Memory memory;

    public CalculatorEngineerWithMemory(List<String> task) {
        super(task);
        memory = new Memory();
    }

    @Override
    public double getResult() {
        for (int i = 1; i <task.size() ; i++) {
            String operator = task.get(i);
            if (operator.matches(MEMORY_OPERATORS)){
                passingResult = memory.switchMemory(memory, operator, passingResult);
                i++;
            }
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
            if (operator.matches(ENGINEER_OPERATORS)){
                double number;
                if (i == 2){
                    number = Double.parseDouble(task.get(i-1));
                }else {
                    number = passingResult;
                }
                switchByEngineerOperator(operator, number);
            }
        }
        return passingResult;
    }
}
