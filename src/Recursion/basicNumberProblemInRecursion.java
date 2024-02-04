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
    static int sum(int n){ // n = 4 {1+2+3+4 = 10}
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(nthFibonacci(3));
        System.out.println(sum(4));
    }
}
