package Tests;
import java.util.*;

class AL{
	AL(){
		System.out.println("ArrayList");
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(12);
		al.add(123);
		al.add(1234);
		System.out.println(al);
	}
}

class LL extends AL{
	LL(){
		System.out.println("Linked List");
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("vamsi");
		ll.add("krishna");
		ll.add("pandu");
		ll.add("narayana");
		
		System.out.println(ll);
		
	}
}

class HM extends LL{
	HM(){
		System.out.println("Hash Map");
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(3384, "vamsi");
		hm.put(9845, "Krishna");
		hm.put(4523, "Sri hari");
		System.out.println(hm);
		
	}
}

class HS extends HM{
	HS(){
		System.out.println("Hash Set");
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(23);
		hs.add(89);
		hs.add(45);
		System.out.println(hs);
		
	}
}
public class AllList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HS h =  new HS();
		h.getClass();

	}

}
