package JavaFoundationString;
//https://leetcode.com/problems/longest-palindrome/description/
public class longestPalindrome {
    static int longestPalindrome(String s) {
        int [] lower = new int [26];
        int [] upper = new int [26];
        // frequency of character in the string
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'a'){
                lower[ch-'a']++; // for getting index(acting as frequency array)
            }
            else{
                upper[ch-'A']++;
            }
        }
        int count = 0;
        boolean odd = false;
        for(int i = 0;i<26;i++){
            // for lower checking
            if(lower[i]%2==0){
                count = count + lower[i];
            }
            else{
                count =count+ lower[i]-1;
                odd = true;
            }
            // for upper checking
            if(upper[i]%2==0){
                count =count + upper[i];
            }
            else{
                count = count + upper[i]-1;
                odd = true;
            }
        }
        if(odd){
            count=count+1;
        }
        return count;
    }
    public static void main(String[] args) {
    String sr = "abccccdd";
        System.out.println(longestPalindrome(sr));
    }
}
