package com.test.binarytree.util;

import java.util.LinkedList;
import java.util.Queue;

import com.test.binarytree.structure.NodeStructure;

public class TreeUtility {
    private String stringBinaryTreeOrder = "";

	public void traverseLevelOrder(NodeStructure root) {
		if (root == null) {
			return;
		}
	
		Queue<NodeStructure> nodes = new LinkedList<>();
		nodes.add(root);
	
		while (!nodes.isEmpty()) {
	
			NodeStructure node = nodes.remove();

			stringBinaryTreeOrder = stringBinaryTreeOrder + node.value + "-";
	
			if (node.left != null) {
				nodes.add(node.left);
			}
	
			if (node.right != null) {
				nodes.add(node.right);
			}
		}
	}

	public String getStringBinaryTreeOrder() {	
		return stringBinaryTreeOrder.substring(0, stringBinaryTreeOrder.length() - 1);
	}
}
