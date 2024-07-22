package listInterfaces;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class LearnLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2  = new LinkedList<>();

        list.add(12);
        list.add(10);
        list.add(50);

        list2.add(14);
        list2.add(4);
        list2.add(8);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(50));
        list.remove(Integer.valueOf(1));
        System.out.println(list);

        list.addAll(list2);
        System.out.println(list);

        list2.clear();
        System.out.println(list2);

        Object a[] = list.toArray();
        for(Object e : a){
            System.out.println(e);
        }
        System.out.println(Arrays.toString(a));
    }
}
