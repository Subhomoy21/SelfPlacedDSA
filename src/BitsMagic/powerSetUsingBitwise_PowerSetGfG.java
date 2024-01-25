package BitsMagic;
import java.util.*;
public class powerSetUsingBitwise_PowerSetGfG {
    static List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> l = new ArrayList<>();
        int n = s.length();
        int powSize = (int) Math.pow(2,n); // or(1<<n)
        for(int i = 1; i<powSize;i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j<n ;j++){
                if((i & (1<<j)) !=0 ){
                    sb.append(s.charAt(j));
                }
            }
            l.add(sb.toString());
        }
        Collections.sort(l);
        return l;
    }
    public static void main(String[] args) {
    List<String> l = AllPossibleStrings("abc");
        System.out.println(l);
    }
}
