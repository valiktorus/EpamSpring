package com.valik.project.calculator;

import com.valik.project.calculator.model.Calculator;
import com.valik.project.calculator.model.CalculatorFactory;
import com.valik.project.calculator.model.impl.*;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {
        if (args.length == 0){
            System.out.println("There are no arguments");
        }else {
            List<String> taskList = Files.readAllLines(Paths.get(args[0]), Charset.forName("UTF-8"));
            Calculator calculator = getCalculator(Integer.parseInt(taskList.get(0)), taskList);
            System.out.println(calculator.getResult());
        }
    }

    private static Calculator getCalculator(int calculatorNumber, List<String> taskList){
        CalculatorFactory calculatorFactory = createCalculatorFactoryById(calculatorNumber);
        return calculatorFactory.createCalculator(taskList);
    }

    private static CalculatorFactory createCalculatorFactoryById(int id){
        switch (id){
            case 1:
                return new CalculatorSimpleFactory();
            case 2:
                return new CalculatorSimpleWithMemoryFactory();
            case 3:
                return new CalculatorEngineerFactory();
            case 4:
                return new CalculatorEngineerWithMemoryFactory();
            default:
                return null;
        }
    }

}
