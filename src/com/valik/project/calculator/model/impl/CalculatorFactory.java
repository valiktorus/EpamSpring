package com.valik.project.calculator.model.impl;

import com.valik.project.calculator.model.Calculator;
import java.util.List;

public class CalculatorFactory {
    public static Calculator createCalculator(int id, List<String> task) {
        switch (id){
            case 1:
                return new CalculatorSimple(task);
            case 2:
                return new CalculatorSimpleWithMemory(task);
            case 3:
                return new CalculatorEngineer(task);
            case 4:
                return new CalculatorEngineerWithMemory(task);
            default:
                throw new RuntimeException("Unknown Calculator");
        }
    }
}
