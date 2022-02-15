package com.test.binarytree.model;

public class BinaryTreeModel {
    private int minValue;
    private int maxValue;
    private int maxNumberOfNodes;
    private String binaryTree;

    public BinaryTreeModel(TreeCreationDataModel treeCreationData, String binaryTree) {
        this.minValue = treeCreationData.getMaxValue();
        this.maxValue = treeCreationData.getMinValue();
        this.maxNumberOfNodes = treeCreationData.getMaxNumberOfNodes();
        this.binaryTree = binaryTree;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public void setMaxNumberOfNodes(int maxNumberOfNodes) {
        this.maxNumberOfNodes = maxNumberOfNodes;
    }

    public void setBinaryTree(String binaryTree) {
        this.binaryTree = binaryTree;
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

    public String getBinaryTree() {
        return binaryTree;
    }
}
