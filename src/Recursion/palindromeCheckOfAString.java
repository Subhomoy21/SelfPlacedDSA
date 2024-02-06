package Recursion;

public class palindromeCheckOfAString {
    static boolean isPal(String s,int start ,int end){
    if(start>=end){
        return true;
    }
    return (s.charAt(start)==s.charAt(end) && isPal(s,start+1,end-1));
    }
    public static void main(String[] args) {
        System.out.println(isPal("abba",0,"abba".length()-1));
        System.out.println(isPal("Subhomoy",0,"Subhomoy".length()-1));
    }
}
