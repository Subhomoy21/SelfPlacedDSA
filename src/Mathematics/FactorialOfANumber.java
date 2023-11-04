package Mathematics;

public class FactorialOfANumber {
    static int fact(int n){ // iterative
        int res = 1;
        if(n==1){
            return 1;
        }
        for (int i = 2; i <=n ; i++) {
            res = res * i;
        }
        return res;
    }
    static int factRes(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }
        // recurrence relation
        return factRes(n-1) * n;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(factRes(5));
    }
}
