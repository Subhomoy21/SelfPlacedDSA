package LinkedListMine;

public class detectLoopInLinkedList {
     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    static boolean detectLoop(Node head){
         if(head == null || head.next == null){
             return false;
         }
         Node slow = head;
         Node fast = head;
         while(fast != null){
             if(slow == null){
                 return false;
             }
             slow = slow.next;
             if(fast.next == null){
                 return false;
             }
             fast = fast.next.next;
             if(slow == fast){
                 return true;
             }
         }
         return false;
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(-4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;
        System.out.println(detectLoop(a));
    }
}
