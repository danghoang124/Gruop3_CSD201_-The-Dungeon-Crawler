package bst;

import model.Monster;

public class BSTNode {
    public Monster data;
    public BSTNode left;
    public BSTNode right;

    public BSTNode(Monster data) {
        this.data = data;
        left = right = null;
    }
}
