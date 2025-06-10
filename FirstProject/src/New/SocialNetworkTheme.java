package DAY10;
import java.util.*;

public class SocialNetworkTheme {
    private Map<String, List<String>> network;

    public SocialNetworkTheme() {
        network = new HashMap<>();
    }

    // Add a person to the network
    public void addPerson(String name) {
        if (!network.containsKey(name)) {
            network.put(name, new ArrayList<>());
        } else {
            System.out.println(name + " already exists in the network.");
        }
    }

    // Add a friendship (undirected edge) between two people
    public void addFriendship(String person1, String person2) {
        if (!network.containsKey(person1) || !network.containsKey(person2)) {
            System.out.println("One or both persons do not exist in the network.");
            return;
        }
        if (person1.equals(person2)) {
            System.out.println("A person cannot be friends with themselves.");
            return;
        }

        List<String> friends1 = network.get(person1);
        List<String> friends2 = network.get(person2);

        if (!friends1.contains(person2)) {
            friends1.add(person2);
        }
        if (!friends2.contains(person1)) {
            friends2.add(person1);
        }
    }

    // Display the whole network
    public void displayNetwork() {
        for (Map.Entry<String, List<String>> entry : network.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Get list of friends for a person
    public List<String> getFriends(String person) {
        if (!network.containsKey(person)) {
            System.out.println(person + " does not exist in the network.");
            return new ArrayList<>();
        }
        return network.get(person);
    }

    // Main method for testing
    public static void main(String[] args) {
        SocialNetworkTheme sn = new SocialNetworkTheme();

        sn.addPerson("Alice");
        sn.addPerson("Bob");
        sn.addPerson("Charlie");

        sn.addFriendship("Alice", "Bob");
        sn.addFriendship("Alice", "Charlie");

        sn.displayNetwork();

        System.out.println("Friends of Alice: " + sn.getFriends("Alice"));
    }
}
