package com.valik.project.calculator.model.impl;

import com.valik.project.calculator.model.EngineerCalculator;

/**
 * Created by Torus on 07.02.2017.
 */
public abstract class AbstractEngineerCalculator extends AbstractSimpleCalculator implements EngineerCalculator{
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
