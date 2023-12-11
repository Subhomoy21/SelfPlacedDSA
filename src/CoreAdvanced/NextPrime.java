package CoreAdvanced;

import java.math.BigInteger;

public class NextPrime {
    static int  nextPrime(int n ){
        BigInteger b = BigInteger.valueOf(n);
        String s = b.nextProbablePrime().toString();
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        System.out.println(nextPrime(7));
    }
}
