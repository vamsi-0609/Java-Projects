package Tasks;

import java.util.*;
public class StackUndo {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		
		s.add("Write");
		s.add("Delete");
		s.add("Insert");
		
		System.out.println("Complete actions are: "+ s);
		System.out.println("The last action performed is " + s.peek());
		s.pop();
		s.pop();
		System.out.println("The remaining actions in the stacka are: " + s);
		
		
		
	}

}
