package com.sai.datastructures;

// Node class represents a node in the linked list
class Node {
    int data;       // Data stored in the node
    Node next;      // Reference to the next node in the linked list

    // Constructor to create a new node with given data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class represents a linked list and contains basic operations
 class LinkedList {
    private Node head;  // Reference to the head (first node) of the linked list

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);

        // If the linked list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse to the end of the list and insert the new node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        System.out.println("Element " + data + " inserted at the end of the linked list.");
    }

    // Method to search for a given element in the linked list
    public boolean search(int target) {
        Node current = head;

        // Traverse the linked list to find the target element
        while (current != null) {
            if (current.data == target) {
                System.out.println("Element " + target + " found in the linked list.");
                return true;
            }
            current = current.next;
        }

        System.out.println("Element " + target + " not found in the linked list.");
        return false;
    }

    // Method to delete a node with a given value from the linked list
    public void delete(int data) {
        Node current = head;
        Node prev = null;

        // Traverse the linked list to find the node with the target element
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        // If the node is found, remove it from the linked list
        if (current != null) {
            if (prev == null) {
                // If the node to be deleted is the head, update the head
                head = current.next;
            } else {
                // Otherwise, bypass the node to be deleted
                prev.next = current.next;
            }

            System.out.println("Element " + data + " deleted from the linked list.");
        } else {
            System.out.println("Element " + data + " not found in the linked list. Cannot delete.");
        }
    }

    // Method to traverse and display all elements in the linked list
    public void traversal() {
        Node current = head;

        System.out.print("Linked list elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to demonstrate the usage of the LinkedList class
    public static void main(String[] args) {
        // Create an instance of the LinkedList class
        LinkedList linkedList = new LinkedList();

        // Insert some elements into the linked list
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.traversal();

        // Search for an element in the linked list
        linkedList.search(10);

        // Delete an element from the linked list
        linkedList.delete(40);
        linkedList.traversal();
    }
}
