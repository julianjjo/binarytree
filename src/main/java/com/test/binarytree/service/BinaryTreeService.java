package com.test.binarytree.service;

import java.util.List;
import java.util.stream.Collectors;

import com.test.binarytree.model.AncestorsModel;
import com.test.binarytree.model.BinaryTreeModel;
import com.test.binarytree.model.TreeCreationDataModel;
import com.test.binarytree.structure.BinaryTreeStructure;
import com.test.binarytree.util.RandomBinaryTreeUtility;
import com.test.binarytree.util.TreeUtility;

public class BinaryTreeService {
    private RandomBinaryTreeUtility randomBinaryTree;
    private TreeUtility treeUtility;
    private TreeCreationDataModel treeCreationData;    
    BinaryTreeStructure binaryTree;


    public BinaryTreeService() {
        treeUtility = new TreeUtility();
    }

    public void setCreationData(TreeCreationDataModel treeCreationData) {
        this.treeCreationData = treeCreationData;        
    }

    private void setRandomBinaryTreeUtility() {        
        randomBinaryTree = new RandomBinaryTreeUtility(treeCreationData);
    }

    private BinaryTreeStructure getRandomBinaryTree() {       
        return randomBinaryTree.getRandomBinaryTree();   
    }

    public BinaryTreeModel getBinaryTreeResponse() {
        setRandomBinaryTreeUtility();
        binaryTree = getRandomBinaryTree();
        treeUtility.traverseLevelOrder(binaryTree.getRoot());
        BinaryTreeModel binaryTreeModel = new BinaryTreeModel();
        binaryTreeModel.setMinValue(treeCreationData.getMinValue());
        binaryTreeModel.setMaxValue(treeCreationData.getMaxValue());
        binaryTreeModel.setMaxNumberOfNodes(treeCreationData.getMaxNumberOfNodes());
        binaryTreeModel.setBinaryTree(treeUtility.getStringBinaryTreeOrder());
        return binaryTreeModel;
    }

    public AncestorsModel getAncestors(int value1, int value2) {
        AncestorsModel ancestorsModel = new AncestorsModel();
        List<Integer> ancestorsValue1 = binaryTree.getAncestors(value1);
        List<Integer> ancestorsValue2 = binaryTree.getAncestors(value2);
        String commonAncestor = binaryTree.getCommonAncestors(ancestorsValue1, ancestorsValue2);
        ancestorsModel.setAncestors1(ancestorsValue1.stream().map(String::valueOf).collect(Collectors.joining("-")));
        ancestorsModel.setAncestors2(ancestorsValue2.stream().map(String::valueOf).collect(Collectors.joining("-")));
        ancestorsModel.setCommonAncestor(commonAncestor);
        return ancestorsModel;
    }

    public void setBinaryTreeForModel(BinaryTreeModel binaryTreeModel) {
        String binaryTreeString = binaryTreeModel.getBinaryTree();
        String[] nodes = binaryTreeString.split("-");
        binaryTree = new BinaryTreeStructure();
        for (int index = 0; index < nodes.length; index++) {
            binaryTree.add(Integer.parseInt(nodes[index]));
        }
    }
}
