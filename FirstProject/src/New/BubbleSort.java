package Sorting;

import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Bubble sort checks 2 items next to each other if the one on the left is bigger it swaps them
		//It keeps doing this continously until all the big elements are swapped to the right most of the array
		int[] numbers = {3,1,4,6,2,7,3,2,7,7,2,};
		System.out.println("ArrayList before sorting the value : ");
		for(int s : numbers) {
			System.out.print(s + " ");
		}
		
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j = 0; j < numbers.length-i-1; j++) {
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		
		
		System.out.println("\n\nArrayList after sorting the value : ");
		for(int s : numbers) {
			System.out.print(s + " ");
		}
		
		//Sorting names using bubble sort
		String names[] = {"vamsi", "krishna", "saketh", "praveen", "kushal"};
		System.out.println("\nArray before sorting: ");
		for(String name: names) {
			System.out.print(name + " ");
		}
		
		//Sorting the name array
		for(int i = 0; i < names.length; i++) {
			for(int j = 0; j < names.length-i-1; j++) {
				if(names[j].compareTo(names[j+1]) > 0) {
					String temp = names[j];
					names[j] = names[j+1];
					names[j+1] = temp;
				}
				
			}
		}
		
		System.out.println("\nArray before sorting: ");
		for(String name: names) {
			System.out.print(name + " ");
			
		}
		
		//Reverse an array
		System.out.println("Reversing an array: ");
		int []arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		for(int i = 0, j = arr.length - 1; i <= j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println("array after reversing: ");
		System.out.println(Arrays.toString(arr));
		
		
		//Reverse a words in a string
		String sent = "hello this is a java program";
		System.out.println("String before reversal: " + sent);
		String []ar=  sent.split(" ");
		System.out.println("String after reversal: ");
		for(int i = ar.length-1; i >=0; i--) {
			System.out.print(ar[i] + " ");
		}
		
		
		

	}

}
