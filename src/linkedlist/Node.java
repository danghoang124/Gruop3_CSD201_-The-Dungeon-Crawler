package linkedlist;

import model.Item;

public class Node {
    public Item data;
    public Node next;

    public Node(Item data) {
        this.data = data;
        this.next = null;
    }
}
