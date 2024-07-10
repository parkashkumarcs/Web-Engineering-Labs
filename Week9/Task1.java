package Week9;

class Task1 {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Task1(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public int getFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int index = front;
        for (int i = 0; i < size; i++) {
            System.out.print(queue[index] + " ");
            index = (index + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task1 queue = new Task1(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

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
