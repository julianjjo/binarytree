package com.test.binarytree.util;

public class NumberUtility {
	
	public int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}
}
