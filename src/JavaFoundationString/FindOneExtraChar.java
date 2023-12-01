package JavaFoundationString;

import java.util.Arrays;

public class FindOneExtraChar {
    // using soring
    static char findOneExtra(String s1,String s2){
        char[]a1 = s1.toCharArray();
        char[]a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            if(a1[i]!=a2[i]){
                return a2[i];
            }
        }
        return a2[n];
    }
    //using counting array
     static char extraChar(String s1, String s2){
        int [] count = new int[26];
        int n = s1.length();
        for(int i = 0;i<n;i++){
            count[s1.charAt(i)-'a']--;
            count[s2.charAt(i)-'a']++; // for neutralising the char which are common
        }
        count[s2.charAt(n)-'a']++;
        for(int i = 0;i<26;i++){
            if(count[i] == 1){
                return (char)(i+'a'); // transforming to the character
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        System.out.println(findOneExtra("aabcbc","abbccba"));
        System.out.println(extraChar("aabcbc","abbccba"));
    }
}
