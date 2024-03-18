package LinkedListMine;

public class middleElementOfLinkedList {
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
    static Node middleOfNodeRightMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node middleOfNodeLeftMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
        Node temp = middleOfNodeRightMiddle(a);
        System.out.println(temp.data);
        Node run = middleOfNodeLeftMiddle(a);
        System.out.println(run.data);
    }
}
