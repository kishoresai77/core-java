package com.sai.datastructures;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        // Iterate over different sizes of subarrays, doubling the size in each iteration.
        for (int currSize = 1; currSize < n; currSize *= 2) {
            // Iterate over the array, merging subarrays of the current size.
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {
                // Calculate the middle and right end indices of the current subarray.
                int mid = Math.min(leftStart + currSize - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);

                // Merge the two halves of the current subarray.
                merge(arr, temp, leftStart, mid, rightEnd);
            }
        }
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        // Merge the two halves into the temporary array.
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left half.
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right half.
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy the merged elements back to the original array.
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array:");
        printArray(arr);

        // Call the mergeSort method to perform iterative merge sort.
        mergeSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        // Print the elements of the array.
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
