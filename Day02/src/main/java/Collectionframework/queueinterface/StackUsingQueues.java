package Collectionframework.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push operation (O(1))
    public void push(int x) {
        q1.add(x);
    }

    // Pop operation (O(N))
    public int pop() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");

        // Move all elements except last to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // Last element is the one to pop
        int topElement = q1.poll();

        // Swap queues (q2 becomes q1)
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Top operation (O(N))
    public int top() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");

        // Move all elements except last to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // Last element (top of stack)
        int topElement = q1.peek();
        q2.add(q1.poll());

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top Element: " + stack.top());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top Element: " + stack.top());
    }
}
