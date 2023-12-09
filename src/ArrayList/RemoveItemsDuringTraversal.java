package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveItemsDuringTraversal {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(5);
        al.add(30);
        Iterator it = al.iterator();
        while(it.hasNext()){
            int x = (Integer)it.next();
            if(x<10){
                it.remove();
            }
            else{
                System.out.println(x);
            }
        }
    }
}
