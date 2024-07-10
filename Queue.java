public class Queue {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class myQue{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){
            Node newNode=new Node(data);
            if(tail==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;

        }
        public static int remove(){

            int front=head.data;
            if(head==tail){
                tail=null;
            }
            head=head.next;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        myQue que=new myQue();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(7);
        que.add(9);
    
        while (!que.isEmpty()) {
            System.out.println(que.peek());
            que.remove();
        }
    }
}
