package JavaFoundationString;

import java.util.Arrays;

public class PanagramChecking {
    static boolean isPanagram(String s) {
        //https://leetcode.com/problems/check-if-the-sentence-is-pangram/ Leetcode link!
        int n = s.length();
        if (n < 26)
            return false;
        boolean visited[] = new boolean[26];

        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);

            if (x >= 'a' && x <= 'z') {
                visited[x - 'a'] = true;
            }

            if (x >= 'A' && x <= 'Z') {
                visited[x - 'A'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (visited[i] == false)
                return false;
        }

        return true;
    }
    // one more way
//     if(sentence.length()<26){
//        return false;
//    }
//     for(char val='a';val<='z';val++){
//        if(!sentence.contains(String.valueOf(val))){
//            return false;
//        }
//    }
//   return true;
// }
    public static void main(String[] args) {
        // default value of boolean array is false.
//        boolean visited[] = new boolean[26];
//        System.out.println(Arrays.toString(visited));
        String str = "Thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPanagram(str));
    }
}
