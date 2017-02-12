package com.valik.project.calculator;

import com.valik.project.calculator.model.SimpleCalculator;
import com.valik.project.calculator.model.impl.CalculatorEngineer;
import com.valik.project.calculator.model.impl.CalculatorEngineerWithMemory;
import com.valik.project.calculator.model.impl.CalculatorSimple;
import com.valik.project.calculator.model.impl.CalculatorSimpleWithMemory;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Torus on 05.02.2017.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        if (args.length == 0){
            System.out.println("There are no arguments");
        }else {
            List<String> taskList = Files.readAllLines(Paths.get(args[0]), Charset.forName("UTF-8"));
            SimpleCalculator calculator = getCalculator(Integer.parseInt(taskList.get(0)), taskList);
            System.out.println(calculator.getResult());
        }
    }

    private static SimpleCalculator getCalculator(int calculatorNumber, List<String> taskList){
        SimpleCalculator calculator = null;
        switch (calculatorNumber){
            case 1:
                calculator = new CalculatorSimple(taskList);
                break;
            case 2:
                calculator = new CalculatorSimpleWithMemory(taskList);
                break;
            case 3:
                calculator = new CalculatorEngineer(taskList);
                break;
            case 4:
                calculator = new CalculatorEngineerWithMemory(taskList);
                break;
        }
        return calculator;
    }

}
