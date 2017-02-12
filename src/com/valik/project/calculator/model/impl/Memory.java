package com.valik.project.calculator.model.impl;

import static com.valik.project.calculator.model.SimpleCalculator.*;

public class Memory {

    private double memoryElement = 0;

    public void clearMemory(){
        memoryElement = 0;
    }
    public void setMemoryElement(double value){
        memoryElement = value;
    }
    public double getMemoryElement(){
        return memoryElement;
    }
    public void increaseMemory(double value){
        memoryElement += value;
    }
    public void reduceMemory(double value){
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
