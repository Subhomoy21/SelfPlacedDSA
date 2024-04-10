package LinkedListMine;

public class removeDuplicatesInSortedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
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
    static Node removeDupli(Node head){
        Node temp = head;
        while(temp != null && temp.next !=null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(1);
        Node c=new Node(8);
        Node d=new Node(8);
        Node e=new Node(8);
        Node f=new Node(22);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node temp = removeDupli(a);
        display(temp);
    }
}
