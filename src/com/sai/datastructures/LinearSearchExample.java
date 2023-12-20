package com.sai.datastructures;
public class LinearSearchExample {

    // Linear search function
    static int linearSearch(int target, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        // Example array
        int[] dataArray = {10, 23, 7, 14, 55, 42, 31};

        // Element to search
        int targetElement = 42;

        // Perform linear search
        int resultIndex = linearSearch(targetElement, dataArray);

        // Display the result
        if (resultIndex != -1) {
            System.out.println("Element " + targetElement + " found at index " + resultIndex);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }
}

