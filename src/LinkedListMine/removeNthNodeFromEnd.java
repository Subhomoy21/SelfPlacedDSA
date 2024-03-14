package LinkedListMine;

public class removeNthNodeFromEnd {
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
    static void removeNthFromEnd(Node head , int n){
        Node slow = head;
        Node fast = head;
        for(int i = 0;i<n;i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
         //8->12->6 -------> 8->6 // 12 delete hua!
    }
    static Node removeNthFromEndopt(Node head , int n){
        Node slow = head;
        Node fast = head;
        for(int i = 1;i<=n;i++){
            fast = fast.next;
        }
        if(fast==null){
            head = head.next;
            return head;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
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
        d.next  = e;
        e.next = f;
        display(a);
        //removeNthFromEnd(a,2);
      //  display(a);
      //  removeNthFromEnd(a,6); // arre arre error aa giya!
        a = removeNthFromEndopt(a,6);
        display(a);
    }
}
