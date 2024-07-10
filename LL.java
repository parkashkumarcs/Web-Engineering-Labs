public class LL {
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node insert(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        return newNode;
    }
    public Node insertLast(int data){
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
        return newNode;
    }
    public Node insertPos(Node node, int newVal, int position){
       
        if(position<1){
            System.out.println("Not Exist such a position!");
        }
        if(node==null && position>1){
            System.out.println("position existed");
            return node;
        }
       
        if(node==null && position==1){
            Node newNode=new Node(newVal);
            return newNode;
        }
        
        if(position==1){
            Node newNode=new Node(newVal);
            newNode.next=node;
            return newNode;
        }
        
        Node firsNode=node;
        Node prNode=null;
        while (node!=null && position>1) {
            prNode=node;
            node=node.next;
            position--;
        }
        if(position!=1){
            System.out.println("doesn't exist!");
            return firsNode;
        }
        Node newNode=new Node(newVal);
        prNode.next=newNode;
        newNode.next=node;

        return firsNode;
    }
    public void display(){
        Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data+"--> ");
            currNode=currNode.next;
            
        }
    }
    public static void main(String[] args) {
        LL node=new LL();
        Node head;
        /*
        head=node.insert(4);
        head=node.insert(5);
        head=node.insert(6);
        head=node.insert(7);
        head=node.insert(8);
         */
        head=node.insertLast(1);
        head=node.insertLast(2);
        head=node.insertLast(3);
        head=node.insertLast(4);
        head=node.insertLast(5);
        //node.insertPos(head, 9, 2);
        node.display();
    }
}
