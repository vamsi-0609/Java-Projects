package Sorting;

import java.util.Arrays;

public class MergeSortEx {

    void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] l = new int[n1];
        int[] r = new int[n2];

        for (int i = 0; i < n1; i++)
            l[i] = arr[left + i]; // corrected

        for (int j = 0; j < n2; j++)
            r[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (l[i] <= r[j]) {
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }
        
        
        while (i < n1) {
            arr[k++] = l[i++];
        }

        while (j < n2) {
            arr[k++] = r[j++];
        }
    }

    void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 6, 3 };
        MergeSortEx ob = new MergeSortEx();
        ob.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
