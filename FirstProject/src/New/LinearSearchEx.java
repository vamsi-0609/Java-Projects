package Tests;
import java.util.*;

public class LinearSearchEx {
	public static void main(String[] args) {
		int []arr = {11,23,12,43,56,4,23,65};
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		System.out.print("Enter the number to search from array: ");
		int num = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				flag = false;
				System.out.println("The Searchable element " + num +" is found at index: "+ i);
		
			}
		}
		
		if(flag) {
			System.out.println("The element is not found");
		}
		
		sc.close();
	}
}
