package CoreAdvanced;

import java.math.BigInteger;
//BigInteger class is used for the mathematical operation which
// involves very big integer calculations that are outside the limit of all available primitive data types.
//In this way, BigInteger class is very handy to use because of its large method
// library and it is also used a lot in competitive programming.

public class BasicsOfBigInteger {
    public static void main(String[] args) {
        BigInteger A = new BigInteger("54");
        System.out.println(A);
        String b = "12345567";
        BigInteger B = new BigInteger(b);
        System.out.println(B);
        int c = 12456;
        BigInteger C = BigInteger.valueOf(c);
        System.out.println(C);

        // sum,multiplication, division,subtraction of two BigInteger
        BigInteger a1 = new BigInteger("543211236556665556");
        BigInteger a2 = new BigInteger("5454879989846464");
        //addition
        BigInteger b1 = a1.add(a2);
        //multiply
        BigInteger b2 = a1.multiply(a2);
        //subtract
        BigInteger b3 = a1.subtract(a2);
        //divide
        BigInteger b4 = a1.divide(a2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        // remainder operation
        BigInteger s1 = new BigInteger("48625");
        BigInteger s2 = new BigInteger("2");
        BigInteger res = s1.remainder(s2);
        System.out.println(res);

    }
}
