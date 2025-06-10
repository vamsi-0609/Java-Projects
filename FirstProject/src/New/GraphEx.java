package DAY10;

import java.util.*;

public class GraphEx {
    public static void main(String[] args) {
        Map<String, List<String>> mp = new HashMap<>();

        // Corrected names
        mp.put("Reptile House", Arrays.asList("Snake Pit"));
        mp.put("Bird Sanctuary", Arrays.asList("Parrot Pavilion"));
        mp.put("Mammal Zone", Arrays.asList("Lion Den", "Elephant Enclosure"));
        mp.put("Parrot Pavilion", new ArrayList<String>());
        mp.put("Lion Den", new ArrayList<String>());
        mp.put("Elephant Enclosure", new ArrayList<String>());
        mp.put("Snake Pit", new ArrayList<String>());

        // Call BFS starting from "Mammal Zone"
        bfs(mp, "");
    }

    public static void bfs(Map<String, List<String>> graph, String start){
        Queue<String> queue = new LinkedList<String>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()){
            String current = queue.poll();
            System.out.println("Visited: " + current);

            for(String neighbor : graph.get(current)){
                if(!visited.contains(neighbor)){
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
