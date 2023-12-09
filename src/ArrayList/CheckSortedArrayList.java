package ArrayList;

import java.util.ArrayList;

public class CheckSortedArrayList {
    public static boolean isSorted(ArrayList<Integer> numbers){
        boolean asc = true;
        boolean dsc = true;

        for(int i=1;i<numbers.size();i++){
            if(numbers.get(i) < numbers.get(i-1)){
                asc = false;
            }
            if(numbers.get(i) > numbers.get(i-1)){
                dsc = false;
            }
        }
        return asc || dsc;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(10);
        al.add(5);
        al.add(1);
        al.add(100);
        System.out.println(isSorted(al));
    }
}
