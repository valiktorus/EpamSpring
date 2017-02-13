package com.valik.project.calculator.model.impl;

import com.valik.project.calculator.model.Calculator;
import com.valik.project.calculator.model.CalculatorFactory;
import java.util.List;

public class CalculatorSimpleWithMemoryFactory implements CalculatorFactory {

    @Override
    public Calculator createCalculator(List<String> task) {
        return new CalculatorSimpleWithMemory(task);
    }
}
