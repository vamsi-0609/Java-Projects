package New;

class ArrayReversal{
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for(int i = 0, j = arr.length-1; i <= j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println();
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
}