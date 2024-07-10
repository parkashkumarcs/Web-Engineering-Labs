package Week9;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListQueue {
    private Node front;
    private Node rear;
    private int size;

    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return value;
    }

    public int getFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return false;
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(11);
        queue.enqueue(24);
        queue.enqueue(35);
        queue.enqueue(46);
        queue.enqueue(57);

        queue.printAll();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.printAll();

        System.out.println("Front: " + queue.getFront());

        queue.enqueue(6);
        queue.printAll();

        System.out.println("Size: " + queue.getSize());
        System.out.println("IsEmpty: " + queue.isEmpty());
        System.out.println("IsFull: " + queue.isFull());
    }
}
