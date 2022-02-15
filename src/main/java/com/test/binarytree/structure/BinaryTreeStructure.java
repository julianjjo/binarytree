package com.test.binarytree.structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeStructure {
	NodeStructure root;
    public String stringBinaryTreeOrder = "";
	private List<Integer> ancestors = new ArrayList<Integer>();
		
	private NodeStructure addRecursive(NodeStructure current, int value) {
	    if (current == null) {
	        return new NodeStructure(value);
	    }

	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }

	    return current;
	}
	
	public void add(int value) {
	    root = addRecursive(root, value);
	}

	public NodeStructure getRoot(){
		return root;
	}

    public List<Integer> getAncestors(int value) {
		this.ancestors = new ArrayList<Integer>();
		getAncestorsRecursive(value, root);
		return ancestors;
    }

	public boolean getAncestorsRecursive(int value, NodeStructure current){
		if (current == null)
			return false;

		if (current.value == value) {
			return true;
		}

		if (getAncestorsRecursive(value, current.left) || getAncestorsRecursive(value, current.right)) {
			this.ancestors.add(current.value);
			return true;
		}
        return false;
	}

	public String getCommonAncestors(List<Integer> ancestorsValue1, List<Integer> ancestorsValue2) {
		String commonAncestor = "";
		Collections.reverse(ancestorsValue1);
		Collections.reverse(ancestorsValue2);

		for (int i = 0; i < ancestorsValue1.size(); i++) {
			for (int j = 0; j < ancestorsValue2.size(); j++) {				
				if (ancestorsValue1.get(i).equals(ancestorsValue2.get(j)) && i == j) {
					commonAncestor = String.valueOf(ancestorsValue1.get(i));
				}
			}
        }

		return commonAncestor;
	}
}
