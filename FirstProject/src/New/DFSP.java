package DAY10;
import java.util.*;

public class DFSP {
    private Map<String, List<String>> homemap = new HashMap<>();
    private Set<String> visited = new HashSet<>();

    public void addRoom(String room, String connectedRoom) {
        homemap.computeIfAbsent(room, k -> new ArrayList<>()).add(connectedRoom);
        homemap.computeIfAbsent(connectedRoom, k -> new ArrayList<>()).add(room); // Bidirectional
    }

    public void dfs(String currentRoom) {
        if (visited.contains(currentRoom)) {
            return;
        }
        visited.add(currentRoom);
        System.out.println("Visited: " + currentRoom);

        for (String neighbor : homemap.get(currentRoom)) {
            dfs(neighbor);
        }
    }

    public static void main(String[] args) {
        DFSP home = new DFSP();

        home.addRoom("Living Room", "Kitchen");
        home.addRoom("Living Room", "Bedroom");
        home.addRoom("Bedroom", "Bathroom");

        System.out.println("DFS traversal starting from Living Room");
        home.dfs("Living Room");
    }
}