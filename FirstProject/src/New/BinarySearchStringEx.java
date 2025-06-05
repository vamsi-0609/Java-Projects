package Tasks;
import java.util.*;
public class BinarySearchStringEx {
	//Task 1 - To Find the index of the name in the array using BinaySearch
	public static int BinSearch(String arr[], String target) {
		int left = 0;
		int right = arr.length - 1;
		int mid = 0;
		int final_mid = -1;
		
		while(left <= right) {
			mid = (left + right) / 2;
			
			if(arr[mid].equals(target)) {
				final_mid = mid;
				right = mid - 1;
			}
			else if(arr[mid].compareTo(target) < 0) {
				left = mid + 1;
				
			}
			else {
				right = mid - 1;
			}
			
		}
		
		return final_mid;
	}
	//Task 2 - To find the square root of a number using BinarySearch
	public static int square_root(int n) {
		if(n < 2) return n;
		
		int left = 1;
		int right = n / 2;
		int ans = 0;
		
		while(left <= right) {
			int mid = left + (right - left) / 2;
			long square = (long) mid * mid;
			
			if(square == n) {
				return mid;
			}
			else if(square < n) {
				ans = mid;
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		
		return ans;
				
				
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = {"praveen", "saketh", "vamsi", "vishnu"};
		System.out.print("Enter the name to find its index: ");
		String tar = sc.nextLine();
		
		if (BinSearch(names, tar) == -1) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at " + BinSearch(names, tar));
		}
		
		//Task 2
		System.out.print("Enter the number to find the square root:  ");
		int num = sc.nextInt();
		System.out.println(square_root(num));
		
		sc.close();

		
	}
}
