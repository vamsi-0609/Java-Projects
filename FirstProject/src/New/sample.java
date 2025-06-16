package DAY10;

import java.util.*;

public class sample {
    private Map<String, List<String>> connections = new HashMap<>();

    // Add a connection (bidirectional)
    public void addConn(String name, String connection) {
        connections.computeIfAbsent(name, k -> new ArrayList<>()).add(connection);
        connections.computeIfAbsent(connection, k -> new ArrayList<>()).add(name);
    }

    // Recursive DFS wrapper
    public List<String> findSocialCircle(String person) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        dfsHelper(person, visited, result);
        return result;
    }

    // Recursive DFS helper
    private void dfsHelper(String person, Set<String> visited, List<String> result) {
        if (visited.contains(person)) return;
        visited.add(person);
        result.add(person);

        for (String neighbor : connections.getOrDefault(person, new ArrayList<>())) {
            dfsHelper(neighbor, visited, result);
        }
    }
    
    public void printAllSocialCircles() {
        Set<String> visited = new HashSet<>();
        
        for (String person : connections.keySet()) {
            if (!visited.contains(person)) {
                List<String> circle = new ArrayList<>();
                dfsHelper(person, visited, circle);
                System.out.println("Social Circle: " + circle);
            }
        }
    }


    // Iterative DFS
    public List<String> findSocialCircleItrarive(String person) {
        Set<String> visited = new HashSet<>();
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push(person);

        while (!stack.isEmpty()) {
            String current = stack.pop();
            if (!visited.contains(current)) {
                visited.add(current);
                result.add(current);
                for (String neighbor : connections.getOrDefault(current, new ArrayList<>())) {
                    stack.push(neighbor);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        sample socialconn = new sample();

        // Connected group 1
        socialconn.addConn("vamsi", "krishna");
        socialconn.addConn("krishna", "pandu");
        socialconn.addConn("pandu", "Praveen");
        socialconn.addConn("Praveen", "saketh");
        socialconn.addConn("saketh", "subash");

        // Disconnected group 2
        socialconn.addConn("john", "doe");
        socialconn.addConn("krish", "Madhusudhan");

        System.out.println("Recursive DFS (Social circle of vamsi):");
        System.out.println(socialconn.findSocialCircle("vamsi"));

        System.out.println("\nIterative DFS (Social circle of vamsi):");
        System.out.println(socialconn.findSocialCircleItrarive("vamsi"));

        System.out.println("\nRecursive DFS (Social circle of john):");
        System.out.println(socialconn.findSocialCircle("john"));
        
        System.out.println("Print all the disconencted components: ");
        socialconn.printAllSocialCircles();
    }
}
