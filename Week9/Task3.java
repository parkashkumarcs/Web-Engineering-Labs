package Week9;

class MyStack {
    private int[] stack;
    private int top;
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        stack[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    public int getSize() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.printAll();

        System.out.println("Popped: " + stack.pop());
        stack.printAll();

        System.out.println("Peek: " + stack.peek());

        stack.push(6);
        stack.printAll();

        System.out.println("Size: " + stack.getSize());
        System.out.println("IsEmpty: " + stack.isEmpty());
        System.out.println("IsFull: " + stack.isFull());
    }
}
