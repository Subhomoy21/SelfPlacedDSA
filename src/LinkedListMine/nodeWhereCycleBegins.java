package LinkedListMine;

public class nodeWhereCycleBegins {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    static Node detectCycle(Node head) {
        if(head == null || head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next; //x
            fast = fast.next.next; // 2x
            if(slow == fast){
                break;
            }
        }
        Node temp = head; // starting from head
        while(slow != temp){
            temp = temp.next;
            if(slow.next == null ){
                return null;
            }
            slow = slow.next;
            //  slow aur temp ek ek barega aur jab dono meet karega woh hi hoga node where cycle begins
        }
        return slow;
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
        Node temp = detectCycle(a);
        System.out.println(temp.data);
    }
}
