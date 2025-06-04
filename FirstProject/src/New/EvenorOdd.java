package Tests;
import java.util.*;
public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"Even", "Odd"};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check: ");
		int num = sc.nextInt();
		
		//Without using if else
		System.out.println("----------Without using if else----------------------");
		System.out.println(name[num%2]);
		
		//With using if else
		System.out.println("---------With using if else--------------------------");
		if (num % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		sc.close();
		
		
	}

}
