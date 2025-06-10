package Tasks;
import java.util.*;

public class ArrayListAdventure {

	public static void main(String[] args) {
		ArrayList<String> cc = new ArrayList<String>();
		cc.add("Spider Man");
		cc.add("Gwen");
		cc.add("Motu");
		cc.add("patlu");
		cc.add("Ben");
		
		cc.remove(0);
		System.out.println(cc);
		cc.set(1, "Genifer");
		System.out.println(cc);
		
		Collections.sort(cc);
		System.out.println(cc);
		
		for(String s: cc) {
			System.out.println(s);
		}
	}

}
