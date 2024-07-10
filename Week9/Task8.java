package Week9;

import java.util.Stack;

class QueueUsingStacks<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(T item) {
        stack1.push(item);
    }

    public T dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.isEmpty() ? null : stack2.pop();
    }

    public T peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.isEmpty() ? null : stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public static void main(String[] args) {
        QueueUsingStacks<Integer> queue = new QueueUsingStacks<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(60);

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Size: " + queue.size());

        queue.enqueue(40);
        queue.enqueue(50);

        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.dequeue());
        }
    }
}
