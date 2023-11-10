package JavaFoundationString;
//https://leetcode.com/problems/defanging-an-ip-address/description/
public class DefangingAnIPAddress {
    static String defangIPaddr(String s) {
        int i = 0;
        String ans = "";
        while(i<s.length()){
            if(s.charAt(i)=='.'){
                ans = ans + "[.]";
            }
            else{
                ans = ans + s.charAt(i);
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
    String str  = "255.100.50.0";
        System.out.println(defangIPaddr(str));
    }
}
