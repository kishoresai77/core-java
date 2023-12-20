package com.sai.datastructures;


public class QuickSortExample {

    // Quick Sort function
    static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array, and get the index of the pivot element
            int pivotIndex = partition(array, low, high);

            // Recursively sort the subarrays before and after the pivot
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Partition function to find the correct position of the pivot
    static int partition(int[] array, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = array[high];

        // Index of the smaller element
        int i = low - 1;

        // Traverse through the array
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;

                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i+1] and array[high] (put the pivot in its correct position)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the index of the pivot element
        return i + 1;
    }

    public static void main(String[] args) {
        // Example array
        int[] dataArray = {10, 7, 8, 9, 1, 5};

        // Display the original array
        System.out.println("Original Array: " + java.util.Arrays.toString(dataArray));

        // Perform Quick Sort
        quickSort(dataArray, 0, dataArray.length - 1);

        // Display the sorted array
        System.out.println("Sorted Array: " + java.util.Arrays.toString(dataArray));
    }
}
