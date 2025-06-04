package Tests;

import java.util.*;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeMap is the part of java Collections FrameWork and it implements the map interface using a Red-Black-Tree
		//It stores key value pairs and maintains the keys in sorted order
		TreeMap<Integer, String> pb = new TreeMap<Integer, String>();
		pb.put(709385, "John");
		pb.put(405678, "ricky");
		pb.put(708544, "micky");
		pb.put(200954, "Jon");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the phone number: ");
		int roll = sc.nextInt();
		
		System.out.println(pb.containsKey(roll));
		System.out.println(pb.get(roll));
		
		System.out.println(pb);
		
		sc.close();
		
		

	}

}
