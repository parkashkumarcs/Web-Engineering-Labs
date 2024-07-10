package Week9;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;

    Stack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top != null) {
            newNode.next = top;
        }
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public int peek() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

class Queue {
    private Node front, rear;

    Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public int peek() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack peek: " + stack.peek());

        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Queue dequeue: " + queue.dequeue());
        System.out.println("Queue peek: " + queue.peek());
    }
}

