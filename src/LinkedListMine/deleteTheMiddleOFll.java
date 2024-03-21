package LinkedListMine;

public class deleteTheMiddleOFll {
     static void display(Node head) {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
     static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    static Node deleteMiddle(Node head){
         if(head.next == null || head.next.next==null){
             return null;
         }
         Node slow = head;
         Node fast = head;
         while(fast.next.next != null && fast.next.next.next!=null){
             slow = slow.next; //x
             fast = fast.next.next; // 2x
         }
         slow.next = slow.next.next; // delete kar bhai!
         return head;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(7);
        Node d = new Node(4);
        Node e = new Node(2);
        Node f = new Node(8);
        a.next = b; // connection hua bhai
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        deleteMiddle(a);
        display(a);
    }
}
