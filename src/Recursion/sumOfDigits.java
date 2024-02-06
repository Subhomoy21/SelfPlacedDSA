package Recursion;

public class sumOfDigits {
    static int sod(int n){
        if(n==0 || n<10){
            return n;
        }
        return n%10 + sod(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sod(4565));
    }
}
