package LinkedListMine;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

  class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        next = null;
    }
}
    class LinkedList {
    public Node head = null, tail = null;
    public void insert(int val) {
        if (head == null) {
            head = tail = new Node(val);
            return;
        }
        tail.next = new Node(val);
        tail = tail.next;
    }
    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null)
                System.out.print("->");
            curr = curr.next;
        }
    }
}
public class confusionAndLearning {
    public static ArrayList<Node> splitList(Node head) {
        Node odd = new Node(0);
        Node even = new Node(0);
        Node oddHead = odd, evenHead = even;
        while (head != null) {
            Node next = head.next;
            head.next = null;
            if (head.data % 2 == 1) {
                odd.next = head;
                odd = odd.next;
            } else {
                even.next = head;
                even = even.next;
            }
            head = next;
        }
        ArrayList list = new ArrayList<>(Arrays.asList(oddHead.next, evenHead.next));
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList ll = new LinkedList();
        for (int i = 0; i < n; i++) {
            ll.insert(sc.nextInt());
        }
        ArrayList<Node> ans = splitList(ll.head);
        for (Node head : ans) {
            while (head != null) {
                System.out.print(head.data + "->");
                head = head.next;
            }
            System.out.println("null");
        }
    }
}
