package Recursion;

public class importanceOfBaseCase {
    // direct recursion without basecase
    static void fun1(){
        System.out.println("GFG");
        fun1();
    }
    // modified direct recursion with base case
    static void fun1(int n){
        if(n==0){
            return;
        }
        System.out.println("gfg");
        fun1(n-1);
    }
    public static void main(String[] args) {
     //   fun1(); // it will produce stack overflow error
        fun1(2); // here the output will be gfg gfg
    }
}
