package com.valik.project.calculator.abstractClasses;

import com.valik.project.calculator.interfaces.EngineerCalculator;

/**
 * Created by Torus on 07.02.2017.
 */
public class AbstractEngineerCalculator extends AbstractSimpleCalculator implements EngineerCalculator{
    @Override
    public double cosine() {
        return 0;
    }

    @Override
    public double exponent() {
        return 0;
    }

    @Override
    public double squareRoot() {
        return 0;
    }
}
