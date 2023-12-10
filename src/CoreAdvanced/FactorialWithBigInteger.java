package CoreAdvanced;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialWithBigInteger {
    static BigInteger factorial(int n){
        BigInteger f = new BigInteger("1");
        for(int i = 2;i<=n;i++){
            BigInteger x = BigInteger.valueOf(i);
            f = f.multiply(x);
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(factorial(500));

    }
}
