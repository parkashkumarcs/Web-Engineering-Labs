public class SinglyList{
    Node head;
    public class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int count(){
        if(head==null){
            return 0;
        }
        int count=0;
        Node current=head;
        while (current!=null) {
            count++;
            current=current.next;
            
        }
        return count;
    }
    public void insertNode(int node){
        Node newNode=new Node(node);
        newNode.next=head;
        head=newNode;
    }
    public void display(){
        Node current=head;
        while (current!=null) {
            System.err.print(current.data+"--> ");
            current=current.next;            
        }
        System.err.println("None");
    }

    public static void main(String[] args) {
        SinglyList obj=new SinglyList();
        obj.insertNode(1);
        obj.insertNode(2);
        obj.display();
        obj.insertNode(3);
        obj.insertNode(4);
        obj.insertNode(5);
        obj.display();
        int count=obj.count();
        System.err.println("Length  of list: "+count);
    }
    
}
