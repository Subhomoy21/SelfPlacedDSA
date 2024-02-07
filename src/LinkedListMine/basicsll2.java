package LinkedListMine;

public class basicsll2 {
    public static void display(Node head){ // isse ll toh display ho jayega but yeh technically wrong hai
        while(head!=null){ // so better to use temp instead of using direct head node
            System.out.print(head.data + " "); // isme head gaya head is not preserved
            head = head.next;
        }
    }
    public static void displayWithTemp(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void displayRecursively(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data + " ");
        displayRecursively(head.next);
    }
    public static void displayReverseListUsingRecursion(Node head){
        if(head == null){
            return;
        }
        displayReverseListUsingRecursion(head.next);
        System.out.print(head.data + " ");
    }
    public static int length(Node head){
        int length = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        return length;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
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
        System.out.println();
        displayWithTemp(a);
        System.out.println();
        displayRecursively(a);
        System.out.println();
        displayReverseListUsingRecursion(a);
        System.out.println();
        System.out.println(length(a));
    }
}
