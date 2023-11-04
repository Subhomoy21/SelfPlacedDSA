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
    public static void main(String[] args) {
        System.out.println(trailingZeros1(5));
    }
}
