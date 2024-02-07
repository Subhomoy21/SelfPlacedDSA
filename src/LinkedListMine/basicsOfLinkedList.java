package LinkedListMine;

public class basicsOfLinkedList {
    public static class Node{
        int data; // value
        Node next; // address of next node
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        //     Node x = new Node();
//        System.out.println(x.data);
//        System.out.println(x.next);
        Node a = new Node(5); // head node
        System.out.println(a.next); // null
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(6);
        Node e = new Node(8);
        // 5->5->4->6->8
        a.next = b; //5->5 4 6 8
        b.next = c; //5->5->4 6 8
        c.next = d; // 5->5->4->6 8
        d.next = e; //5->5->4->6->8 (finally connected)
//        System.out.println(a.next); //LinkedListMine.basicsOfLinkedList$Node@1b28cdfa
//        System.out.println(b); //LinkedListMine.basicsOfLinkedList$Node@1b28cdfa
//        System.out.println(b.data); // one process to print data of b
//        System.out.println(a.next.data); //another process to print data of b
//        1. to display linked list
//        System.out.println(a.data);
//        System.out.println(b.data);
//        System.out.println(c.data);
//        System.out.println(d.data);
//        System.out.println(e.data);
//        2. to display linked list process(2)
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);
//        3.to display linked list process(3) using loop
        Node temp = a;
        for (int i = 0; i < 5 ; i++) { // isme hume linked list ka size pata tha isliye i=0 se i<=5
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
//        4. to display linked list but in these case we dont know the size of ll
        Node temp1 = a;
        while(temp1 !=null){
            System.out.println(temp1.data + " ");
            temp1 = temp1.next;
        }
    }
}
