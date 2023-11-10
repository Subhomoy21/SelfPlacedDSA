package JavaFoundationString;

import java.util.Scanner;

public class lengthOfString {
    static int sizeOfString(String s){
       char[] str = s.toCharArray();
       int size = 0;
        for (int i = 0;i<str.length;i++){
            size++;
        }
        return size;
    }
    public static void main(String[] args) {
//       sout
        System.out.println(sizeOfString("Subhomoy"));
    }
}
