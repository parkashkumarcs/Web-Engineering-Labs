package Week8;

public class Task1 {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    public Task1() {
        head = null;
    }
    public void addToFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    

    public int getFrontItem() {
        if (head != null) {
            return head.data;
        }
        throw new RuntimeException("List is empty");
    }
    public void removeFrontItem() {
        if (head != null) {
            head = head.next;
        } else {
            throw new RuntimeException("List is empty");
        }
    }
    public void addToBack(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public int getBackItem() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }
    public void removeBackItem() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
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
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
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
        }
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
        Task1 list = new Task1();
        list.addToFront(3);
        list.addToFront(2);
        list.addToFront(1);
        list.printAll();
        list.addToBack(4);
        list.addToBack(5);
        list.printAll();
        System.out.println("Front item: " + list.getFrontItem());
        System.out.println("Back item: " + list.getBackItem());
        list.removeFrontItem();
        list.printAll();
        list.removeBackItem();
        list.printAll();
        System.out.println("Is 3 present? " + list.find(3));
        System.out.println("Is 6 present? " + list.find(6));
        list.remove(3);
        list.printAll();
        list.addKeyBeforeNode(1, 2);
        list.printAll();
        list.addKeyAfterNode(3, 2);
        list.printAll();
        System.out.println("Is list empty? " + list.isListEmpty());
        list.removeFrontItem();
        list.removeFrontItem();
        list.removeFrontItem();
        list.removeFrontItem();
        System.out.println("Is list empty? " + list.isListEmpty());
    }
}
