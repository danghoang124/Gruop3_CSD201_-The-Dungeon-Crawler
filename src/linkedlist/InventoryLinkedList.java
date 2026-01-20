package linkedlist;

import model.Item;

public class InventoryLinkedList {
    private Node head;

    public InventoryLinkedList() {
        head = null;
    }

    // Thêm item vào cuối danh sách
    public void add(Item item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Xóa item theo tên
    public boolean remove(String itemName) {
        if (head == null) return false;

        if (head.data.getName().equalsIgnoreCase(itemName)) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.getName().equalsIgnoreCase(itemName)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // In túi đồ
    public void display() {
        if (head == null) {
            System.out.println("Inventory trống.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
