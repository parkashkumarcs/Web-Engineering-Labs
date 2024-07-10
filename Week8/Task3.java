package Week8;

class Task3 {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Task3() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addToFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addToBack(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int getFrontItem() {
        if (head != null) {
            return head.data;
        }
        throw new RuntimeException("List is empty");
    }

    public int getBackItem() {
        if (tail != null) {
            return tail.data;
        }
        throw new RuntimeException("List is empty");
    }

    public void removeFrontItem() {
        if (head != null) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
        } else {
            throw new RuntimeException("List is empty");
        }
    }

    public void removeBackItem() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        if (head.next == null) {
            head = tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = null;
            tail = current;
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
        if (head == null) {
            return;
        }
        if (head.data == key) {
            removeFrontItem();
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }
        if (current.next != null) {
            if (current.next == tail) {
                tail = current;
            }
            current.next = current.next.next;
            size--;
        }
    }

    public boolean isListEmpty() {
        return head == null;
    }

    public void addKeyBeforeNode(int key, int beforeData) {
        if (head == null) {
            return;
        }
        if (head.data == beforeData) {
            addToFront(key);
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != beforeData) {
            current = current.next;
        }
        if (current.next != null) {
            Node newNode = new Node(key);
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    public void addKeyAfterNode(int key, int afterData) {
        Node current = head;
        while (current != null && current.data != afterData) {
            current = current.next;
        }
        if (current != null) {
            Node newNode = new Node(key);
            newNode.next = current.next;
            current.next = newNode;
            if (current == tail) {
                tail = newNode;
            }
            size++;
        }
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
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        if (index == size - 1) {
            tail = current;
        }
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
        Task3 list = new Task3();
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
    }
}
