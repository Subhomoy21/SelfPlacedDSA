package CoreAdvanced;

import java.math.BigInteger;

public class CheckForPrimeBigInteger {
    // using proper function -> isProbablePrime(int certainty)
    static boolean isPrime(int n){
        BigInteger p = BigInteger.valueOf(n);
        return p.isProbablePrime(1);
    }
    // using BigInteger but not using function
     static boolean prime(int n){
        if(n==0||n==1){
            return false;
        }
        for(int i = 2;i<n;i++){
            if((BigInteger.valueOf(n).mod(BigInteger.valueOf(i))).equals(new BigInteger("0"))){ // basically it means n%i==0.
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(prime(7));
    }
}
