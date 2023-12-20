package com.sai.datastructures;

public class BinarySearchExample {

    // Binary search function
    static int binarySearch(int target, int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at the middle
            if (array[mid] == target) {
                return mid;
            }

            // If the target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }

            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target not present in the array
        return -1;
    }

    public static void main(String[] args) {
        // Example sorted array
        int[] sortedArray = {5, 12, 17, 23, 31, 42, 55, 67, 89};

        // Element to search
        int targetElement = 31;

        // Perform binary search
        int resultIndex = binarySearch(targetElement, sortedArray);

        // Display the result
        if (resultIndex != -1) {
            System.out.println("Element " + targetElement + " found at index " + resultIndex);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }
}
