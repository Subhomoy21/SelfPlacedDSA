package Recursion;
//https://leetcode.com/problems/find-the-winner-of-the-circular-game/
public class josephusProblem {
    static int josephus(int n, int k) {
        return jos(n,k) + 1;
    }
    static int jos(int n, int k){
        if(n==1){
            return 0;
        }
        else{
            return  (jos(n-1,k) + k)%n;
        }
    }
    public static void main(String[] args) {
        System.out.println(josephus(5,3)); // when the n starts from 1;
        System.out.println(jos(5,3));
    }
}
