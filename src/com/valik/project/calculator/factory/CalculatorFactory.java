package com.valik.project.calculator.factory;

import com.valik.project.calculator.model.Calculator;
import com.valik.project.calculator.model.impl.CalculatorEngineer;
import com.valik.project.calculator.model.impl.CalculatorEngineerWithMemory;
import com.valik.project.calculator.model.impl.CalculatorSimple;
import com.valik.project.calculator.model.impl.CalculatorSimpleWithMemory;
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
