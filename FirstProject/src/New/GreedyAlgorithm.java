
public class GreedyAlgorithm {
    static class Transport {
        String name;
        int time;
        int cost;

        Transport(String name, int time, int cost) {
            this.name = name;
            this.time = time;
            this.cost = cost;
        }
    }
    public static void main(String[] args) {
        Transport[] options = {
                new Transport("Flight", 1, 5000),
                new Transport("car", 5, 3000),
                new Transport("Bike", 6, 2500),
                new Transport("Bus", 7, 1500)

        };

        Transport best = options[0];
        for (Transport option : options) {
            if (option.cost < best.cost) {
                best = option;
            }
        }
        System.out.println("The best option to reach to the destination with less cost is: ");
        System.out.println("Transport: " + best.name +" | Time: " + best.time + " Hours |" + " Cost: " + best.cost + "RS");



    }
}
