package JavaFoundationString;

public class ReverseString {
    static String reverse(String s){
        char str[] = s.toCharArray();
        int st = 0;
        int end = str.length-1;
        while(end>st){
            char temp = str[st] ;
            str[st] = str[end];
            str[end] = temp;
            st++;
            end--;
        }
        return new String(str);
    }
    public static void main(String[] args) {
        System.out.println(reverse("Subhomoy"));
    }
}
