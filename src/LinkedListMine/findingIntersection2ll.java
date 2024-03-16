package LinkedListMine;

public class findingIntersection2ll {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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
        d.next  = e;
        e.next = f;
        Node a1 = new Node(5);
        Node b1 = new Node(3);
        Node c1 = new Node(7);
        Node d1 = new Node(4);
        a1.next = b1; // connection hua bhai
        b1.next = c1;
        c1.next = d1;


    }
}
