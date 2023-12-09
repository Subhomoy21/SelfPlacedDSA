package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CountDistinctinArrayList {
     static int countDistinct(ArrayList<Integer> numbers){

        //ArrayList<Integer> al = new ArrayList<Integer>();
        int count = 0;
        for(int i=0;i<numbers.size();i++){
            int val = numbers.get(i);
            if(i==numbers.lastIndexOf(val)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(10);
        al.add(5);
        al.add(1);
        al.add(100);
        System.out.println(countDistinct(al));
    }
}
