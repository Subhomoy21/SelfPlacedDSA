package ExtraPractise;

import java.util.Scanner;

public class encryptionDecryptionText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            String s = sc.nextLine();
            // char[]arr = s.toCharArray();
            String str = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                char add = (char)(ch + 3);
                str = str + add;
                if(ch>'x'){
                    add =(char)(ch - 26);
                    str = str + add;
                }
            }
            System.out.println(str +  "");
        }
       while (true);
    }
}
