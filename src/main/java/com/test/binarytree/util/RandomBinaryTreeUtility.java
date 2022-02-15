package com.test.binarytree.util;

import com.test.binarytree.model.TreeCreationDataModel;
import com.test.binarytree.structure.BinaryTreeStructure;

public class RandomBinaryTreeUtility {
    private BinaryTreeStructure binaryTreeAleatory  = new BinaryTreeStructure();
    private NumberUtility numberUtility = new NumberUtility();
    private TreeCreationDataModel treeCreationData;


    public RandomBinaryTreeUtility(TreeCreationDataModel treeCreationData) {
        this.treeCreationData = treeCreationData;
        generateRandomBinaryTree(); 
    }

    public BinaryTreeStructure getRandomBinaryTree() {       
        return binaryTreeAleatory;   
    }

    private void generateRandomBinaryTree() {
        for (int i = 0; i < treeCreationData.getMaxNumberOfNodes(); i++) {
            binaryTreeAleatory.add(numberUtility.getRandomNumber(treeCreationData.getMinValue(), treeCreationData.getMaxValue()));
        }
    }
}
