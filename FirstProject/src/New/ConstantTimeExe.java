package DAY12;

public class ConstantTimeExe {
	public static void main(String[] args) {
		int []arr = {1, 2, 3, 4, 5, 5, 6, 7, 9, 5, 2, 5, 3, 2, 5, 3, 2, 5, 3, 2, 4};
		System.out.println(arr[0] + " "+ arr[4]);
		System.out.println(arr[7] + " "+ arr[1]);
		
		for(int ele: arr) {
			System.out.print(ele +" ");
		}
	}

}
