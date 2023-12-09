package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraversal {
    public static void main(String[] args) {
        // different ways to traverse an arraylist
        //1. using get()
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        //2. using for each loop
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("gfg");
        al1.add("for");
        al1.add("gfg");
        for(String s : al1){
            System.out.print(s + " ");
        }
        System.out.println();
        //3.using iterator
        ArrayList<String> s = new ArrayList<String>();
        s.add("gfg");
        s.add("for");
        s.add("gfg");
        Iterator it  = s.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        // using the forEachMethod() :
        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(10);
        i.add(20);
        i.add(30);
        i.forEach(x-> System.out.print(x + " "));
    }
}
