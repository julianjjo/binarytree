package com.test.binarytree.model;

public class TreeCreationDataModel {
    private int minValue;
    private int maxValue;
    private int maxNumberOfNodes;
    
    public TreeCreationDataModel(int minValue, int maxValue, int maxNumberOfNodes) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.maxNumberOfNodes = maxNumberOfNodes;
    }
    
    public int getMinValue() {
        return minValue;
    }
    
    public int getMaxValue() {
        return maxValue;
    }
    
    public int getMaxNumberOfNodes() {
        return maxNumberOfNodes;
    }
}
