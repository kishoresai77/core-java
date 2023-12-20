package com.sai.datastructures;


public class BubbleSortExample {

    // Bubble Sort function
    static void bubbleSort(int[] array) {
        int n = array.length;

        // Traverse through the array
        for (int i = 0; i < n - 1; i++) {

            // Last i elements are already sorted, so we don't need to check them
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (array[j] > array[j + 1]) {
                    // Swap if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] dataArray = {64, 34, 25, 12, 22, 11, 90};

        // Display the original array
        System.out.println("Original Array: " + java.util.Arrays.toString(dataArray));

        // Perform Bubble Sort
        bubbleSort(dataArray);

        // Display the sorted array
        System.out.println("Sorted Array: " + java.util.Arrays.toString(dataArray));
    }
}
