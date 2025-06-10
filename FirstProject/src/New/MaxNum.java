package Tasks;

import java.util.*;
public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements to store in array: ");
		int []n = new int[5];
		for(int i= 0; i < 5; i++) {
			n[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int num: n) {
			if (num > max) {
				max = num;
			}
		}
		
		System.out.println("The max number in the array is: "+ max);
		sc.close();

	}

}
