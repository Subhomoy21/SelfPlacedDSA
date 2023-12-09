package ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("geeks");
        al.add("for");
        al.add("geeks");
        System.out.println(al);
        al.add(1,"are preparing");
        System.out.println(al);
        al.contains("are");
        System.out.println(al);
        al.remove("preparing");
        System.out.println(al);
        System.out.println("______________________________________________________________________________________________________________");
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        System.out.println(al1.get(0));
        al1.set(1,50);
        System.out.println(al1.get(1));
        System.out.println(al1.indexOf(30));
        System.out.println(al1.lastIndexOf(10));
        System.out.println("_______________________________________________________________________________________________________________");
        ArrayList<Character> al2 = new ArrayList<Character>();
        al2.add('a');
        al2.add('b');
        al2.add('c');
        al2.add('d');
        System.out.println(al2.isEmpty());
        al2.clear();
        System.out.println(al2);
        System.out.println(al2.isEmpty());

    }
}
