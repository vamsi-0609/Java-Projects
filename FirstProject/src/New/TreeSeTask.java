package Tests;
import java.util.*;

public class TreeSeTask {
	public static void main(String[] args) {
		
		//Task 3 
		TreeSet<Integer> books = new TreeSet<Integer>();
		
		books.add(5002);
		books.add(4998);
		books.add(5005);
		books.add(4999);
		books.add(5001);
		
		System.out.println(books);
		System.out.println("First method implementation: ");
		System.out.println(books.first());
		
		System.out.println("last method implementation: ");
		System.out.println(books.last());
		
		System.out.println("Higer and lower methods implementation: ");
		System.out.println("Higer: "+books.higher(4999) + " Lower: " + books.lower(5005));
		
		//Task 4
		TreeSet<String> enames = new TreeSet<String>(Collections.reverseOrder());
		enames.add("vamsi");
		enames.add("krishna");
		enames.add("vishnu");
		enames.add("saketh");
		enames.add("praveen");
		
		System.out.println("The Final sorted Tree set in descending order: ");
		System.out.println(enames);
		
		//Task 5
		TreeSet<String> gadgets = new TreeSet<String>();
		gadgets.add("Mouse");
		gadgets.add("CPU");
		gadgets.add("KeyBoard");
		gadgets.add("Monitor");
		gadgets.add("Webcam");
		
		System.out.println("All the gadgets are: " + gadgets);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the gadget to find / search: ");
		String name = sc.nextLine();
		if(gadgets.contains(name)) {
			System.out.println("The gadget "+name+" is available");
		}
		else {
			System.out.println("The gadgets is not available");
		}
		sc.close();		
		
		
	}

}
