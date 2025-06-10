package Tasks;

import java.util.HashMap;
import java.util.Map;

public class GroceryBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Apples", 40);
		hm.put("Milk", 35);
		hm.put("Bread", 20);
		hm.put("Butter", 60);
		hm.put("Jam", 25);
		
		System.out.println("The grocerys are : "+ hm);
		int total = 0;
		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			total += entry.getValue();
		}
		
		System.out.println("The total cost of the items : " + total);
		hm.put("Cheese", 30);
		System.out.println(hm);

	}

}
