package BitsMagic;

public class BitwiseAndXorOr {
    public static void main(String[] args) {

        int x = 3;
        int y = 6;
        System.out.println(x&y);// Bitwise AND(&)
        System.out.println(x|y);// Bitwise OR
        System.out.println(x^y);//Bitwise XOR
        System.out.println(~x);// Bitwise Not
        System.out.println(x<<1);//Bitwise left shift
        int z = -2;
        System.out.println(z<<1); // if value is -1 then
        System.out.println(x>>1); //Bitwise Signed right shift
        System.out.println(z>>1); // if z is negative!
        System.out.println(z>>>1);// Bitwise Unsigned Right Shift
    }
}
