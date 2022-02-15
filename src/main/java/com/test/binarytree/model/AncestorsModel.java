package com.test.binarytree.model;

public class AncestorsModel {
    private String ancestorsValue1 = "";
    private String ancestorsValue2 = "";
    private String commonAncestor = "";

    public void setAncestors1(String ancestors1) {
        this.ancestorsValue1 = ancestors1;
    }

    public void setAncestors2(String ancestors2) {
        this.ancestorsValue2 = ancestors2;
    }

    public void setCommonAncestor(String commonAncestor) {
        this.commonAncestor = commonAncestor;
    }

    public String getAncestors1() {
        return ancestorsValue1;
    }

    public String getAncestors2() {
        return ancestorsValue2;
    }

    public String getCommonAncestor() {
        return commonAncestor;
    }
}
