package com.sai.datastructures;

public class ArrayStack {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] array;
    private int top;

    // Constructor to initialize the stack with a default capacity
    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    // Constructor to initialize the stack with a given capacity
    public ArrayStack(int capacity) {
        array = new int[capacity];
        top = -1; // Initialize top to -1 when the stack is empty
    }

    // Push operation
    public void push(int item) {
        if (top == array.length - 1) {
            // Stack is full, need to resize the array (or throw an exception)
            resize();
        }
        array[++top] = item; // Increment top and then add the item to the updated top position
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top--]; // Return the element at the top and then decrement top
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top]; // Return the element at the top without removing it
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get the size of the stack
    public int size() {
        return top + 1;
    }

    // Resize the array to double its current capacity
    private void resize() {
        int newCapacity = array.length * 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    // Display the elements of the stack
   public void display(){
        for(int i=0;i<top+1;i++){
            System.out.println("elements in the stack : "+  array[i]);
        }
   }

    public static void main(String[] args) {
        // Creating a stack
        ArrayStack stack = new ArrayStack();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Displaying the stack
        stack.display();

        // Popping an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Displaying the updated stack
        stack.display();

        // Peeking at the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Displaying the size of the stack
        System.out.println("Size of the stack: " + stack.size());

        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
