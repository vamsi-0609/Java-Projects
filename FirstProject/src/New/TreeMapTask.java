package Tasks;

import java.util.*;

public class TreeMapTask {
	public static void main(String[] args) {
	
		TreeMap<String, String> cap = new TreeMap<String, String>();
		cap.put("India", "New Delhi");
		cap.put("USA", " Washington");
		cap.put("Germany", "Berlin");
		cap.put("Japan", "Tokyo");
		cap.put("India", "Delhi");
		
		System.out.println("The First key method: " + cap.firstKey());
		System.out.println("The Last key method: " + cap.lastKey());
		System.out.println("The Higer Key: "+ cap.higherKey("USA"));
		System.out.println("The Lower Key: "+ cap.lowerKey("Japan"));
		
		for(Map.Entry<String, String> mp : cap.entrySet()) {
			System.out.println(mp.getKey() + " - " + mp.getValue());
		}
	}
}
