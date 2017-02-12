package com.valik.project.calculator.model;

import java.util.List;

/**
 * Created by Torus on 05.02.2017.
 */
public interface SimpleCalculator {
    String SIMPLE_OPERATORS = "[*\\-+/]";
    String PLUS = "+";
    String MINUS = "-";
    String MULTIPLY = "*";
    String DIVIDE = "/";
    String MEMORY_OPERATORS = "MC|M+|M-|MR|MS";
    String MEMORY_CLEAR = "MC";
    String INCREASE_MEMORY = "M+";
    String REDUCE_MEMORY = "M-";
    String MEMORY_READ = "MR";
    String MEMORY_SAVE = "MS";
    String ENGINEER_OPERATORS = "cos|exp|sqrt";
    String COSINE = "cos";
    String EXPONENT = "exp";
    String SQUARE_ROOT = "sqrt";


    double plus(double firstNumber, double secondNumber);
    double minus(double firstNumber, double secondNumber);
    double multiply(double firstNumber, double secondNumber);
    double divide(double firstNumber, double secondNumber);
    double getResult();
}
