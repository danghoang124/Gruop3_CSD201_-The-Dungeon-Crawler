package bst;

import model.Monster;

public class MonsterBST {
    private BSTNode root;

    public MonsterBST() {
        root = null;
    }

    public void insert(Monster monster) {
        root = insertRec(root, monster);
    }

    private BSTNode insertRec(BSTNode node, Monster monster) {
        if (node == null) {
            return new BSTNode(monster);
        }

        if (monster.getName().compareToIgnoreCase(node.data.getName()) < 0) {
            node.left = insertRec(node.left, monster);
        } else {
            node.right = insertRec(node.right, monster);
        }

        return node;
    }

    public Monster search(String name) {
        return searchRec(root, name);
    }

    private Monster searchRec(BSTNode node, String name) {
        if (node == null) {
            return null;
        }

        if (node.data.getName().equalsIgnoreCase(name)) {
            return node.data;
        }

        if (name.compareToIgnoreCase(node.data.getName()) < 0) {
            return searchRec(node.left, name);
        } else {
            return searchRec(node.right, name);
        }
    }
}
