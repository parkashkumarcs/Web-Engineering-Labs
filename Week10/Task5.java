package Week10;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Task5{
    public static void printLinkedList(Node head) {
        if (head == null) {
            return;
        }

        System.out.print(head.data + " ");
        printLinkedList(head.next);
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(6);
        head.next.next = new Node(4);
        System.out.print("Linked List nodes: ");
        printLinkedList(head);
    }
}

