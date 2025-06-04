package New;

import java.util.*;

public class ALLLHMHS {
	//ArrayList, LinkedList, HashMap, HashSet
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		LinkedList<String> ll = new LinkedList<String>();
		HashMap<Integer, String> hm = new HashMap<>();
		HashSet<String> hs = new HashSet<String>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			String s = sc.nextLine();
			al.add(s);
			ll.add(s);
			hm.put(i,s);
			hs.add(s);
			
		}
		Collections.sort(al);
		System.out.println(al);
		System.out.println(ll);
		System.out.println(hm);
		System.out.println(hs);
		sc.close();
		
		
	}
}
