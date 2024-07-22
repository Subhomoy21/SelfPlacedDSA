package LinkedListMine;

public class findingIntersection2ll {
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
     static Node getIntersectionNode(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;
        int lenA= 0;
        while(tempA != null){
            tempA = tempA.next;
            lenA++;
        }
        int lenB = 0;
        while(tempB != null){
            tempB = tempB.next;
            lenB++;
        }
        tempA = headA;
        tempB = headB;
        // check karo konsa list barra hai
        // uska baad slow fast pointer lago
        if(lenB>lenA){
            int size = lenB - lenA;
            for(int i = 1;i<=size;i++){
                tempB = tempB.next;
            }
        }
        else{
            int size = lenA - lenB;
            for(int i = 1;i<=size;i++){
                tempA = tempA.next;
            }
        }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
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
        Node a1 = new Node(5);
        Node b1 = new Node(9);
        a1.next = b1; // connection hua bhai
        b1.next = c;
        display(a);
        display(a1);
        Node temp = getIntersectionNode(a,a1);
        System.out.println(temp.data);

    }
}
