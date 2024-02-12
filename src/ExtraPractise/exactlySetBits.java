package ExtraPractise;

public class exactlySetBits {
    static int count(int n){
       int res = 0;
       if(n==0){
           return 0;
       }
       while(n>0){
           n = n & (n-1); // brian kerningams algo applied
           res++;
       }
        return res;
    }
    static int exactlySetBitInTheRangeOfN(int n , int k){
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(count(i)==k){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(count(3));
        System.out.println(exactlySetBitInTheRangeOfN(7,2));
    }
}
