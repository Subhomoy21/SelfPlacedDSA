package LinkedListMine;

import java.util.ArrayList;
import java.util.*;

public class splitListToOddAndEvenList {
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    static ArrayList<Node> OddEvenIn2List(Node head){
        Node e = new Node(100);
        Node tempe = e;
        Node o = new Node(100);
        Node tempo = o;
        Node temp = head;
        while(temp != null){
            if(temp.data % 2 == 0){
                // even
                //Node a = new Node(temp.data);
                tempe.next = temp;
                tempe = temp;
                temp = temp.next;
            }
            else{
                // odd
                //Node b = new Node(temp.data);
                tempo.next = temp;
                tempo = temp;
                temp = temp.next;
            }
        }
        ArrayList list = new ArrayList<>(Arrays.asList(o.next, e.next)); // very important part!
        return list;
    }
    public static void main(String[] args) {
        Node a = new Node(15);
        Node b = new Node(3);
        Node c = new Node(19);
        Node d = new Node(18);
        Node e = new Node(16);
        Node f = new Node(23);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        ArrayList<Node> ans = OddEvenIn2List(a);
        for (Node head : ans) {
            while (head != null) {
                System.out.print(head.data + "->");
                head = head.next;
            }
            System.out.println("null");
        }
    }
}
