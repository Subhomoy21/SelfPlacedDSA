package LinkedListMine;

public class mergeTwoSortedLl {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node merge2SortedListWithSpace(Node list1, Node list2){ // list(1,2)->head hai do ll ka
        Node temp1 = list1;
        Node temp2 = list2;
        Node head = new Node(100); // naya ll jisme insert karenge sab
        Node temp = head;
        while(temp1 != null && temp2 != null){
            if(temp1.data < temp2.data){
                Node a = new Node(temp1.data);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            }
            else{
                Node a = new Node(temp2.data);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
        }
        if(temp1 == null){
            temp.next = temp2;
        }
        else{
            temp.next = temp1;
        }
        return head .next;
    }
    static Node mergeWithoutSpace(Node head1,Node head2){
            Node temp1 = head1;
            Node temp2 = head2;
            Node head = new Node(100);
            Node temp  = head;
            while(temp1 != null && temp2!= null){
                if(temp1.data<temp2.data){
                    temp.next = temp1;
                    temp = temp1;
                    temp1 = temp1.next;
                }
                else{
                    temp.next = temp2;
                    temp = temp2;
                    temp2 = temp2.next;
                }
            }
            if(temp1 == null){
                temp.next = temp2;
            }
            else{
                temp.next = temp1;
            }
            return head.next;
        }

    public static void main(String[] args) {
        Node a1 = new Node(1);
        Node b1 = new Node(3);
        Node c1 = new Node(5);
        Node d1 = new Node(8);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;

        Node a2 = new Node(2);
        Node b2 = new Node(4);
        Node c2 = new Node(6);
        Node d2 = new Node(7);
        a2.next = b2;
        b2.next = c2;
        c2.next = d2;

        Node temp = merge2SortedListWithSpace(a1,a2);
        display(temp);
        Node temp1 = mergeWithoutSpace(a1,a2);
        display(temp1);
    }
}
