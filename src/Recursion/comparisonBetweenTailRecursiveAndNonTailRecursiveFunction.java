package Recursion;

public class comparisonBetweenTailRecursiveAndNonTailRecursiveFunction {
    //not tail recursive
    static int  fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * (fact(n-1));
    }
    // tail recursion - said to be following tail recursion if it invokes itself at the end of the function .
    // tail recursion
    static int fact2(int n,int k){
        //initially pass k=1;
        if(n==0 || n==1){
            return k;
        }
        return fact2(n-1,k*n);
    }
    public static void main(String[] args) {
        System.out.println(fact(4)); // slower than tail recursion..
        System.out.println(fact2(4,1)); // optimized by modern compiler and they take less time and less auxillary space compare to equivalent non tail recursive functions.
    }
}
