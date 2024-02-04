package Recursion;

public class basicNumberProblemInRecursion {
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n * fact(n-1);
    }
    static int nthFibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(nthFibonacci(3));
    }
}
