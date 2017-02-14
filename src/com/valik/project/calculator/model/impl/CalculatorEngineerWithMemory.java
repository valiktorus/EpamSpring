package com.valik.project.calculator.model.impl;

import java.util.List;

public class CalculatorEngineerWithMemory extends CalculatorEngineer{
    private Memory memory;

    public CalculatorEngineerWithMemory(List<String> task) {
        super(task);
        memory = new Memory();
    }

    @Override
    public double getResult() {
        for (int i = 1; i <task.size(); i++) {
            String operator = task.get(i);
            if (operator.matches(Memory.MEMORY_OPERATORS)){
                passingResult = memory.switchMemory(memory, operator, passingResult);
            }
            if (operator.matches(SIMPLE_OPERATORS)){
                double firstNumber = getFirstNumber(task, i);
                double secondNumber = Double.parseDouble(task.get(i + 1));
                switchBySimpleOperator(operator, firstNumber, secondNumber);
                i++;
            }
            if (operator.matches(ENGINEER_OPERATORS)){
                double number = getFirstNumber(task, i);
                switchByEngineerOperator(operator, number);
            }
        }
        return passingResult;
    }
}
