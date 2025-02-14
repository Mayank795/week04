package Collectionframework.queueinterface;

import java.util.Arrays;

class CircularBuffer {
    private int[] buffer;
    private int front, rear, size, capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Enqueue (Insert Element)
    public void enqueue(int value) {
        if (size == capacity) {
            // Overwrite oldest element
            front = (front + 1) % capacity;
        } else {
            if (front == -1) front = 0;
            size++;
        }

        rear = (rear + 1) % capacity;
        buffer[rear] = value;
    }

    // Dequeue (Remove Oldest Element)
    public int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Buffer is empty");
        }
        int value = buffer[front];
        front = (front + 1) % capacity;
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return value;
    }

    // Get Buffer Contents
    public void display() {
        if (size == 0) {
            System.out.println("Buffer is empty");
            return;
        }

        System.out.print("Buffer: ");
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(buffer[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.enqueue(1);
        cb.enqueue(2);
        cb.enqueue(3);
        cb.display();

        cb.enqueue(4);
        cb.display();

        cb.dequeue();
        cb.display();
    }
}

