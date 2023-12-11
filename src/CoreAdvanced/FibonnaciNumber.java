package CoreAdvanced;

import java.math.BigInteger;
public class FibonnaciNumber {
     static BigInteger fib(int n){

        //write your code here
        //return nth fibonacci number in BigInteger
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        for(int i = 2;i<=n;i++){
            c = a.add(b);
            a = b;
            b = c;
        }
        return b;

    }
    public static void main(String[] args) {
        BigInteger ans = fib(5);
        System.out.println(ans);
    }
}
