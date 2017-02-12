package com.valik.project.calculator.model.impl;

import static com.valik.project.calculator.model.SimpleCalculator.*;

public class Memory {
    public static final String MEMORY_OPERATORS = "MC|M+|M-|MR|MS";
    public static final String MEMORY_CLEAR = "MC";
    public static final String INCREASE_MEMORY = "M+";
    public static final String REDUCE_MEMORY = "M-";
    public static final String MEMORY_READ = "MR";
    public static final String MEMORY_SAVE = "MS";

    private double memoryElement = 0;

    private void clearMemory(){
        memoryElement = 0;
    }

    private void setMemoryElement(double value){
        memoryElement = value;
    }

    private double getMemoryElement(){
        return memoryElement;
    }

    private void increaseMemory(double value){
        memoryElement += value;
    }

    private void reduceMemory(double value){
        memoryElement -= value;
    }

    public double switchMemory(Memory memory, String operator, double passingResult){
                switch (operator) {
                    case MEMORY_CLEAR:
                        memory.clearMemory();
                        break;
                    case MEMORY_READ:
                        passingResult = memory.getMemoryElement();
                        break;
                    case MEMORY_SAVE:
                        memory.setMemoryElement(passingResult);
                        break;
                    case INCREASE_MEMORY:
                        memory.increaseMemory(passingResult);
                        break;
                    case REDUCE_MEMORY:
                        memory.reduceMemory(passingResult);
                        break;
                }
                return passingResult;
    }
}
