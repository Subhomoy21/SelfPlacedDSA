package LinkedListMine;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedList{ // yeh ek entire data structure hai!
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
             if(head==null){ // empty list
                head = temp;
             }
             else{ // non-empty list
                 tail.next = temp;
             }
            tail = temp;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        int size(){ // 0(n)
            int size = 0;
            Node temp = head;
            while(temp!=null){
                temp = temp.next;
                size++;
            }
            return size;
        }
        void insertAtBegin(int val){
            Node temp = new Node(val);
            if(head == null){ // empty list
                head = temp;
                tail = temp;
                // head = tail = temp
            }
            else{ // non-empty list
                temp.next = head;
                head = temp;
            }
        }
        void insertAt(int data,int i){
            Node t = new Node(data); // new node jo insert hoga!
            Node temp = head;
            if (i == size()){
                insertAtEnd(data);
                return;
            }
            if(i == 0){
                insertAtBegin(data);
                return;
            }
            for (int j = 0; j < i-1; j++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        int getElement(int idx){
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
           return temp.data;
        }
    }
    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.insertAtBegin(10);
        l.insertAtEnd(4);
        l.insertAtEnd(5);
        l.insertAtEnd(6);
        l.display();
        System.out.println("\n" + l.size());
        l.insertAtEnd(12);
        l.display();
        System.out.println();
        l.insertAtBegin(65);
        l.display();
        System.out.println();
        l.insertAt(6,2);  // but ek bug hai agar last ele ko access karna chaha nhi hoga!
        l.display();
        System.out.println();
        l.insertAt(10,7);// data jo print hoga tail ka age wala print hoga!
        l.display();
        System.out.println();
        System.out.println(l.tail.data);
        System.out.println(l.getElement(2));
    }
}
