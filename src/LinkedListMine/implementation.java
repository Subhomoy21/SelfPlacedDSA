package LinkedListMine;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedList{ // yeh ek entire data structure hai!
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
             if(head==null){ // empty list
                head = temp;
             }
             else{ // non-empty list
                 tail.next = temp;
             }
            tail = temp;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        int size(){
            int size = 0;
            Node temp = head;
            while(temp!=null){
                temp = temp.next;
                size++;
            }
            return size;
        }
        void insertAtBegin(int val){
            Node temp = new Node(val);
            if(head == null){ // empty list
                head = temp;
                tail = temp;
                // head = tail = temp
            }
            else{ // non-empty list
                temp.next = head;
                head = temp;
            }
        }
    }
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.insertAtBegin(10);
        l.insertAtEnd(4);
        l.insertAtEnd(5);
        l.insertAtEnd(6);
        l.display();
        System.out.println("\n" + l.size());
        l.insertAtEnd(12);
        l.display();
        System.out.println();
        l.insertAtBegin(65);
        l.display();
    }
}
