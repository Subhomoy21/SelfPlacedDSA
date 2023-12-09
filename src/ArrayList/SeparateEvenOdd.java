package ArrayList;

import java.util.ArrayList;

public class SeparateEvenOdd {
     static ArrayList<ArrayList<Integer>> evenOdd(ArrayList<Integer> numbers){
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> combineList = new ArrayList<>();
        for(int i = 0;i<numbers.size();i++){
            if(numbers.get(i)%2==0){
                even.add(numbers.get(i));
            }
            else{
                odd.add(numbers.get(i));
            }
        }
        combineList.add(even);
        combineList.add(odd);
        return combineList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(11);
        al.add(5);
        al.add(12);
        al.add(6);
        al.add(7);
        System.out.println(evenOdd(al));
    }
}
