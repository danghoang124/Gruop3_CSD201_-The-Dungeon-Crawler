import linkedlist.InventoryLinkedList;
import model.Item;
import bst.MonsterBST;
import model.Monster;
import graph.DungeonGraph;
import model.Room;

public class Main {
    public static void main(String[] args) {
    // ===== TEST INVENTORY =====
    InventoryLinkedList inventory = new InventoryLinkedList();

    inventory.add(new Item("Kiếm sắt", "Weapon", 15));
    inventory.add(new Item("Thuốc máu", "Potion", 5));
    inventory.add(new Item("Khiên gỗ", "Armor", 10));

    System.out.println("=== Inventory ban đầu ===");
    inventory.display();

    inventory.remove("Thuốc máu");

    System.out.println("=== Inventory sau khi xóa ===");
    inventory.display();

    // ===== TEST MONSTER BST =====
    MonsterBST monsterBST = new MonsterBST();

    monsterBST.insert(new Monster("Goblin", 30, 5));
    monsterBST.insert(new Monster("Dragon", 300, 50));
    monsterBST.insert(new Monster("Slime", 10, 2));
    monsterBST.insert(new Monster("Orc", 80, 15));

    System.out.println("\n=== Tìm quái vật ===");
    Monster m = monsterBST.search("Dragon");

    if (m != null) {
        System.out.println("Tìm thấy: " + m);
    } else {
        System.out.println("Không tìm thấy quái vật.");
    }
               // ===== TEST DUNGEON GRAPH =====
    DungeonGraph dungeon = new DungeonGraph();

    Room entrance = new Room("Entrance");
    Room hall = new Room("Hall");
    Room treasure = new Room("Treasure Room");
    Room boss = new Room("Boss Room");

    dungeon.addRoom(entrance);
    dungeon.addRoom(hall);
    dungeon.addRoom(treasure);
    dungeon.addRoom(boss);

    dungeon.connect(entrance, hall);
    dungeon.connect(hall, treasure);
    dungeon.connect(hall, boss);

    dungeon.bfs(entrance);
    dungeon.dfs(entrance);

}

}
