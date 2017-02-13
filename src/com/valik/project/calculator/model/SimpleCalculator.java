package com.valik.project.calculator.model;

public interface SimpleCalculator extends Calculator{
    String SIMPLE_OPERATORS = "[*\\-+/]";
    String PLUS = "+";
    String MINUS = "-";
    String MULTIPLY = "*";
    String DIVIDE = "/";

    double plus(double firstNumber, double secondNumber);

    double minus(double firstNumber, double secondNumber);

    double multiply(double firstNumber, double secondNumber);

    double divide(double firstNumber, double secondNumber);
}
