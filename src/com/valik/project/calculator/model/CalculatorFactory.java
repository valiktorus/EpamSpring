package com.valik.project.calculator.model;

import java.util.List;

public interface CalculatorFactory {
    Calculator createCalculator(List<String> task);
}
