package JavaFoundationString;

public class reverseOfAString {
    static String reverse(String s){
        String str = "";
        int i = s.length()-1;
        while(i>=0){
            str = str + s.charAt(i);
            i--;
        }
        return  str;
    }
    public static void main(String[] args) {
        System.out.println(reverse("Subhomoy"));
    }
}
