package com.sai.datastructures;

public class InsertionSortExample {

    // Insertion Sort function
    static void insertionSort(int[] array) {
        int n = array.length;

        // Traverse through the array
        for (int i = 1; i < n; ++i) {
            // Select the key (element to be compared)
            int key = array[i];

            // Move elements of array[0..i-1] that are greater than key to one position ahead of their current position
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] dataArray = {12, 11, 13, 5, 6};

        // Display the original array
        System.out.println("Original Array: " + java.util.Arrays.toString(dataArray));

        // Perform Insertion Sort
        insertionSort(dataArray);

        // Display the sorted array
        System.out.println("Sorted Array: " + java.util.Arrays.toString(dataArray));
    }
}


