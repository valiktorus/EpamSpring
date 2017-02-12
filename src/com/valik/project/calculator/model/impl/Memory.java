package com.valik.project.calculator.model.impl;

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

}
