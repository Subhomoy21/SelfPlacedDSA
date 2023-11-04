package Mathematics;

public class PalindromeNumber {
    static String Palindrome(int n){
        String check = "Yes It is a palindrome Number";
        String check2 = "No It is not a palindrome Number";
        int temp = n;
        int rev = 0;
        while(n>0){
            int ld = n%10;
            rev = rev*10 + ld;
            n = n/10;
        }
        if(rev == temp){
            return check;
        }
       return check2;
    }
    public static void main(String[] args) {
        System.out.println(Palindrome(1233215));
    }
}
