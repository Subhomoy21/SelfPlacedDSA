package LinkedListMine;

public class isPalindrome {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void printReverse(Node head){
        Node temp = head;
        if(temp == null){
            return;
        }
        printReverse(temp.next);
        System.out.println(temp.data);
    }
    public static boolean isPal(Node head1 , Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null && temp2 != null){
            if(temp1.data != temp2.data){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
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
        printReverse(a);
        Node temp = a;
        boolean res = isPal(a , temp);
        System.out.println(res);
        if(res){
            System.out.println("The ");
        }
//        Node a1 = new Node(5);
//        Node b1 = new Node(3);
//        Node c1 = new Node(7);
//        Node d1 = new Node(4);
//        Node e1 = new Node(2);
//        Node f1 = new Node(8);
//        a1.next = b1; // connection hua bhai
//        b1.next = c1;
//        c1.next = d1;
//        d1.next = e1;
//        e1.next = f1;

    }
}
