package Sorting;
import java.util.*;;

public class QuickSortEx {

    static Random rand = new Random();

    public static void quickSort(int[] arr, int low, int high) {
        while (low < high) {
            // Randomized pivot to avoid worst-case
            int pivotIndex = partition(arr, low, high);

            // Tail recursion optimization: recurse on smaller half first
            if (pivotIndex - low < high - pivotIndex) {
                quickSort(arr, low, pivotIndex - 1);
                low = pivotIndex + 1;
            } else {
                quickSort(arr, pivotIndex + 1, high);
                high = pivotIndex - 1;
            }
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // Random pivot to avoid worst-case
        int pivotIndex = rand.nextInt(high - low + 1) + low;
        swap(arr, pivotIndex, high);
        int pivot = arr[high];

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 34, 7, 23, 32, 5, 62 };
        System.out.println("Before sorting:");
        for (int i : arr) System.out.print(i + " ");

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter sorting:");
        for (int i : arr) System.out.print(i + " ");
    }
}
