package com.sai.datastructures;

public class ArrayExample {
    private final int[] array;
    private int size;
    private final int capacity;

    // Constructor to initialize the array with a given capacity
    public ArrayExample(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = 0;
    }

    // Method to insert an element into the array
    public void insert(int element) {
        // Check if there is space in the array
        if (size < capacity) {
            // Insert the element at the end of the array
            array[size] = element;
            // Increment the size
            size++;
            System.out.println("Element " + element + " inserted at index " + (size - 1));
        } else {
            System.out.println("Array is full. Cannot insert element.");
        }
    }

    // Method to search for an element in the array
    public int search(int target) {
        // Iterate through the array to find the target element
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    // Method to update an element at a specific index in the array
    public void update(int index, int newValue) {
        // Check if the index is valid
        if (index >= 0 && index < size) {
            // Update the element at the specified index
            array[index] = newValue;
            System.out.println("Element at index " + index + " updated to " + newValue);
        } else {
            System.out.println("Invalid index. Cannot update element.");
        }
    }

    // Method to delete an element at a specific index in the array
    public void delete(int index) {
        // Check if the index is valid
        if (index >= 0 && index < size) {
            // Shift elements to the left to fill the gap
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            // Decrease the size
            size--;
            System.out.println("Element at index " + index + " deleted.");
        } else {
            System.out.println("Invalid index. Cannot delete element.");
        }
    }

    // Method to traverse and display all elements in the array
    public void traversal() {
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Main method to demonstrate the usage of the ArrayExample class
    public static void main(String[] args) {
        // Create an instance of ArrayExample with a capacity of 5
        ArrayExample arrayExample = new ArrayExample(5);

        // Insert some elements into the array
        arrayExample.insert(10);
        arrayExample.insert(20);
        arrayExample.insert(30);


        // Display the array
        arrayExample.traversal();

        // Search for an element in the array
        int searchResult = arrayExample.search(20);
        if (searchResult != -1) {
            System.out.println("Element 20 found at index " + searchResult);
        } else {
            System.out.println("Element 20 not found.");
        }

        // Update an element in the array
        arrayExample.update(1, 25);
        arrayExample.traversal();

        // Delete an element at a specific index
        arrayExample.delete(0);
        arrayExample.traversal();
    }
}
