package JavaFoundationString;

public class Palindrome {
     static boolean isPal(String s){
        int st = 0;
        int end =s.length()-1;
        while(end>st){
            if(s.charAt(st) != s.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPal("abba"));
    }
}
