package Week8;

class Task5{

    private class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Task5() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addToFront(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addToBack(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public int getFrontItem() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        return head.data;
    }

    public int getBackItem() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        return tail.data;
    }

    public void removeFrontItem() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeBackItem() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public boolean find(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void remove(int key) {
        if (isEmpty()) {
            return;
        }
        if (head.data == key) {
            removeFrontItem();
            return;
        }
        if (tail.data == key) {
            removeBackItem();
            return;
        }
        Node current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }
        if (current != null) {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertAt(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        if (index == 0) {
            addToFront(data);
            return;
        }
        if (index == size) {
            addToBack(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void removeFrom(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        if (index == 0) {
            removeFrontItem();
            return;
        }
        if (index == size - 1) {
            removeBackItem();
            return;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
    }

    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task5 list = new Task5();
        list.addToBack(1);
        list.addToBack(2);
        list.addToBack(3);
        list.addToBack(4);
        list.printAll();
        list.insertAt(2, 5);
        list.printAll(); 

        System.out.println("Element at index 3: " + list.get(3));
        list.removeFrom(1);
        list.printAll(); 
        System.out.println("Is the list empty? " + list.isEmpty());

        while (!list.isEmpty()) {
            list.removeFrontItem();
        }
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}
