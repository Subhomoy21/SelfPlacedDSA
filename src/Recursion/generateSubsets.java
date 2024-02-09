package Recursion;

import java.util.ArrayList;
//s = abc
//Output: a ab abc ac b bc c
//Explanation: empty string,
//a, ab, abc, ac, b, bc, c
//are the sets.

public class generateSubsets { // Power Set Using Recursion(gfg)
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        ArrayList<String> ans = new ArrayList<>();
        generate(ans,s,0,"");
        return ans;
    }
    static void generate(ArrayList<String> res , String s, int i, String curr){
        if(i== s.length()){
            res.add(curr);
            return;
        }
        generate(res,s,i+1,curr);
        generate(res,s,i+1,curr+s.charAt(i));
    }
    // generate subsets,subsequences
    static void printSub(String str, String curr , int i){
        if(i==str.length()){
            System.out.print(curr + " ");
            return;
        }
        printSub(str,curr,i+1);
        printSub(str,curr + str.charAt(i),i+1);
    }
    public static void main(String[] args) {
        printSub("ABC","",0);
        System.out.println();
        ArrayList<String> ans = powerSet("ABC");
        System.out.println(ans);

    }
}
