package graph;

import model.Room;
import java.util.*;

public class DungeonGraph {
    private Map<Room, List<Room>> adjList = new HashMap<>();

    public void addRoom(Room room) {
        adjList.putIfAbsent(room, new ArrayList<>());
    }

    public void connect(Room a, Room b) {
        adjList.get(a).add(b);
        adjList.get(b).add(a);
    }

    // BFS duyệt phòng
    public void bfs(Room start) {
        Set<Room> visited = new HashSet<>();
        Queue<Room> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        System.out.println("\n=== BFS duyệt hầm ngục ===");

        while (!queue.isEmpty()) {
            Room current = queue.poll();
            System.out.println("Thăm phòng: " + current);

            for (Room neighbor : adjList.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    // DFS duyệt phòng
    public void dfs(Room start) {
        Set<Room> visited = new HashSet<>();
        System.out.println("\n=== DFS duyệt hầm ngục ===");
        dfsRec(start, visited);
    }

    private void dfsRec(Room room, Set<Room> visited) {
        visited.add(room);
        System.out.println("Thăm phòng: " + room);

        for (Room neighbor : adjList.get(room)) {
            if (!visited.contains(neighbor)) {
                dfsRec(neighbor, visited);
            }
        }
    }
}
