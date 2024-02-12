package Recursion;

public class towerOfHanoi {
    static void toh(int n , int source , int helper ,int des){ // here the helper is basically used as a auxillary rod
        if(n==1){ // ek hi disc hai normally source se des mein dal do
            System.out.println("move disc "+n+" from "+source+" to "+des);
            return;
        }
        toh(n-1,source,des,helper); // isme helper des hai kyuki n-1 discs ko helper mein dal na hai
        System.out.println("move disc " + n + " from " + source + " to "+ des);
        toh(n-1,helper,source,des);
    }
    public static void main(String[] args) {
        toh(3,1,2,3);
    }
}
