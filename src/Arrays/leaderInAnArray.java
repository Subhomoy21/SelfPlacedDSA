package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class leaderInAnArray {
    // important question
    static void leaders(int [] arr){
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            boolean check = false;
            for (int j = i+1; j <n ; j++) {
                if(arr[i] <= arr[j]){
                    check = true;
                    break;
                }
            }
            if(check == false){
                System.out.print(arr[i] + " ");
            }
        }
    }
    // efficient solution
    static ArrayList<Integer> leadersIn(int [] arr){
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        int arrLdr = arr[n-1];
        res.add(arrLdr);
        for (int i = n-2; i >= 0 ; i--) {
            if(arr[i]>arrLdr){
                arrLdr = arr[i];
                res.add(arrLdr);
            }
        }
        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args) {
        leaderInAnArray leader = new leaderInAnArray(); // first time printing the o/p using the class
        int [] a = {7,10,4,3,6,5,2};
        leader.leaders(a);
        System.out.println();
        ArrayList<Integer> ans = leadersIn(a);
        System.out.println(ans);
    }
}
