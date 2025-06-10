package Tasks;
import java.util.*;
public class IceCreamShop {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<String>();
		que.add("Mike");
		que.add("Harry");
		que.add("Alice");
		que.add("Joe");
		que.add("Gruk");
		
		System.out.println("All the Kids in the queue"+ que);
		System.out.println("First kid in the queue: " + que.peek());
		System.out.println("Serving the icecream to kid: " + que.poll());
		que.add("Rookie");
		System.out.println("Array List after adding the value: " + que);
		
		
		
		
	}

}
