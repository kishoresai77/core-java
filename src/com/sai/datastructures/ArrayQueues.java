package com.sai.datastructures;

public class ArrayQueues {
    public static class ArrayQueue {
        private static final int DEFAULT_CAPACITY = 10;
        private int[] array;
        private int front;
        private int rear;

        // Constructor to initialize the queue with a default capacity
        public ArrayQueue() {
            this(DEFAULT_CAPACITY);
        }

        // Constructor to initialize the queue with a given capacity
        public ArrayQueue(int capacity) {
            array = new int[capacity];
            front = 0;
            rear = -1; // Initialize rear to -1 when the queue is empty
        }

        // Enqueue operation
        public void enqueue(int item) {
            if (isFull()) {
                System.out.println("Queue is full. Resizing...");
                resize();
            }
            array[++rear] = item; // Increment rear and then add the item to the updated rear position
        }

        // Dequeue operation
        public int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return array[front++]; // Return the element at the front and then increment front
        }

        // Peek operation
        public int peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return array[front]; // Return the element at the front without removing it
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return front > rear;
        }

        // Check if the queue is full
        public boolean isFull() {
            return rear == array.length - 1;
        }

        // Get the size of the queue
        public int size() {
            return rear - front + 1;
        }

        // Resize the array to double its current capacity
        private void resize() {
            int newCapacity = array.length * 2;
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, front, newArray, 0, size());
            array = newArray;
            front = 0;
            rear = size() - 1;
        }

        // Display the elements of the queue
        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("[");
            for (int i = front; i <= rear; i++) {
                result.append(array[i]);
                if (i < rear) {
                    result.append(", ");
                }
            }
            result.append("]");
            return result.toString();
        }

        public void display() {
            for (int i = front; i <= rear; i++) {
                System.out.println(array[i] + " ");
            }

        }

        public static void main(String[] args) {
            // Creating a queue
            ArrayQueue queue = new ArrayQueue();

            // Enqueueing elements
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.display();
            System.out.println("Size of the queue: " + queue.size());

            // Displaying the queue
            System.out.println("Queue: " + queue);

            // Dequeueing an element
            int dequeuedElement = queue.dequeue();
            System.out.println("Dequeued element: " + dequeuedElement);

            queue.display();

            // Displaying the updated queue
            System.out.println("Queue after dequeue operation: " + queue);

            // Peeking at the front element of the queue
            int frontElement = queue.peek();
            System.out.println("Front element: " + frontElement);

            int dequeuedElement1 = queue.dequeue();
            System.out.println("Dequeued element: " + dequeuedElement1);
            queue.display();

            // Displaying the size of the queue
            System.out.println("Size of the queue: " + queue.size());

            // Checking if the queue is empty
            System.out.println("Is the queue empty? " + queue.isEmpty());
        }
    }

}
