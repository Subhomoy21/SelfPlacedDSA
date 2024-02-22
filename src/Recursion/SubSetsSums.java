package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//https://www.geeksforgeeks.org/problems/subset-sums2234/1?page=1&category%5B%5D=Recursion&sortBy=submissions&utm_source=youtube&utm_medium=collab_codefromscratch_description&utm_campaign=recursionsandsort
public class SubSetsSums {
    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        helper(arr,ans,0,N,0);
        Collections.sort(ans);
        return ans;
    }
    static void helper(ArrayList<Integer> arr, ArrayList<Integer> ans, int idx, int n , int currSum){
        if(idx == n){
            ans.add(currSum);
            return;
        }
        // include
        helper(arr,ans,idx + 1,n, currSum + arr.get(idx));

        // exclude
        helper(arr,ans,idx + 1,n,currSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("enter the size of elements in arraylist:");
        int size = sc.nextInt();
        System.out.println("enter the elements in arraylist:");
        for (int i = 0; i < size ; i++) {
            arr.add(sc.nextInt());
        }
        for(Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        ArrayList<Integer> ans = subsetSums(arr,arr.size());
        System.out.println(ans);
    }
}
