package Week8;

class Task4 {

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

    public Task4() {
        head = null;
        tail = null;
    }

    public void addToFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addToBack(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void createCycle(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index must be non-negative");
        }
        if (index >= size()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        
        Node current = head;
        Node cycleStart = null;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if (currentIndex == index) {
            cycleStart = current;
        }

        Node lastNode = head;
        while (lastNode != null && lastNode.next != null) {
            lastNode = lastNode.next;
        }

        if (cycleStart != null) {
            lastNode.next = cycleStart;
        }
    }

    public boolean hasCycle() {
        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
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
        Task4 list = new Task4();
        list.addToBack(1);
        list.addToBack(2);
        list.addToBack(3);
        list.addToBack(4);
        list.createCycle(1);

        System.out.println("Does the list have a cycle? " + list.hasCycle());
    }
}
