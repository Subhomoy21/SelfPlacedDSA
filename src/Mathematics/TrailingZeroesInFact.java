package Mathematics;

public class TrailingZeroesInFact {
    static int trailingZeros1(int n){
        // naive solution
        // first find factorial
        int res = 1;
        for (int i = 2; i <=n ; i++) {
            res = res * i;
        }
        // second count last zeroes in factorial
        int count = 0;
        while(res%10==0){
            count++;
            res = res/10;
        }
        return count;
    }
    // optimized solution
    static int countTrailing(int n){
        int res = 0;
        for (int i = 5; i <= n ; i= i*5) {
            res = res + n/i;
        }
        return res;
    }
    public static void main(String[] args) {

        System.out.println(trailingZeros1(5));
        System.out.println(countTrailing(5));
    }
}
