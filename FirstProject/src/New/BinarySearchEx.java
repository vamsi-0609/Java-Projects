package Tests;
import java.util.*;

public class BinarySearchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s_arr[]  = {1,2,3,4,5,6,7,8,9};
		int left = 0;
		int right = s_arr.length-1;
		int mid = 0;
		boolean flag = true;
		
		System.out.print("Enter the target element: ");
		
		int target = sc.nextInt();		
		while(left <= right) {
			mid = (left + right) / 2;
			if(s_arr[mid] == target) {
				System.out.println("Target found at index: " + mid);
				flag = false;
				break;
			}
			else if(s_arr[mid] < target){
				left = mid + 1;
				
			}
			else {
				right = mid-1;
				
			}
			
		}
		
		
		if(flag) {
			System.out.println("Thhe element is not found");
		}
		
		sc.close();
		

	}

}
