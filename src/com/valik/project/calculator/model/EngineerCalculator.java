package com.valik.project.calculator.model;

/**
 * Created by Torus on 05.02.2017.
 */
public interface EngineerCalculator {
    String ENGINEER_OPERATORS = "cos|exp|sqrt";
    String COSINE = "cos";
    String EXPONENT = "exp";
    String SQUARE_ROOT = "sqrt";

    double cosine(double number);
    double exponent(double number);
    double squareRoot(double number);

}
