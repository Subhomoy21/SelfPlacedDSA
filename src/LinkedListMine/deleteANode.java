package LinkedListMine;

public class deleteANode {
    public static void displayWithTemp(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
            }
    }
    static void delete(Node node){
        node.data = node.next.data;
        node.next = node.next.next;
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
        System.out.println("The Linked list before deletion:");
        displayWithTemp(a);
        delete(d);
        System.out.println("The Linked list after deletion:");
        displayWithTemp(a);
    }
}
