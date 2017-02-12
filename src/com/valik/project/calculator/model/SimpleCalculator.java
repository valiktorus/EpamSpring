package com.valik.project.calculator.model;


/**
 * Created by Torus on 05.02.2017.
 */
public interface SimpleCalculator {
    String SIMPLE_OPERATORS = "[*\\-+/]";
    String PLUS = "+";
    String MINUS = "-";
    String MULTIPLY = "*";
    String DIVIDE = "/";

    double plus(double firstNumber, double secondNumber);

    double minus(double firstNumber, double secondNumber);

    double multiply(double firstNumber, double secondNumber);

    double divide(double firstNumber, double secondNumber);

    double getResult();
}
