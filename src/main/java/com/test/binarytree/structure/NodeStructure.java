package com.test.binarytree.structure;

public class NodeStructure {
	public int value;
    public NodeStructure left;
    public NodeStructure right;

    public NodeStructure(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
