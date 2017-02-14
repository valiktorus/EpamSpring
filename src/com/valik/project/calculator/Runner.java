package com.valik.project.calculator;

import com.valik.project.calculator.factory.CalculatorFactory;
import com.valik.project.calculator.model.Calculator;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {
        if (args.length == 0){
            System.out.println("There are no arguments");
            return;
        }
        List<String> taskList = Files.readAllLines(Paths.get(args[0]), StandardCharsets.UTF_8);
        Calculator calculator = CalculatorFactory.createCalculator(Integer.parseInt(taskList.get(0)), taskList);
        System.out.println(calculator.getResult());
    }
}