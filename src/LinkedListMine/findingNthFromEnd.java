package LinkedListMine;

public class findingNthFromEnd {
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
    static Node findingNthNodeBrute(Node head , int n){
        // find the size first
        int length = 0;
        Node temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        // for calculating the pos from end -> we have to imagine it from the head
        int m = length - n + 1;
        // mth node from start(head)
        temp = head;
        for (int i = 0; i < m-1; i++) {
            temp = temp.next;
        }
        return temp;
    }
    static Node findingNthNodeopt(Node head , int n){
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
         Node a = new Node(5);
         Node b = new  Node(3);
         Node c = new  Node(7);
         Node d = new  Node(4);
         Node e = new  Node(2);
        Node f = new Node(8);
        a.next = b; // connection hua bhai
        b.next = c;
        c.next = d;
        d.next  = e;
        e.next = f;
        Node temp = findingNthNodeBrute(a,3);
        System.out.println(temp.data);
        Node temp1 = findingNthNodeopt(a,3);
        System.out.println(temp1.data);
    }
}
