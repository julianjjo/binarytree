package com.test.binarytree.util;

import com.test.binarytree.model.TreeCreationDataModel;
import com.test.binarytree.structure.BinaryTree;

public class RandomBinaryTreeUtility {
    private BinaryTree binaryTreeAleatory  = new BinaryTree();
    private NumberUtility numberUtility = new NumberUtility();
    private TreeCreationDataModel treeCreationData;


    public RandomBinaryTreeUtility(TreeCreationDataModel treeCreationData) {
        this.treeCreationData = treeCreationData;
        generateRandomBinaryTree(); 
    }

    public BinaryTree getRandomBinaryTree() {       
        return binaryTreeAleatory;   
    }

    private void generateRandomBinaryTree() {
        for (int i = 0; i < treeCreationData.getMaxNumberOfNodes(); i++) {
            binaryTreeAleatory.add(numberUtility.getRandomNumber(treeCreationData.getMinValue(), treeCreationData.getMaxValue()));
        }
    }
}
