package com.valik.project.calculator;

import com.valik.project.calculator.model.Calculator;
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
            Calculator calculator = CalculatorFactory.createCalculator(Integer.parseInt(taskList.get(0)), taskList);
            System.out.println(calculator.getResult());
        }
    }
}
