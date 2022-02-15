package com.test.binarytree.util;

import java.util.LinkedList;
import java.util.Queue;

import com.test.binarytree.structure.Node;

public class TreeUtility {
    private String stringBinaryTreeOrder = "";

	public void traversePreOrder(Node node) {
		if (node != null) {
            stringBinaryTreeOrder = stringBinaryTreeOrder + node.value + "-";
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}

	public void traverseLevelOrder(Node root) {
		if (root == null) {
			return;
		}
	
		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);
	
		while (!nodes.isEmpty()) {
	
			Node node = nodes.remove();

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
