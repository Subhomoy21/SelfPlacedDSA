package ArrayList;

import java.util.ArrayList;

// Given an ArrayList arr of N positive integers. The task is to find the maximum for every adjacent pairs in the ArrayList.
//Example 1:
//Input: 6
//1 2 2 3 4 5
//Output:
//2 2 3 4 5
//Explanation:
//Maximum of arr[0] and arr[1] is 2, that of arr[1] and arr[2] is 2, ... and so on. For last two elements, maximum is 5.
public class maximumNeighboursInArraylist {
     static ArrayList<Integer> maxNeighbour(ArrayList<Integer>arr){
        //Your code here
        ArrayList<Integer> neighbour = new ArrayList<>();
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                neighbour.add(arr.get(i));
            }
            else{
                neighbour.add(arr.get(i+1));
            }
        }
        return neighbour;
    }
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    ArrayList<Integer> l1 = maxNeighbour(list);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
    }
}
