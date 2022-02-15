package com.test.binarytree.service;

import com.test.binarytree.model.BinaryTreeModel;
import com.test.binarytree.model.TreeCreationDataModel;
import com.test.binarytree.structure.BinaryTree;
import com.test.binarytree.util.RandomBinaryTreeUtility;
import com.test.binarytree.util.TreeUtility;

public class BinaryTreeService {
    private RandomBinaryTreeUtility randomBinaryTree;
    private TreeUtility treeUtility;
    private TreeCreationDataModel treeCreationData;


    public BinaryTreeService(TreeCreationDataModel treeCreationData) {
        this.treeCreationData = treeCreationData;
        treeUtility = new TreeUtility();
        randomBinaryTree = new RandomBinaryTreeUtility(treeCreationData);
    }

    private BinaryTree getRandomBinaryTree() {       
        return randomBinaryTree.getRandomBinaryTree();   
    }

    public BinaryTreeModel getBinaryTreeResponse() {
        BinaryTree binaryTree = getRandomBinaryTree();
        treeUtility.traverseLevelOrder(binaryTree.getRoot());
        BinaryTreeModel binaryTreeModel = new BinaryTreeModel(treeCreationData, treeUtility.getStringBinaryTreeOrder());
        return binaryTreeModel;
    }
}
